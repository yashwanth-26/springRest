package com.yashwanth.assign4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ValidController {
	@Autowired
	private ValidService v;
	@RequestMapping(value="/mani",method = RequestMethod.POST)
	public String gettt(@RequestBody Valid b) {
		return v.getval(b.getaString());
	}


}


