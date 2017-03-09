package service;

import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;
import com.sunshine.model.Complain;
import com.sunshine.service.ComplainService;
import com.sunshine.service.impl.ComplainServiceImpl;
import com.sunshine.util.UUIDUtil;

/**
* 测试投诉业务类
*@author 王一贺
* 2017年3月8日  
*/
public class ComplainServiceTest {
	
	/**
	 * 日志记录
	 */
	private Logger log = LogManager.getLogger(ComplainServiceTest.class);
	
	/**
	 *描述：获得ComplainService的实现类对象
	 *@author 王一贺 2017-03-08
	 *@return ComplainServiceImpl对象
	 */
	private ComplainService getService(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring/spring.xml");
		return ac.getBean(ComplainServiceImpl.class);
	}
	
	/**
	 *描述：对查询方法的测试
	 *@author 王一贺 2017-03-08
	 *结果：OK
	 */
	@Test
	public void getTest(){
		// 分页
		PageHelper.startPage(2, 2);
		List<Complain> list = getService().listComplain();
		for (Complain c : list) {
			log.info(c);
		}		
	}
	
	/**
	 *描述：对新增方法进行测试
	 *@author 王一贺 2017-03-08
	 */
	@Test
	public void saveTest(){
		Complain comp1 = new Complain();
		comp1.setId(UUIDUtil.genericUUID());
		comp1.setOrderId(UUIDUtil.genericUUID());
		comp1.setContent("服务处瘫痪A?！");
		comp1.setCreateTime(new Date());
		comp1.setStaffId(UUIDUtil.genericUUID());
		comp1.setVisitTime(new Date());
		comp1.setVisitResult("冰释前嫌");
		comp1.setStatus(true);
		getService().saveComplain(comp1);
	}
}
