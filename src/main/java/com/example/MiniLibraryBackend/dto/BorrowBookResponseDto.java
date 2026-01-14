package com.example.MiniLibraryBackend.dto;

import java.time.LocalDate;

public class BorrowBookResponseDto {
    private Long borrowBookId;
    private Long memberId;
    private Long bookId;
    private String bookName;
    private String author;
    private String memberName;
    private LocalDate borrowDate;

    public BorrowBookResponseDto() {
    }

    public Long getBorrowBookId() {
        return borrowBookId;
    }

    public void setBorrowBookId(Long borrowBookId) {
        this.borrowBookId = borrowBookId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }
}
