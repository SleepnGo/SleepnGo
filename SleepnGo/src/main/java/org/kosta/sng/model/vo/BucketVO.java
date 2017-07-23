package org.kosta.sng.model.vo;

public class BucketVO {
	private MemberVO memberVO;
	private RoomVO roomVO;
	public BucketVO(MemberVO memberVO, RoomVO roomVO) {
		super();
		this.memberVO = memberVO;
		this.roomVO = roomVO;
	}
	public MemberVO getMemberVO() {
		return memberVO;
	}
	public void setMemberVO(MemberVO memberVO) {
		this.memberVO = memberVO;
	}
	public RoomVO getRoomVO() {
		return roomVO;
	}
	public void setRoomVO(RoomVO roomVO) {
		this.roomVO = roomVO;
	}
	@Override
	public String toString() {
		return "BucketVO [memberVO=" + memberVO + ", roomVO=" + roomVO + "]";
	}
	
}
