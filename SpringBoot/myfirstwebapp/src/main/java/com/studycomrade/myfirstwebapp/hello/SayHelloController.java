package com.studycomrade.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// you need to add the controller annotation to handle web requests
@Controller
public class SayHelloController {
	// this is the route (url) - 'http://localhost:8080/say-hello'
	// => this is what you expect - 'hello! what are you learning today?'
	
	// say-hello
	// url: http://localhost:8080/say-hello
	@RequestMapping("say-hello")
	
	// the ResponseBody annotation - displaying
	// you have to write the return statement
	@ResponseBody
	public String SayHello() {
		return "hello! what are you learning today?";
	}
	
	
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("<!DOCTYPE html>");
		sb.append("<html lang='en'>");
		sb.append("<head>");
		sb.append("<title>My First Html Page</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("<h1>Html Page</h1>");
		sb.append("<p>My First Html Page</p>");
		sb.append("</body>");
		sb.append("</html>");
		
		return sb.toString();
	}
	
	@RequestMapping("say-hello-jsp")
	//@ResponseBody
	public String sayHelloJsp() {
		return "sayHello";
	}
	
}
