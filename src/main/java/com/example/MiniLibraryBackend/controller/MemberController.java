package com.example.MiniLibraryBackend.controller;

import com.example.MiniLibraryBackend.dto.MemberRequestDto;
import com.example.MiniLibraryBackend.dto.MemberResponseDto;
import com.example.MiniLibraryBackend.response.ApiResponse;
import com.example.MiniLibraryBackend.service.MemberService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/member")
public class MemberController {
    @Autowired
    private MemberService memberService;
    @PostMapping
    public ResponseEntity<?> saveMember(@Valid @RequestBody MemberRequestDto memberRequestDto){
        MemberResponseDto memberResponseDto = memberService.addMember(memberRequestDto);
        return new ResponseEntity<>(new ApiResponse<>(201, "Member added!", memberResponseDto), HttpStatus.CREATED);
    }
}
