package org.kosta.sng.model.vo;

public class TranStateVO {
	private int state;
	private String content;
	public TranStateVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TranStateVO(int state, String content) {
		super();
		this.state = state;
		this.content = content;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "TranStateVO [state=" + state + ", content=" + content + "]";
	}
}
