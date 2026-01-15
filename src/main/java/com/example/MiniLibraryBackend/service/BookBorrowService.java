package com.example.MiniLibraryBackend.service;

import com.example.MiniLibraryBackend.dto.BorrowBookRequestDto;
import com.example.MiniLibraryBackend.dto.BorrowBookResponseDto;
import com.example.MiniLibraryBackend.dto.BorrowHistoryResponseDto;

public interface BookBorrowService {
    BorrowBookResponseDto borrowBook(BorrowBookRequestDto borrowBookRequestDto);
    BorrowHistoryResponseDto getBorrowHistoryById(Long borrowId);
}
