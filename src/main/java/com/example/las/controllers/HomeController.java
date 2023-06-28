package com.example.las.controllers;

import com.example.las.member.Member;
import com.example.las.member.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value="/")
@RequiredArgsConstructor
public class HomeController {

    private  final MemberService memberService;

    @RequestMapping(value= "/")
    public  String home(){
        return "/main/home";
    }
}
