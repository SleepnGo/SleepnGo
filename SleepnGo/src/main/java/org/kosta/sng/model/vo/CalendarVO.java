package org.kosta.sng.model.vo;

public class CalendarVO {
	private int roomVO;
	private String startDay;
	private String endDay;
	public CalendarVO(int roomVO, String startDay, String endDay) {
		super();
		this.roomVO = roomVO;
		this.startDay = startDay;
		this.endDay = endDay;
	}
	public int getRoomVO() {
		return roomVO;
	}
	public void setRoomVO(int roomVO) {
		this.roomVO = roomVO;
	}
	public String getStartDay() {
		return startDay;
	}
	public void setStartDay(String startDay) {
		this.startDay = startDay;
	}
	public String getEndDay() {
		return endDay;
	}
	public void setEndDay(String endDay) {
		this.endDay = endDay;
	}
	@Override
	public String toString() {
		return "CalendarVO [roomVO=" + roomVO + ", startDay=" + startDay + ", endDay=" + endDay + "]";
	}
	
}
