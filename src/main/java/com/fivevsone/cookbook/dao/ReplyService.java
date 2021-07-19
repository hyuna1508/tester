package com.fivevsone.cookbook.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fivevsone.cookbook.inter.ReplyInterface;
import com.fivevsone.cookbook.vo.ReplyVO;

@Service
public class ReplyService implements ReplyInterface {
	@Autowired
	ReplyDAO dao;
	@Override
	public void insertReply(ReplyVO vo) {
		dao.insertReply(vo);
	}

	@Override
	public void updateReply(ReplyVO vo) {
		dao.updateReply(vo);
	}

	@Override
	public void deleteMemberReply(ReplyVO vo) {
		dao.deleteMemberReply(vo);
	}

	@Override
	public void deleteOneReply(ReplyVO vo) {
		dao.deleteOneReply(vo);
	}

	@Override
	public ReplyVO selectOneReply(ReplyVO vo) {
		return dao.selectOneReply(vo);
	}

	@Override
	public List<ReplyVO> selectAllReply() {
		return dao.selectAllReply();
	}
	
}
