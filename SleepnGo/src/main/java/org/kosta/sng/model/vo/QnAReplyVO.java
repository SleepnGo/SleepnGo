package org.kosta.sng.model.vo;

public class QnAReplyVO {
	private int QnAReplyNo;
	private QnAVO qnaNo;
	private String content;
	private String id;
	private int parentReNo;
	private String qnaReplyDate;
	public QnAReplyVO(int qnAReplyNo, QnAVO qnaNo, String content, String id, int parentReNo, String qnaReplyDate) {
		super();
		QnAReplyNo = qnAReplyNo;
		this.qnaNo = qnaNo;
		this.content = content;
		this.id = id;
		this.parentReNo = parentReNo;
		this.qnaReplyDate = qnaReplyDate;
	}
	public int getQnAReplyNo() {
		return QnAReplyNo;
	}
	public void setQnAReplyNo(int qnAReplyNo) {
		QnAReplyNo = qnAReplyNo;
	}
	public QnAVO getQnaNo() {
		return qnaNo;
	}
	public void setQnaNo(QnAVO qnaNo) {
		this.qnaNo = qnaNo;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getParentReNo() {
		return parentReNo;
	}
	public void setParentReNo(int parentReNo) {
		this.parentReNo = parentReNo;
	}
	public String getQnaReplyDate() {
		return qnaReplyDate;
	}
	public void setQnaReplyDate(String qnaReplyDate) {
		this.qnaReplyDate = qnaReplyDate;
	}
	@Override
	public String toString() {
		return "QnAReply [QnAReplyNo=" + QnAReplyNo + ", qnaNo=" + qnaNo + ", content=" + content + ", id=" + id
				+ ", parentReNo=" + parentReNo + ", qnaReplyDate=" + qnaReplyDate + "]";
	}
	
}
