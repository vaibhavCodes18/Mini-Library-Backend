package com.example.MiniLibraryBackend.controller;

import com.example.MiniLibraryBackend.dto.BookRequestDto;
import com.example.MiniLibraryBackend.dto.BookResponseDto;
import com.example.MiniLibraryBackend.response.ApiResponse;
import com.example.MiniLibraryBackend.service.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping
    public ResponseEntity<?> addBook(@Valid @RequestBody BookRequestDto bookRequestDto){
        BookResponseDto bookResponseDto = bookService.addBook(bookRequestDto);
        return new ResponseEntity<>(new ApiResponse<>(201, "Book added!", bookResponseDto), HttpStatus.CREATED);
    }
}
