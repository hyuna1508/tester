package com.fivevsone.cookbook.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fivevsone.cookbook.inter.ReplyInterface;
import com.fivevsone.cookbook.vo.ReplyVO;

@Repository
public class ReplyDAO implements ReplyInterface {
	@Autowired
	SqlSession session;
	@Override
	public void insertReply(ReplyVO vo) {
		session.insert("replyNS.insertReply", vo);
	}

	@Override
	public void updateReply(ReplyVO vo) {
		session.update("replyNS.updateReply", vo);
	}

	@Override
	public void deleteMemberReply(ReplyVO vo) {
		session.delete("replyNS.deleteMemberReply", vo);
	}

	@Override
	public void deleteOneReply(ReplyVO vo) {
		session.delete("replyNS.deleteOneReply", vo);
	}

	@Override
	public ReplyVO selectOneReply(ReplyVO vo) {
		return session.selectOne("replyNS.selectOneReply", vo);
	}

	@Override
	public List<ReplyVO> selectAllReply() {
		return session.selectList("replyNS.selectAllReply");
	}

}
