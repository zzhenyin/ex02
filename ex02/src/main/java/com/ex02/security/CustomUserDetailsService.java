package com.ex02.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ex02.domain.MemberVO;
import com.ex02.mapper.MemberMapper;
import com.ex02.security.domain.CustomUser;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class CustomUserDetailsService implements UserDetailsService{
	
	@Setter(onMethod_ = @Autowired)
	private MemberMapper memberMapper;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		
		log.info("Load User By UserName : " + userName);
		
		//userName means userid
		MemberVO vo = memberMapper.read(userName);
		
		log.info("queried by member mapper : " + vo);
		
		return vo == null ? null : new CustomUser(vo);
		
	}
}
