package org.kosta.sng.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
		@RequestMapping("home.do")
		public String home(HttpServletRequest request){
			System.out.println("test");
			return "home.tiles";
		}
}
