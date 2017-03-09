package service;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sunshine.model.MsgTemplate;
import com.sunshine.service.impl.MsgTemplateServiceImpl;
/**
 * 短信模板数据操作测试
 * @author 云和数据-李牧
 *
 */

public class MsgTemplateTest {
	/**
	 * 添加测试
	 */
	
	/*@Test
	public void saveTest(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring/spring*.xml");
		MsgTemplateServiceImpl msgTemplateServiceImpl=ac.getBean(MsgTemplateServiceImpl.class);
		MsgTemplate msgTemplate = new MsgTemplate();
		msgTemplate.setId("1");
		msgTemplate.setTitle("1111111");
		msgTemplate.setContent("11111111111");
		int i = msgTemplateServiceImpl.saveMsgTemplate(msgTemplate);
		System.out.println("数据执行影响行数"+i);
		}
		*/
	/**
	 * 根据id查询测试
	 */
/*	@Test
	public void getTest(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring/spring*.xml");
		MsgTemplateServiceImpl msgTemplateServiceImpl=ac.getBean(MsgTemplateServiceImpl.class);
		MsgTemplate msgTemplate = msgTemplateServiceImpl.getMsgTemplate("1");
		System.out.println(msgTemplate.getTitle()+"\t"+msgTemplate.getContent());
		
	}
	*/
	/**
	 * 查询所有测试
	 */
/*	@Test
	public void listTest(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring/spring*.xml");
		MsgTemplateServiceImpl msgTemplateServiceImpl=ac.getBean(MsgTemplateServiceImpl.class);
		List<MsgTemplate> list = msgTemplateServiceImpl.listAllMsgTemplate();
		for(MsgTemplate mtl:list){
			System.out.println(mtl.getTitle()+"\t"+mtl.getContent());
		}
	}
	*/
	/**
	 * 更改测试
	 */
/*	@Test
	public void updateTest(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring/spring*.xml");
		MsgTemplateServiceImpl msgTemplateServiceImpl=ac.getBean(MsgTemplateServiceImpl.class);
		MsgTemplate msgTemplate = new MsgTemplate();
		msgTemplate.setId("1");
		msgTemplate.setTitle("222222222");
		msgTemplate.setContent("22222222222");
		int i = msgTemplateServiceImpl.updateMsgTemplate(msgTemplate);
		System.out.println("数据执行影响行数"+i);
	}
	*/
	/**
	 * 删除测试
	 */
	@Test
	public void removeTest(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring/spring*.xml");
		MsgTemplateServiceImpl msgTemplateServiceImpl=ac.getBean(MsgTemplateServiceImpl.class);
		int i = msgTemplateServiceImpl.removeMsgTemplate("1");
		System.out.println("数据执行影响行数"+i);
	}

}
