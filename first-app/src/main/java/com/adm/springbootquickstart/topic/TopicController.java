package com.adm.springbootquickstart.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				
				new Topic("Spring","Spring Framework","Spring Framework description"),
				new Topic("Java","Java Core","Java Description"),
				new Topic("javascript","JavaScript","Javascript Description")
				);
				
				
	}
	
	

}
