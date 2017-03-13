package service;

import java.util.Date;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.github.pagehelper.PageHelper;
import com.sunshine.dao.ElderDao;
import com.sunshine.dao.InitTestCase;
import com.sunshine.model.Elder;
import com.sunshine.service.impl.ElderServiceImpl;
import com.sunshine.util.UUIDUtil;

/**
 * 对老人信息业务层的测试类
  * @author 云和数据-陈剑洲
 *
 */
public class ElderServiceTest {

	 
     
	/**
	 * 日志记录
	 */
	private Logger log = LogManager.getLogger(ElderServiceTest.class);

	
     
	/**
	 * 描述：获得ElderServiceImpl对象的方法，验证autowired注解
	 * @return ElderServiceImpl对象
	 */
	public ElderServiceImpl getESI() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring/spring.xml");
		ElderServiceImpl esi = ac.getBean(ElderServiceImpl.class);
		return esi;
     }
	
    /**
     * 描述：测试查询类的方法以及分页组建的使用
     */
	/* @Test
    public void getTest(){
      ApplicationContext ac = new ClassPathXmlApplicationContext("spring/spring.xml");
 		ElderServiceImpl esi = ac.getBean(ElderServiceImpl.class);
    	 PageHelper.startPage(1,2);
    	 List<Elder> list=getESI().listAllElders();
    	 for(Elder e : list){
    		 log.info(e);
    	 }
     }*/
    @Test
    public void saveTest(){
    	Elder elder=new Elder();
    	elder.setId(UUIDUtil.genericUUID());
    	elder.setName("老张");
    	elder.setGender(true);
    	elder.setBirthday(new Date());
    	elder.setIdcard("123456647474");
    	elder.setPhone("13526161626");
    	elder.setMarriage_id("结婚");
    	elder.setNation_id("汉");
    	elder.setAddress("上海");
    	elder.setPhoto("6555");
    	elder.setNeed_id("需要");
    	int rownum = getESI().saveElder(elder);
    	
    	System.out.println("影响行数："+rownum);
    	
    }
    
}
