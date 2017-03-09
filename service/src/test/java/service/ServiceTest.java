package service;

import java.util.List;

import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sunshine.model.Advice;
import com.sunshine.service.impl.AdviceServiceImpl;

/**
 * 云和数据—任继鹏 测试类
 * 
 * @author Administrator
 *
 */
public class ServiceTest {
	@Test
	public void adviceServiceTest() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring/spring*.xml");
		AdviceServiceImpl adviceService = ac.getBean(AdviceServiceImpl.class);
		//
		// Advice advice = new Advice();
		// advice.setId("123");
		// advice.setDescription("sada");
		// advice.setLocation("盛飒");
		//
		// int rownum = adviceService.saveAdvice(advice);
		// System.out.println("影响行数："+rownum);

		// List<Advice> listAd=adviceService.ListAllAdvice();
		// for(Advice s:listAd){
		// System.out.println(s.getId());
		// }

		// int rownum = adviceService.removeAdvice("123");
		// System.out.println("影响行数："+rownum);

		Advice advice = adviceService.getAdvice("122");
		System.out.println(advice.getId() + advice.getPublisher());

		advice.setTitle("蓝色预警");
		advice.setLocation("生");
		advice.setPublisher("问啊");
		advice.setDescription("吃饭");
		adviceService.updateAdvice(advice);

	}

}
