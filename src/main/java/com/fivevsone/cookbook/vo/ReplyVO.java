package com.fivevsone.cookbook.vo;

import java.util.Date;

public class ReplyVO {
	private int replyIndex;
	private int memGrade;
	private int recipeCode;
	private String comments;
	private Date commentTime;
	private String memNickName;
	
	public ReplyVO() {
		super();
	}
	public int getReplyIndex() {
		return replyIndex;
	}
	public void setReplyIndex(int replyIndex) {
		this.replyIndex = replyIndex;
	}
	public int getMemGrade() {
		return memGrade;
	}
	public void setMemGrade(int memGrade) {
		this.memGrade = memGrade;
	}
	public int getRecipeCode() {
		return recipeCode;
	}
	public void setRecipeCode(int recipeCode) {
		this.recipeCode = recipeCode;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Date getCommentTime() {
		return commentTime;
	}
	public void setCommentTime(Date commentTime) {
		this.commentTime = commentTime;
	}
	public String getMemNickName() {
		return memNickName;
	}
	public void setMemNickName(String memNickName) {
		this.memNickName = memNickName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((commentTime == null) ? 0 : commentTime.hashCode());
		result = prime * result + memGrade;
		result = prime * result + ((memNickName == null) ? 0 : memNickName.hashCode());
		result = prime * result + recipeCode;
		result = prime * result + ((comments == null) ? 0 : comments.hashCode());
		result = prime * result + replyIndex;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReplyVO other = (ReplyVO) obj;
		if (commentTime == null) {
			if (other.commentTime != null)
				return false;
		} else if (!commentTime.equals(other.commentTime))
			return false;
		if (memGrade != other.memGrade)
			return false;
		if (memNickName == null) {
			if (other.memNickName != null)
				return false;
		} else if (!memNickName.equals(other.memNickName))
			return false;
		if (recipeCode != other.recipeCode)
			return false;
		if (comments == null) {
			if (other.comments != null)
				return false;
		} else if (!comments.equals(other.comments))
			return false;
		if (replyIndex != other.replyIndex)
			return false;
		return true;
	}
	public ReplyVO(int replyIndex, int memGrade, int recipeCode, String comments, Date commentTime, String memNickName) {
		super();
		this.replyIndex = replyIndex;
		this.memGrade = memGrade;
		this.recipeCode = recipeCode;
		this.comments = comments;
		this.commentTime = commentTime;
		this.memNickName = memNickName;
	}
	@Override
	public String toString() {
		return "ReplyVO [replyIndex=" + replyIndex + ", memGrade=" + memGrade + ", recipeCode=" + recipeCode
				+ ", comments=" + comments + ", commentTime=" + commentTime + ", memNickName=" + memNickName + "]";
	}
	
	
}
