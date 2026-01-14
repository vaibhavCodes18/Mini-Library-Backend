package com.example.MiniLibraryBackend.service;

import com.example.MiniLibraryBackend.dto.MemberRequestDto;
import com.example.MiniLibraryBackend.dto.MemberResponseDto;
import com.example.MiniLibraryBackend.entity.Member;
import com.example.MiniLibraryBackend.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService{
    @Autowired
    private MemberRepository memberRepository;
    @Override
    public MemberResponseDto addMember(MemberRequestDto memberRequestDto) {
        Member member = new Member();
        member.setName(memberRequestDto.getName());
        member.setEmail(memberRequestDto.getEmail());

        Member savedMember = memberRepository.save(member);
        MemberResponseDto memberResponseDto = new MemberResponseDto();
        memberResponseDto.setMemberId(savedMember.getId());
        memberResponseDto.setName(savedMember.getName());
        memberResponseDto.setEmail(savedMember.getEmail());
        return memberResponseDto;
    }
}
