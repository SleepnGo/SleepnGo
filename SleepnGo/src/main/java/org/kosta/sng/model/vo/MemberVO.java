package org.kosta.sng.model.vo;

import org.springframework.web.multipart.MultipartFile;

public class MemberVO {
	private String id;
	private String name;
	private String password;
	private String email;
	private String address;
	private String birth;
	private String pic;
	private String businessNo;
	private MultipartFile uploadFile;
}
