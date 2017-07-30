package org.kosta.sng.controller;

import javax.annotation.Resource;

import org.kosta.sng.model.service.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@Resource(name="roomServiceImpl")
	private RoomService roomService;
	
		//@RequestMapping("home.do")
		/*public String home(HttpServletRequest request){
			System.out.println("test");
			return "home.tiles";
		}*/
		@RequestMapping("home.do")
		public ModelAndView getAllRoomListByReview(){		
			System.out.println("test                   "+roomService.getAllRoomListByReview());
			return new ModelAndView("home.tiles","rList",roomService.getAllRoomListByReview());
		}
}
