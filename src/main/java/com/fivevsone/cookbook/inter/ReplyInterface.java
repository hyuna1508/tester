package com.fivevsone.cookbook.inter;

import java.util.List;

import com.fivevsone.cookbook.vo.ReplyVO;

public interface ReplyInterface {
	public void insertReply(ReplyVO vo);
	public void updateReply(ReplyVO vo);
	public void deleteMemberReply(ReplyVO vo);
	public void deleteOneReply(ReplyVO vo);
	public ReplyVO selectOneReply(ReplyVO vo);
	public List<ReplyVO> selectAllReply();
}
