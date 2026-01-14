package com.example.MiniLibraryBackend.dto;

import jakarta.validation.constraints.NotNull;

public class BorrowBookRequestDto {
    @NotNull(message = "Book Id is required")
    private Long bookId;
    @NotNull(message = "Member Id is required")
    private Long memberId;

    public BorrowBookRequestDto() {
    }

    public @NotNull(message = "Book Id is required") Long getBookId() {
        return bookId;
    }

    public void setBookId(@NotNull(message = "Book Id is required") Long bookId) {
        this.bookId = bookId;
    }

    public @NotNull(message = "Member Id is required") Long getMemberId() {
        return memberId;
    }

    public void setMemberId(@NotNull(message = "Member Id is required") Long memberId) {
        this.memberId = memberId;
    }
}
