package com.venu.boot.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.venu.boot.entity.Topic;
import com.venu.boot.service.TopicService;

@Service
public class TopicServiceImpl implements TopicService {

	private List<Topic> topicList = new ArrayList<Topic>(Arrays.asList(new Topic("1", "Java", "learn Java"),
			new Topic("2", "Spring", "Spring framework"), new Topic("3", "JavaScript", "Client side framework")));

	@Override
	public List<Topic> getAllTopics() {
		return topicList;
	}

	@Override
	public Topic getTopicById(String id) {
		return topicList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	@Override
	public Topic addTopic(Topic topic) {
		topicList.add(topic);
		return topicList.stream().filter(t -> t.getId().equals(topic.getId())).findFirst().get();
	}

	@Override
	public Topic updatTopic(Topic topic, String id) {

		for (int i = 0; i < topicList.size(); i++) {
			if (topicList.get(i).getId().equals(id)) {
				topicList.set(i, topic);
				break;
			}
		}

		return topic;
	}

	@Override
	public void deleteTopic(String id) {
		for (int i = 0; i < topicList.size(); i++) {
			if (topicList.get(i).getId().equals(id)) {
				topicList.remove(i);
				break;
			}
		}
	}

}
