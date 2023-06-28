package com.example.las.controllers;

import com.example.las.member.Member;
import com.example.las.member.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping(value = "/memberList")
    public String memberList(Model model){

        List<Member> list = new ArrayList<>();
        list = memberService.memberList();
        model.addAttribute("members", list);

        return "/band/memberList";
    }
}
