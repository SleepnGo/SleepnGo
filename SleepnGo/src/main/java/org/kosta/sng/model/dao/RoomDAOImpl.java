package org.kosta.sng.model.dao;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RoomDAOImpl implements RoomDAO{
	@Resource
	private SqlSessionTemplate template;
	
	@Override
	public Object getAllRoomListByReview() {
		return template.selectList("room.getAllRoomListByReview");
	}	
}
