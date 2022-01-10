package com.ex02.domain;

import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class MemberVO {
	
	private String userid;
	private String userpw;
	private String userName;
	private boolean enabled;
	private Date regDate;
	private Date updateDate;
	
	private List<AuthVO> authList;
}
