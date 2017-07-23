package org.kosta.sng.model.vo;

public class QnAVO {
	private int qnaNo;
	private String content;
	private String password;
	private String qnaDate;
	private String title;
	private RoomVO rvo;
	private MemberVO mvo;
	public QnAVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public QnAVO(int qnaNo, String content, String password, String qnaDate, String title, RoomVO rvo, MemberVO mvo) {
		super();
		this.qnaNo = qnaNo;
		this.content = content;
		this.password = password;
		this.qnaDate = qnaDate;
		this.title = title;
		this.rvo = rvo;
		this.mvo = mvo;
	}
	public int getQnaNo() {
		return qnaNo;
	}
	public void setQnaNo(int qnaNo) {
		this.qnaNo = qnaNo;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getQnaDate() {
		return qnaDate;
	}
	public void setQnaDate(String qnaDate) {
		this.qnaDate = qnaDate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
		return "QnAVO [qnaNo=" + qnaNo + ", content=" + content + ", password=" + password + ", qnaDate=" + qnaDate
				+ ", title=" + title + ", rvo=" + rvo + ", mvo=" + mvo + "]";
	}
}
