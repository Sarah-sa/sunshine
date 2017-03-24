package com.sunshine.dao;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.github.pagehelper.PageHelper;
import com.sunshine.model.VisitRecord;
import com.sunshine.util.UUIDUtil;

/**
 * 对VisitRecordDao的测试
 * 
 * @author 王一贺 2017年3月7日
 */
public class VisitRecordDaoTest {
	private Logger log = LogManager.getLogger(VisitRecordDaoTest.class);
	SqlSession session = null;
	@Before
	public void getSession() throws IOException{
		String resource = "mybatis/mybatis-conf.xml";
		InputStream input = Resources.getResourceAsStream(resource);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(input);
		 session = factory.openSession();		
				
	}
	//测试VisitRecordDao中的增删改查的方法
	@Test
	public void curd() throws IOException {
		/*String resource = "mybatis/mybatis-conf.xml";
		InputStream input = Resources.getResourceAsStream(resource);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(input);
		SqlSession session = factory.openSession();*/
		
		VisitRecordDao vrd = session.getMapper(VisitRecordDao.class);
		// //查询list
		// List<VisitRecord> list = vrd.listVisitRecord();
		// for (VisitRecord v : list) {
		// System.out.println(v);
		// }
		// //按id查询
		// VisitRecord vrid =
		// vrd.getVisitRecord("834b63a9-0291-4f98-bf5a-a6d43225c5ed");
		// System.out.println(vrid);
		// log.info("测试");
		 //插入，考虑非必填字段为null时的情况，经检测没有异常。
		 VisitRecord vr1 = new VisitRecord();
//		 vr1.setId(UUIDUtil.genericUUID());
//		 vr1.setElderId(UUIDUtil.genericUUID());
//		 vr1.setContent("走访宣传");
//		 vr1.setStaffId(UUIDUtil.genericUUID());
//		 vr1.setCreateTime(new Date());
//		 vr1.setPlanTime(new Date());
		// vr1.setExecTime(new Date());
		 vr1.setStatus(true);
		//批量插入
		 int num = vrd.saveVisitRecord(vr1);
		 vr1.setId(UUIDUtil.genericUUID());
		 vr1.setContent("走访宣传2");
		 vrd.saveVisitRecord(vr1);
		 vr1.setId(UUIDUtil.genericUUID());
		 vr1.setContent("走访宣传3");
		 vrd.saveVisitRecord(vr1);
		 vr1.setId(UUIDUtil.genericUUID());
		 vr1.setContent("走访宣传4");
		 vrd.saveVisitRecord(vr1);
		 session.commit();
		 session.close();
		// log.debug("num为："+num);
		// 更新
		// VisitRecord vr2 = new VisitRecord();
		// vr2.setId("834b63a9-0291-4f98-bf5a-a6d43225c5ed");
		// vr2.setElderId(UUIDUtil.genericUUID());
		// vr2.setContent("走访宣传更新");
		// vr2.setStaffId(UUIDUtil.genericUUID());
		// vr2.setCreateTime(new Date());
		// vr2.setPlanTime(new Date());
		//// vr2.setExecTime(new Date());
		// vr2.setStatus(true);
		// int num2 = vrd.updateVisitRecord(vr2);
		// log.info("更新的条数："+num2);
		// session.commit();
		// 删除
		// int num3 =
		// vrd.removeVisitRecord("d117fd81-8d01-415c-91fb-fd9277730fd2");
		// log.info("删除的条数："+num3);
		// session.commit();

	}
	
	/**
	 *描述：测试分页
	 *@author 王一贺 2017-03-08
	 */
	@Test
	public void pageHelper(){
		VisitRecordDao vrd = session.getMapper(VisitRecordDao.class);
		
		PageHelper.startPage(1,2,true);
		List<VisitRecord> list = vrd.listVisitRecord();
		for (VisitRecord v : list) {
			log.info(v);			
		};
		
	}
	/**
	 *描述：对视图v_visit_elder_staff的查询测试
	 *@author 王一贺 2017-03-10
	 * @throws ParseException
	 * 结果：测试成功 
	 */
	@Test
	public void viewTest() throws ParseException{
		VisitRecordDao vrd = session.getMapper(VisitRecordDao.class);
		//格式化时间
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");	
		//设置查询限制条件
		Map<String,Object> map0 = new HashMap<String,Object>();
		map0.put("startTime", sdf.format(new Date()));
		map0.put("endTime", "2017-03-13 17:08:03");
		map0.put("id", "1f0fd5fc-1057-4cce-9dc2-169bcf5b69a6");
		map0.put("status", 1);
		map0.put("name", "王大爷");
		//分页
		PageHelper.startPage(1, 8);
		List<Map<String,Object>> listMap = vrd.listVisitElderStaff(map0);
		for(Map<String,Object> map : listMap){
			for(Map.Entry<String, Object> m : map.entrySet()){
//				log.info(m.getKey());
//				log.info(m.getValue());
				System.out.print(m.getValue()+"^^^");
			}
		}
	}
}
