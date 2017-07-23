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
	
	public MemberVO(String id, String name, String password, String email, String address, String birth, String pic,
			String businessNo, MultipartFile uploadFile) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.address = address;
		this.birth = birth;
		this.pic = pic;
		this.businessNo = businessNo;
		this.uploadFile = uploadFile;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getBusinessNo() {
		return businessNo;
	}
	public void setBusinessNo(String businessNo) {
		this.businessNo = businessNo;
	}
	public MultipartFile getUploadFile() {
		return uploadFile;
	}
	public void setUploadFile(MultipartFile uploadFile) {
		this.uploadFile = uploadFile;
	}
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + ", address="
				+ address + ", birth=" + birth + ", pic=" + pic + ", businessNo=" + businessNo + ", uploadFile="
				+ uploadFile + "]";
	}
	
}
