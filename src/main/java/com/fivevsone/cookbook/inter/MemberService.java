package com.fivevsone.cookbook.inter;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.fivevsone.cookbook.vo.MemberVO;

public interface MemberService {
	
	public List<MemberVO> selectAllMember();
	public MemberVO selectOneMember(int memCode);
	public MemberVO loginCk(MemberVO vo, HttpSession session);
	public int idck(MemberVO vo);
	public void logout(HttpSession session);
	public void joinMember(MemberVO vo);
	MemberVO selectMember(MemberVO vo);
	public void updateMember(MemberVO vo);
	public void deleteMember(MemberVO vo);
	public int pwdCk(MemberVO vo);
}
