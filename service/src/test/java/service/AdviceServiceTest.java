package service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;
import com.sunshine.model.Advice;
import com.sunshine.service.AdviceService;
import com.sunshine.service.impl.AdviceServiceImpl;

/**
 * 云和数据—任继鹏 公告测试类
 * 
 * @author Administrator
 *
 */
public class AdviceServiceTest {
	/**
	 * 日志记录
	 */
	private Logger log = LogManager.getLogger(AdviceServiceTest.class);

	/**
	 * 描述：获得AdviceService的实现类对象
	 * 
	 * @author 任继鹏 2017-03-08
	 * @return AdviceServiceImpl对象
	 */
	private AdviceService getService() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring/spring.xml");
		return ac.getBean(AdviceServiceImpl.class);
	}

	/**
	 * 描述：对增加方法的测试
	 * 
	 * @author 任继鹏 2017-03-08 结果：OK
	 */
	 @Test
	 public void saveTest() {
	 Advice advice = new Advice();
	 advice.setId("100");
	 advice.setDescription("sada");
	 advice.setLocation("333");
	 int rownum = getService().saveAdvice(advice);
	 System.out.println("影响行数："+rownum);
	 }
	/**
	 * 描述：对分页查询方法的测试
	 * 
	 * @author 任继鹏 2017-03-08 结果：OK
	 */
	@Test
	public void getTest() {
		PageHelper.startPage(2, 2);
		List<Advice> list = getService().ListAllAdvice();
		for (Advice s : list) {
			log.info(s);
		}
	}

	/**
	 * 描述：对删除方法的测试
	 * 
	 * @author 任继鹏 2017-03-08 结果：OK
	 */
	@Test
	public void removeTest() {
		int rownum = getService().removeAdvice("222");
		log.info(rownum);
	}

	/**
	 * 描述：对查看修改方法的测试
	 * 
	 * @author 任继鹏 2017-03-08 结果：OK
	 */
	@Test
	public void geTest() {
		Advice advice = getService().getAdvice("129");
		System.out.println(advice.getId() + advice.getPublisher());

		advice.setTitle("蓝色预警");
		advice.setLocation("生");
		advice.setPublisher("问啊");
		advice.setDescription("吃饭");
		getService().updateAdvice(advice);
	}
}
