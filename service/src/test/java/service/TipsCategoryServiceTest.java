package service;

import org.jboss.logging.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sunshine.model.TipsCategory;
import com.sunshine.service.TipsCategoryService;
import com.sunshine.util.UUIDUtil;

/**
 * 测试 TipsCategory
 * @author 云和数据-齐铁成
 *
 */
public class TipsCategoryServiceTest {
private static Logger log=Logger.getLogger(TipsCategoryServiceTest.class);	
ApplicationContext  cte=new ClassPathXmlApplicationContext("classpath:spring/spring.xml","classpath:spring/spring-mybatis.xml");
TipsCategoryService stf =cte.getBean(TipsCategoryService.class);	

@Test
public void getTipsCategoryList(){
	log.info(stf.listAllTipsCategory());
	System.out.println(stf.listAllTipsCategory());
}

@Test
public void addTipsCategory(){
	 TipsCategory tc=new TipsCategory();
		UUIDUtil ud=new UUIDUtil();
	    tc.setId(ud.genericUUID());
	    tc.setName("健美");
	    stf.saveTipsCategory(tc);
	 
	 
	 
	
}





}
