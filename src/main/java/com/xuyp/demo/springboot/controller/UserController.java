package com.xuyp.demo.springboot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@RequestMapping(value={"/","/index"})
	public String goIndex(Model model){
		
		model.addAttribute("name", "jack");
		return "index";
		
	}
	
	
	@RequestMapping(value={"/freemarker"})
	public String freemarker(Map<String, Object> map){
		
		map.put("name", "[Angel -- 守护天使]");
        map.put("gender", 1);//gender:性别，1：男；0：女；  
        
        List<Map<String, Object>> friends = new ArrayList<Map<String, Object>>();
        Map<String, Object> friend = new HashMap<String, Object>();
        friend.put("name", "jack");
        friend.put("age", 30);
        friends.add(friend);
        friend = new HashMap<String, Object>();
        friend.put("name", "jeff");
        friend.put("age", 36);
        friends.add(friend);
        map.put("friends", friends);
        return "freemarker";
		
	}
}
