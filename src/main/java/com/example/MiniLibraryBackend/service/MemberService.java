package com.example.MiniLibraryBackend.service;

import com.example.MiniLibraryBackend.dto.MemberRequestDto;
import com.example.MiniLibraryBackend.dto.MemberResponseDto;

public interface MemberService {
    MemberResponseDto addMember(MemberRequestDto memberRequestDto);
}
