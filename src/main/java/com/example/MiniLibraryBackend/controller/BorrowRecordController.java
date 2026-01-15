package com.example.MiniLibraryBackend.controller;

import com.example.MiniLibraryBackend.dto.BorrowBookRequestDto;
import com.example.MiniLibraryBackend.dto.BorrowBookResponseDto;
import com.example.MiniLibraryBackend.dto.BorrowHistoryResponseDto;
import com.example.MiniLibraryBackend.response.ApiResponse;
import com.example.MiniLibraryBackend.service.BookBorrowService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/borrowbook")
public class BorrowRecordController {

    @Autowired
    private BookBorrowService bookBorrowService;
    @PostMapping
    public ResponseEntity<?> borrowBook(@Valid @RequestBody BorrowBookRequestDto borrowBookRequestDto){
        BorrowBookResponseDto borrowBookResponseDto = bookBorrowService.borrowBook(borrowBookRequestDto);
        return new ResponseEntity<>(new ApiResponse<>(201, "Book borrowed!", borrowBookResponseDto), HttpStatus.CREATED);
    }

    @GetMapping("/history/{memberId}")
    public ResponseEntity<?> getBorrowHistoryById(@PathVariable("memberId") Long memberId){
        BorrowHistoryResponseDto borrowHistoryResponseDto = bookBorrowService.getBorrowHistoryById(memberId);
        return new ResponseEntity<>(new ApiResponse<>(200, "History Fetched!", borrowHistoryResponseDto), HttpStatus.OK);
    }

}
