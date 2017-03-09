package com.sunshine.dao.test;

import org.junit.Before;
import org.junit.Test;

import com.sunshine.dao.ElderDao;
import com.sunshine.dao.InitTestCase;
import com.sunshine.model.Elder;
import com.sunshine.util.UUIDUtil;

/**
 * ElderDao的测试
 * @author 云和数据-陈剑洲
 *
 */
public class ElderDaoTest extends InitTestCase{
		    private ElderDao eld;
	
	        @Before
	        public void initElderDao() {
	        	eld=session.getMapper(ElderDao.class);
	        }
	        
	       
          @Test
	      public void saveElder() throws Exception {
	    	      try {
					Elder elder=new Elder();
					  elder.setId(UUIDUtil.genericUUID());
					  
					  elder.setName("78513");
					  elder.setAddress("郑州");
					  elder.setIdcard("277");
					  elder.setGender(true);
					  elder.setPhone("27878");
					  elder.setNation_id("58");
					  elder.setAddress("27");
					  elder.setNeed_id("275");
					  int num3=eld.saveElder(elder);
					  System.out.println("更新的条数"+num3);
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
          
          /*@Test
	    	public void listAllElders() throws Exception{
	    		List<Elder> list=eld.listAllElders();
	    		for(Elder elder : list){
	    		System.out.println(elder);	
	    		}
	    	} 
           */
           /* @Test
            public void getElder() throws Exception{
            		Elder elder1=eld.getElder("1dad4afc-8f21-421d-b906-9ee2ae575c22");
            		System.out.println(elder1);	
            }*/
            
         /*   @Test
            public void updateElder() throws Exception{
            	    Elder elder2=new Elder();
            	    elder2.setId("9828c0e1-39b1-4c06-83fc-4270f2802f33");
  				  
  				  elder2.setName("张三");
  				  elder2.setAddress("北京");
  				  elder2.setIdcard("147");
  				  elder2.setGender(true);
  				  elder2.setPhone("321");
  				  elder2.setNation_id("269");
  				  elder2.setAddress("789");
  				  elder2.setNeed_id("258");
  				  int num=eld.updateElder(elder2);
  				session.commit();
  				System.out.println("更新的条数"+num);	
  				
            }*/
            
                  /*@Test 
                 public void removeElder() throws Exception{
                	 int num2=eld.removeElder("60118f88-50e4-44c0-9949-4b52301481f5");
                	 System.out.println("更新的条数"+num2);
                 }
                 */

			
	    	  
	    	  
	     
}
