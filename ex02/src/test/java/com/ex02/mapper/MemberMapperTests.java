package com.ex02.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.ex02.domain.MemberVO;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import lombok.extern.log4j.Log4j;

@RunWith(SpringRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
@Log4j
public class MemberMapperTests {
	
	@Setter(onMethod_ = {@Autowired})
	private MemberMapper mapper;
	
	@Test
	public void testRead() {
		MemberVO vo = mapper.read("admin92");
		log.info(vo);
		
		vo.getAuthList().forEach(authVO -> log.info(authVO));	// resultMap- collection(authList)
	}
 
	
}
