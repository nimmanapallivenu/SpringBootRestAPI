package com.venu.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.venu.boot.entity.Topic;
import com.venu.boot.service.TopicService;

/**
 * @author venu.nimmanapalli
 *
 */
@RestController
@RequestMapping("/topics")
public class TopicController {

	@Autowired
	private TopicService topicService;

	@RequestMapping("")
	public List<Topic> getAllTopics() {

		return topicService.getAllTopics();
	}

	@RequestMapping("/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopicById(id);
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Topic addTopic(@RequestBody Topic topic) {
		return topicService.addTopic(topic);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public Topic updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		return topicService.updatTopic(topic, id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}
}
