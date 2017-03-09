package com.sunshine.test.Mapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import com.sunshine.dao.VisitRecordDao;
import com.sunshine.model.VisitRecord;
import com.sunshine.util.UUIDUtil;

/**
 * 对VisitRecordDao的测试
 * 
 * @author 王一贺 2017年3月7日
 */
public class VisitRecordDaoTest {
	private Logger log = LogManager.getLogger(VisitRecordDaoTest.class);

	// 测试VisitRecordDao中的增删改查的方法
	@Test
	public void curd() throws IOException {
		String resource = "mybatis/mybatis-conf.xml";
		InputStream input = Resources.getResourceAsStream(resource);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(input);
		SqlSession session = factory.openSession();
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
		// //插入，考虑非必填字段为null时的情况，经检测没有异常。
		// VisitRecord vr1 = new VisitRecord();
		// vr1.setId(UUIDUtil.genericUUID());
		// vr1.setElderId(UUIDUtil.genericUUID());
		//// vr1.setContent("走访宣传");
		// vr1.setStaffId(UUIDUtil.genericUUID());
		// vr1.setCreateTime(new Date());
		// vr1.setPlanTime(new Date());
		//// vr1.setExecTime(new Date());
		// vr1.setStatus(true);
		//
		// int num = vrd.saveVisitRecord(vr1);
		// session.commit();
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
}
