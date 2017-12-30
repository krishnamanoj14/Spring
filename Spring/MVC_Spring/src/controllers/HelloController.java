package controllers;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		String name = arg0.getParameter("name");
		HashMap<String,String> m = new HashMap<String,String>();
		m.put("msg","Hello "+name);
		ModelAndView mav = new ModelAndView("success",m);
		return mav;
	}
}
