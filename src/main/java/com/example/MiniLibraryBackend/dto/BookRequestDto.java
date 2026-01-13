package com.example.MiniLibraryBackend.dto;

import jakarta.validation.constraints.NotBlank;

public class BookRequestDto {
    @NotBlank(message = "Book Name is required")
    private String bookName;
    @NotBlank(message = "Author")
    private String author;

    public BookRequestDto() {
    }

    public @NotBlank(message = "Book Name is required") String getBookName() {
        return bookName;
    }

    public void setBookName(@NotBlank(message = "Book Name is required") String bookName) {
        this.bookName = bookName;
    }

    public @NotBlank(message = "Author") String getAuthor() {
        return author;
    }

    public void setAuthor(@NotBlank(message = "Author") String author) {
        this.author = author;
    }
}
