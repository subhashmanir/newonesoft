package com.example.trial1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(value = "/web")
public class Connect1 {
	@GetMapping(value = "/hello")
	public String world() {
		return "Hello World";

	}
//	@GetMapping(value="/concat")
//	public String concat(String a,String b) {
//		return a.concat(b);
//	}
	@GetMapping(value="/add")
	public int add(int a,int b) {
		return a+b;
	}
	
	@GetMapping(value="/concat1/{a}/{b}")
	public String concat1(@PathVariable("a") String x ,@PathVariable("b") String y) {
		return x.concat(y);
	}
	@GetMapping(value="/add1")
	public int add1(int a,int b) {
		return a+b;
	}

}
