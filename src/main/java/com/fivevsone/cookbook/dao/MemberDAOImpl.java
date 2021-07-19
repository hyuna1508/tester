package com.fivevsone.cookbook.dao;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fivevsone.cookbook.inter.MemberDAO;
import com.fivevsone.cookbook.vo.MemberVO;

@Repository("memberDAO")
public class MemberDAOImpl implements MemberDAO {
	
	@Autowired
	SqlSession sqlSession;

	@Override
	public void joinMember(MemberVO vo) {
		sqlSession.insert("memberNS.joinMember",vo);	
	}

	@Override
	public List<MemberVO> selectAllMember() {
		return sqlSession.selectList("memberNS.selectAllMember");
	}

	@Override
	public MemberVO selectOneMember(int memCode) {
		return sqlSession.selectOne("memberNS.selectOneMember",memCode);
	}

	@Override
	   public MemberVO loginCk(MemberVO vo) {
	      MemberVO member= sqlSession.selectOne("memberNS.login", vo);
	      return member;
	   }
	
	@Override
	public int idck(MemberVO vo) {
		int result= sqlSession.selectOne("memberNS.idck", vo);
		return result;
	}

	@Override
	public void logout(HttpSession session) {
	}

	@Override
	public MemberVO selectMember(MemberVO vo) {
		return sqlSession.selectOne("memberNS.selectMember", vo);
	}

	@Override
	public void updateMember(MemberVO vo) {
		sqlSession.update("memberNS.updateMember", vo);
	}

	@Override
	public void deleteMember(MemberVO vo) {
		sqlSession.delete("memberNS.deleteMember", vo);
	}

	@Override
	public int pwdCk(MemberVO vo) {
		int result= sqlSession.selectOne("memberNS.pwdCk", vo);
		return result;
	}

}
