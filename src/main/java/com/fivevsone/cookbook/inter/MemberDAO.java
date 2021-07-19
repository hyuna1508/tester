package com.fivevsone.cookbook.inter;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.fivevsone.cookbook.vo.MemberVO;

public interface MemberDAO {

	public void joinMember(MemberVO vo);
	public List<MemberVO> selectAllMember();
	public MemberVO selectOneMember(int memCode);
	public MemberVO loginCk(MemberVO vo);
	public int idck(MemberVO vo);
	public void logout(HttpSession session);
	MemberVO selectMember(MemberVO vo);
	public void updateMember(MemberVO vo);
	public void deleteMember(MemberVO vo);
	public int pwdCk(MemberVO vo);
}
