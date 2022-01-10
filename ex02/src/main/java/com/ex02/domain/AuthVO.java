package com.ex02.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class AuthVO {	
	
			// tbl_member_auth column
	private String userid;
	private String auth;
}
