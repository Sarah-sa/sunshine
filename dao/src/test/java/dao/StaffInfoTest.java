package dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 
 * @author 云和数据-齐铁成 测试有关座席人员的接口
 */

public class StaffInfoTest {
	private static Logger log = LogManager.getLogger(StaffInfoTest.class);

	/**
	 * 
	 * @throws IOException
	 */

	// @SuppressWarnings("static-access")
	// @Test
	// public void saveStaff() throws IOException{
	//
	// String resource ="mybatis/mybatis-conf.xml";
	// InputStream inputStream = Resources.getResourceAsStream(resource);
	// SqlSessionFactory sqlSessionFactory = new
	// SqlSessionFactoryBuilder().build(inputStream);
	// SqlSession sqlSession=sqlSessionFactory.openSession();
	//
	// StaffInfoDao staf=sqlSession.getMapper(StaffInfoDao.class);
	// StaffInfo staff=new StaffInfo();
	// staff.setAddress("郑州市");
	// staff.setBirthday(new Date());
	// staff.setGender(true);
	// staff.setNickName("nana");
	// staff.setPhoto("uhfshuipw");
	// staff.setTel("0371-123456");
	// UUIDUtil ud=new UUIDUtil();
	// staff.setUid(ud.genericUUID());
	// int i=staf.saveStaff(staff);
	// logger.info("添加成功");
	// System.out.println(i);
	//
	// sqlSession.commit();
	// sqlSession.close();
	// }
	/**
	 * 测试获取座席的集合
	 * 
	 * @throws IOException
	 */
	// @Test
	// public void getListStaff() throws IOException{
	// String resource ="mybatis/mybatis-conf.xml";
	// InputStream inputStream = Resources.getResourceAsStream(resource);
	// SqlSessionFactory sqlSessionFactory = new
	// SqlSessionFactoryBuilder().build(inputStream);
	// SqlSession sqlSession=sqlSessionFactory.openSession();
	//
	// StaffInfoDao staf=sqlSession.getMapper(StaffInfoDao.class);
	// List staffList=staf.getListStaff();
	// log.info(staffList);
	// }
	// /**
	// * 测试更改座席信息
	// * @throws IOException
	// */
	// @Test
	// public void updateStaff() throws IOException{
	// String resource ="mybatis/mybatis-conf.xml";
	// InputStream inputStream = Resources.getResourceAsStream(resource);
	// SqlSessionFactory sqlSessionFactory = new
	// SqlSessionFactoryBuilder().build(inputStream);
	// SqlSession sqlSession=sqlSessionFactory.openSession();
	//
	// StaffInfoDao staf=sqlSession.getMapper(StaffInfoDao.class);
	//
	// StaffInfo staff =new StaffInfo();
	// staff.setAddress("shanghai");
	// staff.setBirthday(new Date());
	// staff.setGender(true);
	// staff.setNickName("hanhan");
	// staff.setPhoto("wsfrfew");
	// staff.setStatus(true);
	// staff.setTel("0394-458973");
	// staff.setUid("2");
	// int s=staf.updateStaff(staff);
	// System.out.println(s);
	// log.info("更新成功");
	// sqlSession.commit();
	// sqlSession.close();
	//
	// }

	// @Test
	// public void delStaff() throws IOException{
	// String resource ="mybatis/mybatis-conf.xml";
	// InputStream inputStream = Resources.getResourceAsStream(resource);
	// SqlSessionFactory sqlSessionFactory = new
	// SqlSessionFactoryBuilder().build(inputStream);
	// SqlSession sqlSession=sqlSessionFactory.openSession();
	//
	// StaffInfoDao staf=sqlSession.getMapper(StaffInfoDao.class);
	// int s=staf.delStaff("1");
	// System.out.println(s);
	// log.info("删除成功");
	// sqlSession.commit();
	// sqlSession.close();
	// }

}
