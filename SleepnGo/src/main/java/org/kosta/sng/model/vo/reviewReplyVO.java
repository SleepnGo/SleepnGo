package org.kosta.sng.model.vo;

public class reviewReplyVO {
	private int reReplyNo;
	private ReviewVO reviewVO;
	private String content;
	private int parentReNo;
	private String reReplyDate;
	public reviewReplyVO(int reReplyNo, ReviewVO reviewVO, String content, int parentReNo, String reReplyDate) {
		super();
		this.reReplyNo = reReplyNo;
		this.reviewVO = reviewVO;
		this.content = content;
		this.parentReNo = parentReNo;
		this.reReplyDate = reReplyDate;
	}
	public int getReReplyNo() {
		return reReplyNo;
	}
	public void setReReplyNo(int reReplyNo) {
		this.reReplyNo = reReplyNo;
	}
	public ReviewVO getReviewVO() {
		return reviewVO;
	}
	public void setReviewVO(ReviewVO reviewVO) {
		this.reviewVO = reviewVO;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getParentReNo() {
		return parentReNo;
	}
	public void setParentReNo(int parentReNo) {
		this.parentReNo = parentReNo;
	}
	public String getReReplyDate() {
		return reReplyDate;
	}
	public void setReReplyDate(String reReplyDate) {
		this.reReplyDate = reReplyDate;
	}
	@Override
	public String toString() {
		return "ReplyVO [reReplyNo=" + reReplyNo + ", reviewVO=" + reviewVO + ", content=" + content + ", parentReNo="
				+ parentReNo + ", reReplyDate=" + reReplyDate + "]";
	}
	
}
