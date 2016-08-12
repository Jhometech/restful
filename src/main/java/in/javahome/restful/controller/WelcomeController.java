package in.javahome.restful.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.javahome.restful.pojo.Welcome;

@RestController
public class WelcomeController {
	@RequestMapping(value="/welcome")
	public Welcome greeting() {
		Welcome w = new Welcome();
		w.setMsg("Welcome to RESTFul webservices");
		w.setFrom("Java Home");
		return w;
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String addMessage(@RequestBody Welcome w){
		return null;
		
	}
}
