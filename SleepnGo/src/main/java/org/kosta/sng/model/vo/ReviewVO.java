package org.kosta.sng.model.vo;

public class ReviewVO {
	private int reviewNo;
	private String content;
	private int score;
	private String reviewDate;
	private RoomVO rvo;
	private MemberVO mvo;
	public ReviewVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReviewVO(int reviewNo, String content, int score, String reviewDate, RoomVO rvo, MemberVO mvo) {
		super();
		this.reviewNo = reviewNo;
		this.content = content;
		this.score = score;
		this.reviewDate = reviewDate;
		this.rvo = rvo;
		this.mvo = mvo;
	}
	public int getReviewNo() {
		return reviewNo;
	}
	public void setReviewNo(int reviewNo) {
		this.reviewNo = reviewNo;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getReviewDate() {
		return reviewDate;
	}
	public void setReviewDate(String reviewDate) {
		this.reviewDate = reviewDate;
	}
	public RoomVO getRvo() {
		return rvo;
	}
	public void setRvo(RoomVO rvo) {
		this.rvo = rvo;
	}
	public MemberVO getMvo() {
		return mvo;
	}
	public void setMvo(MemberVO mvo) {
		this.mvo = mvo;
	}
	@Override
	public String toString() {
		return "ReviewVO [reviewNo=" + reviewNo + ", content=" + content + ", score=" + score + ", reviewDate="
				+ reviewDate + ", rvo=" + rvo + ", mvo=" + mvo + "]";
	}
}
