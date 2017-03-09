package service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sunshine.model.MsgRecord;
import com.sunshine.service.impl.MsgRecordServiceImpl;

/**
 * 短信记录表数据操作测试类
 * @author 云和数据-李牧
 *
 */
public class MsgRecordServiceTest {
	@Test
	public void getTest(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring/spring*.xml");
		MsgRecordServiceImpl msgRecordServiceImpl=ac.getBean(MsgRecordServiceImpl.class);
		System.out.println(msgRecordServiceImpl.getMsgRecord("1"));
		
		
	}

}
