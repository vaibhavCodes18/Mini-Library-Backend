package com.example.MiniLibraryBackend.dto;

import java.util.ArrayList;
import java.util.List;

public class BorrowHistoryResponseDto {
    private Long borrowId;
    private String memberName;
    private String memberEmail;
    private List<BookDetail> books = new ArrayList<>();

    public BorrowHistoryResponseDto() {
    }

    public Long getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(Long borrowId) {
        this.borrowId = borrowId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public List<BookDetail> getBooks() {
        return books;
    }

    public void setBooks(List<BookDetail> books) {
        this.books = books;
    }
}
