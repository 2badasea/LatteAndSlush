package com.example.las.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MemberService{
    private final  MemberMapper memberMapper;

    public List<Member> memberList(){
        return memberMapper.memberList();
    }
}
