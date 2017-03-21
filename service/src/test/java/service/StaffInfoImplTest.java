package service;

import java.util.Date;
import java.util.List;

import org.jboss.logging.Logger;
import org.junit.Test;
 
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sunshine.model.StaffInfo;
import com.sunshine.service.StaffInfoService;
import com.sunshine.util.UUIDUtil;

/**
 * 服务层测试
 * @author 云和数据-齐铁成
 *
 */
 
public class StaffInfoImplTest {
private static Logger log=Logger.getLogger(StaffInfoImplTest.class);
 
ApplicationContext  cte=new ClassPathXmlApplicationContext("classpath:spring/spring.xml","classpath:spring/spring-mybatis.xml");
StaffInfoService stf =cte.getBean(StaffInfoService.class);
/**
 * 测试获取座席信息集合
 */
@Test
public void getListStaffTest() {
	// TODO Auto-generated constructor stub
           List staffList =(List) stf.getListStaff();
           log.info(staffList);
 
///**
// * 测试添加座席信息
// */
//@Test
//public void  addStaffTest() {
//	// TODO Auto-generated constructor stub
//	StaffInfo staff=new StaffInfo();
//	staff.setAddress("海口市");
//	staff.setBirthday(new Date());
//	staff.setGender(true);
//	staff.setNickName("momo");
//	staff.setStatus(false);
//	staff.setPhoto("brj86896");
//	staff.setTel("0395-5489522");
//	UUIDUtil ud=new UUIDUtil();
//	staff.setUid(ud.genericUUID()); 
//	int i=stf.saveStaff(staff);
//	log.info("添加成功");
//	System.out.println(i);
//}
}

/**
 * 删除座席信息 
 */
@Test
public void  delStaffTest() {
	// TODO Auto-generated constructor stub
         int i=stf.delStaff("fb2c3b89-fbaa-4e91-88c1-7df258777fc2");
         log.info(i);
}
}
