package org.kosta.sng.model.vo;

public class MessageVO {
	private int messageNo;
	private String receiveId;
	private String sendId;
	private String content;
	private String date;
	private String state;
	public MessageVO(int messageNo, String receiveId, String sendId, String content, String date, String state) {
		super();
		this.messageNo = messageNo;
		this.receiveId = receiveId;
		this.sendId = sendId;
		this.content = content;
		this.date = date;
		this.state = state;
	}
	public int getMessageNo() {
		return messageNo;
	}
	public void setMessageNo(int messageNo) {
		this.messageNo = messageNo;
	}
	public String getReceiveId() {
		return receiveId;
	}
	public void setReceiveId(String receiveId) {
		this.receiveId = receiveId;
	}
	public String getSendId() {
		return sendId;
	}
	public void setSendId(String sendId) {
		this.sendId = sendId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "MessageVO [messageNo=" + messageNo + ", receiveId=" + receiveId + ", sendId=" + sendId + ", content="
				+ content + ", date=" + date + ", state=" + state + "]";
	}
	
}
