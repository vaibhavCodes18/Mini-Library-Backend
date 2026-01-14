package com.example.MiniLibraryBackend.dto;

import java.time.LocalDate;

public class MemberResponseDto {
    private Long memberId;
    private String name;
    private String email;

    public MemberResponseDto() {
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
