package com.example.MiniLibraryBackend.service;

import com.example.MiniLibraryBackend.dto.BookRequestDto;
import com.example.MiniLibraryBackend.dto.BookResponseDto;

public interface BookService {
    BookResponseDto addBook(BookRequestDto bookRequestDto);
}
