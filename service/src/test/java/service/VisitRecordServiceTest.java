package service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.github.pagehelper.PageHelper;
import com.sunshine.model.VisitRecord;
import com.sunshine.service.impl.VisitRecordServiceImpl;

/**
* 对走访记录业务层的测试
*@author 王一贺
* 2017年3月8日  
*/
public class VisitRecordServiceTest {
	
	/**
	 * 日志记录
	 */
	private Logger log = LogManager.getLogger(VisitRecordServiceTest.class);
	
	
	/**
	 *描述：获得VisitRecordServiceImpl对象的方法，验证autowired注解是否可用
	 *@author 王一贺 2017-03-08
	 *@return VisitRecordServiceImpl对象
	 */
	public VisitRecordServiceImpl getVRSI(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring/spring.xml");
		VisitRecordServiceImpl vrsi = ac.getBean(VisitRecordServiceImpl.class);
		return vrsi;
	}
	
	/**
	 *描述：测试 查询类的方法及分页组件的使用
	 *@author 王一贺 2017-03-08
	 */
	@Test
	public void getTest(){
//		ApplicationContext ac = new ClassPathXmlApplicationContext("spring/spring.xml");
//		VisitRecordServiceImpl vrsi = ac.getBean(VisitRecordServiceImpl.class);
		PageHelper.startPage(1, 2);//分页查询
		List<VisitRecord> list = getVRSI().listVisitRecord();
		for (VisitRecord v : list) {
			log.info(v);
		}
	}
}
