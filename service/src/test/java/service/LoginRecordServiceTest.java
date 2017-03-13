package service;

import java.util.List;
import java.util.Map;

import org.jboss.logging.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sunshine.service.LoginRecordService;
import com.sunshine.service.StaffInfoService;

/**
 * 座席人员登录信息测试
 * @author 云和数据-齐铁成
 *
 */
public class LoginRecordServiceTest {
  private static Logger log=Logger.getLogger(LoginRecordServiceTest.class);
@Test
public void getLoginRecord(){
	
	ApplicationContext  cte=new ClassPathXmlApplicationContext("classpath:spring/spring.xml","classpath:spring/spring-mybatis.xml");
	LoginRecordService stf = cte.getBean(LoginRecordService.class);
     List<Map<String,String>> list=stf.getListLoginRecord();
     System.out.println(list.size());
     log.info(list);
	
	
	
}
	
	
	
	
}
