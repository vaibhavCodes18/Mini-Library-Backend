package com.example.MiniLibraryBackend.service;

import com.example.MiniLibraryBackend.dto.BorrowBookRequestDto;
import com.example.MiniLibraryBackend.dto.BorrowBookResponseDto;

public interface BookBorrowService {
    BorrowBookResponseDto borrowBook(BorrowBookRequestDto borrowBookRequestDto);
}
