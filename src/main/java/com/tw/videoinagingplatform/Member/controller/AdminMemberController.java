package com.tw.videoinagingplatform.Member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.tw.videoinagingplatform.Member.model.Message;
import com.tw.videoinagingplatform.Member.model.MemberService;

@Controller
public class AdminMemberController {

	@Autowired
	MemberService memberService;

	@GetMapping(path = "createmember")
	public String insertMember(Message member) {
		return "/admin/member/InsertMember";
	}

	@GetMapping(path = "deletemember/{member_id")
	public String deleteMember(int member_id, Message member) {
		return "/admin/member/QueryAll";
	}

	@GetMapping(path = "update/{member_id}")
	public String updatemember(int member_id, Message member) {
		return "/admin/member/QueryAll";
	}
	
//	@GetMapping(path = "query/all")
//	public String querymember()
}
