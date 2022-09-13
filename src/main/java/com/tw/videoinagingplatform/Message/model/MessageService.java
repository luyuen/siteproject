package com.tw.videoinagingplatform.Message.model;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class MessageService {

	@Autowired
	private MessageRepository messageRepository;

	public Message insert(Message message) {
		return messageRepository.save(message);
	}

	public boolean delete(int message_id) {
		Optional<Message> id = messageRepository.findById(message_id);
		if (id.isPresent()) {
			messageRepository.deleteById(message_id);
			return true;
		}
		return false;
	}

	public boolean update(int message_id, Message message) {
		Optional<Message> id = messageRepository.findById(message_id);
		if (id.isPresent()) {
			messageRepository.save(message);
			return true;
		}
		return false;
	}

	public List<Message> queryAll() {
		return messageRepository.findAll();
	}

	public Message queryById(int message_id) {
		Optional<Message> id = messageRepository.findById(message_id);
		if (id.isPresent()) {
			return id.get();
		}
		return null;
	}
}
