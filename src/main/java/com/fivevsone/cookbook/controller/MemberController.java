package com.fivevsone.cookbook.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fivevsone.cookbook.inter.MemberService;
import com.fivevsone.cookbook.vo.MemberVO;

@Controller
@RequestMapping("/cookbook/")
public class MemberController {
	
	
	@Autowired
	MemberService service;

	//회원가입-버튼클릭
	@RequestMapping(value="/step1")
	public String step1() {
		return "step1";
	}
	
	//회원가입-약관동의
	@RequestMapping(value="/step2")
	public ModelAndView step2(@RequestParam(value="agree", defaultValue="false") Boolean agree) {
		if(!agree) { 
			ModelAndView mav= new ModelAndView("/step1");
			return mav;
		}
		ModelAndView mav= new ModelAndView("/step2"); 
		mav.addObject("memberVO", new MemberVO());
		return mav;
	}
	
	//아이디중복체크
		@ResponseBody
		@RequestMapping(value="/idck", method = RequestMethod.POST)
		public int idck(MemberVO vo) {
			int result= service.idck(vo);
			return result;
		}
		
	//회원가입
	@RequestMapping(value="/step3", method = RequestMethod.POST)
	public String joinMember(MemberVO vo) {
		int result= service.idck(vo);
			if(result==1) {
				return "step3";
			}else if(result==0) {
				service.joinMember(vo);
			}
		return "step3";
	}
	
	//로그인
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	
	@RequestMapping(value="/loginCk")
	public ModelAndView loginCk(@ModelAttribute MemberVO vo, HttpSession session) {
		MemberVO result=service.loginCk(vo, session);
		ModelAndView mav= new ModelAndView();
		if(result != null) {
			session.setAttribute("id", result.getMemId());
			session.setAttribute("pwd", result.getMemPwd());
			mav.setViewName("imsi"); 
			mav.addObject("msg", "success"); 
		}else {
			mav.setViewName("login");
			mav.addObject("msg", "fail");
		}
		return mav;
	}
	
	
	//로그아웃
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/"; 
	} 
	
	//회원정보수정
	@RequestMapping(value="/mypage", method = RequestMethod.GET)
	public String myPageview() {
		return "mypage";
	}
	
	@RequestMapping(value="/mypageUpdate", method = RequestMethod.POST)
	public String myPage(MemberVO vo, HttpSession session) {
		System.out.println("vo>"+ vo);
		service.updateMember(vo);
		return "imsi"; 
	}
	
	//회원탈퇴
	@RequestMapping(value="/deleteMemberView", method = RequestMethod.GET)
	public String deleteMemberView() {
		return "deleteMemberView";
	}
	
	@RequestMapping(value="/deleteMember", method = RequestMethod.POST)
	public String deleteMember(MemberVO vo, HttpSession session, RedirectAttributes ra) {
		
		String memId= (String)session.getAttribute("id"); 
		String memPwd= (String)session.getAttribute("pwd");
		
		if(vo.getMemPwd().equals(memPwd)  && vo.getMemId().equals(memId)) {
			service.deleteMember(vo);
			session.invalidate();
		}else {
			return "redirect:deleteMemberView"; 
		}
		return "redirect:/"; 
	}
	
	//비밀번호 체크
	@ResponseBody
	@RequestMapping(value="/pwdCk", method = RequestMethod.POST)
	public int pwdCk(MemberVO vo) {
		int result= service.pwdCk(vo);
		return result;
	}
}
