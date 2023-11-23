package com.subtract;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class SubController {
    @RequestMapping("/sub")
	public ModelAndView sub(@RequestParam("t1") int i,@RequestParam("t2") int j) {
		SubService subService = new SubService();
		int k = subService.sub(i, j);
		ModelAndView mView = new ModelAndView();
		mView.setViewName("display.jsp");
		mView.addObject("result",k);
		return mView;
		
	}
}
