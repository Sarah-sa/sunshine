package service;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;
import com.sunshine.model.ElderUser;
import com.sunshine.service.impl.ElderUserServiceImpl;
import com.sunshine.util.UUIDUtil;

/**
 * 对老人用户信息业务层的测试
 * @author 云和数据-陈剑洲
 */
public class ElderUserServiceTest {

	/**
	 * 日志记录
	 */
	private Logger log = LogManager.getLogger(ElderUserServiceTest.class);

	/**
	 * 描述：获得ElderUserServiceImpl对象的方法，验证autowired注解
	 * 
	 * @return ElderUserServiceImpl对象
	 */
	public ElderUserServiceImpl getEUI() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring/spring.xml");
		ElderUserServiceImpl eusi = ac.getBean(ElderUserServiceImpl.class);
		return eusi;
	}

	/**
	 * 描述：测试查询类的方法以及分页组建的使用
	 */
	@Test
	public void listTest() {
		PageHelper.startPage(1, 2);
		List<Map<String, Object>> list = getEUI().listAllRelatedElder("");
		for (Map m : list) {
			log.info(m);
		}
	}
	
    @Test
	public void list1(){
		PageHelper.startPage(1, 2);
		List<ElderUser> list =  getEUI().listElderUser();
		for(ElderUser eu : list){
			log.info(eu);
		}
	} 
	/**
	 * 保存一条数据测试
	 */
	/*@Test
	public void saveTest() {
		ElderUser eu = new ElderUser();
		eu.setId(UUIDUtil.genericUUID());
		eu.setElder_id("111");
		eu.setUser_id("2");
		eu.setRelation("父子");
		int rownum = getEUI().saveElderUser(eu);
		log.info("影响行数：" + rownum);
	}
	
	@Test
	public void updateTest(){
		ElderUser eu = new ElderUser();
		eu.setId(UUIDUtil.genericUUID());
		eu.setElder_id("545151");
		eu.setUser_id("555");
		eu.setRelation("母子");
		int rownum = getEUI().saveElderUser(eu);
		log.info("影响行数：" + rownum);
	}
	
	*//**
	 * 删除一条老人用户信息
	 */
	/*@Test
	public void removeTest(){
		int rownum = getEUI().removeElderUser("dd01342b-974b-4164-bb15-96204326b79c");
    	log.info("数据执行影响行数"+rownum);
    }*/
	
	 
	
}
