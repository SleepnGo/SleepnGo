package org.kosta.sng.model.service;

import javax.annotation.Resource;

import org.kosta.sng.model.dao.RoomDAO;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl implements RoomService{
	@Resource(name="roomDAOImpl")
	private RoomDAO roomDAO;
	
	@Override
	public Object getAllRoomListByReview() {
		return roomDAO.getAllRoomListByReview();
	}

}
