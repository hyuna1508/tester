package com.fivevsone.cookbook.dao;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fivevsone.cookbook.inter.MemberDAO;
import com.fivevsone.cookbook.inter.MemberService;
import com.fivevsone.cookbook.vo.MemberVO;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	MemberDAO dao;


	@Override
	public List<MemberVO> selectAllMember() {
		return dao.selectAllMember();
	}


	@Override
	public MemberVO selectOneMember(int memCode) {
		return dao.selectOneMember(memCode);
	}
	
	@Override
	public MemberVO loginCk(MemberVO vo, HttpSession session) {
		MemberVO result=dao.loginCk(vo);
		return result;
	}
	
	@Override
	public int idck(MemberVO vo) {
		int result=dao.idck(vo);
		return result;
	}

	@Override
	public void logout(HttpSession session) {
		session.invalidate();
	}

	@Override
	public void joinMember(MemberVO vo) {
		dao.joinMember(vo);
	}
	
	@Override
	public MemberVO selectMember(MemberVO vo) {
		return dao.selectMember(vo);		
	}


	@Override
	public void updateMember(MemberVO vo) {
		dao.updateMember(vo);
	}


	@Override
	public void deleteMember(MemberVO vo) {
		dao.deleteMember(vo);
	}


	@Override
	public int pwdCk(MemberVO vo) {
		int result= dao.pwdCk(vo);
		return result;
	}
	

}
