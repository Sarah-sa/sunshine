package com.sunshine.controller;






import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sunshine.dao.HobbyDao;
import com.sunshine.model.Hobby;

/**
 * 老人兴趣控制器
 * @author 云和数据-冯显胜
 *
 */
@RestController
@RequestMapping("/hobbys")
public class HobbyController {
	
	 private static Logger log = LogManager.getLogger(HobbyController.class);
		@Autowired
		private HobbyDao hobbydao;
		
		@RequestMapping("/hobbyes")
		public ModelAndView saveHobby(Hobby hobby){ 
			
			return new ModelAndView("/WEB-INF/views/ftl/hobby/hobby","hobbyes", hobby);
			
		}
}
