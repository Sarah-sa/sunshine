package com.sunshine.controller;






import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sunshine.dao.HobbyDao;
import com.sunshine.model.Hobby;

/**
 * 老人兴趣控制器
 * @author 云和数据-冯显胜
 *
 */
@RestController
public class HobbyController {
	
	 private static Logger log = LogManager.getLogger();
		@Autowired
		private HobbyDao hobbydao;
		
		@RequestMapping(value=" " ,method = RequestMethod.POST)
		int saveHobby(Hobby hobby){
			return 0;
			
		}
}
