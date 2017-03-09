package com.sunshine.dao;

import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sunshine.model.Complain;
import com.sunshine.util.UUIDUtil;

/**
* 测试ComplainDao 中的方法
*@author 王一贺
* 2017年3月8日  
*/
public class ComplainDaoTest extends InitTestCase{
	
	/**
	 * 日志记录
	 */
	private Logger log = LogManager.getLogger();
	
	/**
	 *描述：通过session获得ComplainDao对象
	 *@author 王一贺 2017-03-08
	 *@return ComplainDao对象
	 */
	private ComplainDao getDao(){		
		return session.getMapper(ComplainDao.class);
	}
	
	/**
	 *描述：测试 查询获得 的方法
	 *结果：OK	
	 */
	@Test
	public void getTest(){
		//分页
		PageHelper.startPage(1, 2, "content desc");
		Page<Complain> page = (Page<Complain>) getDao().listComplain();
		log.info(page);
		List<Complain> list = page;
		for (Complain c : list) {
			log.info(c);
		}
		/*//根据id获得
		log.info(getDao().getComplain("963cbc68-59d6-4273-907f-28ed6f347e7d"));*/
	}
	
	/**
	 *描述：测试 增加保存 的方法;
	 *结果：OK
	 */
	@Test
	public void saveTest(){
		Complain comp1 = new Complain();
		comp1.setId(UUIDUtil.genericUUID());
		comp1.setOrderId(UUIDUtil.genericUUID());
		comp1.setContent("派单2323太慢！");
		comp1.setCreateTime(new Date());
		comp1.setStaffId(UUIDUtil.genericUUID());
		comp1.setVisitTime(new Date());
		comp1.setVisitResult("客户不怒了");
		comp1.setStatus(true);		
		int num = getDao().saveComplain(comp1);
		
		//考虑空值
		Complain comp2 = new Complain();
		comp2.setId(UUIDUtil.genericUUID());
		comp2.setOrderId(UUIDUtil.genericUUID());
		comp2.setContent("食物味道33太差！");
		comp2.setCreateTime(new Date());
		comp2.setStaffId(UUIDUtil.genericUUID()); 
		//comp2.setVisitTime(new Date());
		//comp2.setVisitResult("客户消气了，希望商家以后能快速下单");
		comp2.setStatus(false);		
		int num2 = getDao().saveComplain(comp2);
		log.info("num是："+num2);
		session.commit();		
	}
	
	/**
	 *描述：测试 更新的方法
	 *结果：OK
	 */
	@Test
	public void updateTest(){
		Complain comp1 = new Complain();
		comp1.setId("33d75b36-5cd7-47d5-b184-fb1a4cfedced");
		comp1.setOrderId(UUIDUtil.genericUUID());
		comp1.setContent("派单update太慢！");
		comp1.setCreateTime(new Date());
		comp1.setStaffId(UUIDUtil.genericUUID());
		comp1.setVisitTime(new Date());
		comp1.setVisitResult("客户update怒了");
		comp1.setStatus(true);
		getDao().updateComplain(comp1);
	}
	
	/**
	 *描述：对删除功能的测试
	 *结果：OK
	 */
	@Test
	public void deleTest(){
		getDao().removeComplain("e96df2b0-c85d-4d44-8b56-ccb218c8a8cb");
	}
}
