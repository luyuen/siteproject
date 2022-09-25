package com.tw.videoinagingplatform.Member.model;

import java.util.Optional;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class MemberService {
	
	@Autowired
	private MemberRepository memberRepository;
	
	public Message insert(Message member ) {
		return memberRepository.save(member);
	}
	
	public boolean delete(int member_id) {
		Optional<Message> id = memberRepository.findById(member_id);
		if(id.isPresent()) {
			memberRepository.deleteById(member_id);
			return true;
		}
		return false;
	}
	public boolean update(int member_id, Message member) {
		Optional<Message> id = memberRepository.findById(member_id);
		if(id.isPresent()) {
			memberRepository.save(member);
			return true;
		}
		return false;
	}
	public List<Message> queryAll(){
		return memberRepository.findAll();
	}
	
	public Message queryBYId(int member_id) {
		Optional<Message> id = memberRepository.findById(member_id);
		
		if(id.isPresent()) {
			return id.get();
		}
		return null;
	}
}
