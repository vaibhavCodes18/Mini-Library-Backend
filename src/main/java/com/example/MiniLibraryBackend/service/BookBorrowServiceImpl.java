package com.example.MiniLibraryBackend.service;

import com.example.MiniLibraryBackend.dto.BorrowBookRequestDto;
import com.example.MiniLibraryBackend.dto.BorrowBookResponseDto;
import com.example.MiniLibraryBackend.entity.Book;
import com.example.MiniLibraryBackend.entity.BorrowRecord;
import com.example.MiniLibraryBackend.entity.Member;
import com.example.MiniLibraryBackend.repository.BookRepository;
import com.example.MiniLibraryBackend.repository.BorrowRecordRepository;
import com.example.MiniLibraryBackend.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
@Service
public class BookBorrowServiceImpl implements BookBorrowService{
    @Autowired
    private MemberRepository memberRepository;
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private BorrowRecordRepository borrowRecordRepository;
    @Override
    public BorrowBookResponseDto borrowBook(BorrowBookRequestDto borrowBookRequestDto) {
        Member member = memberRepository.findById(borrowBookRequestDto.getMemberId()).orElseThrow(()->new RuntimeException("Member not found"));
        Book book = bookRepository.findById(borrowBookRequestDto.getBookId()).orElseThrow(()-> new RuntimeException("Book not found"));

        BorrowRecord borrowRecord = new BorrowRecord();
        borrowRecord.setMember(member);
        borrowRecord.setBook(book);
        borrowRecord.setBorrowedBook(LocalDate.now());
        
        BorrowRecord savedRecord = borrowRecordRepository.save(borrowRecord);

        BorrowBookResponseDto borrowBookResponseDto = getBorrowBookResponseDto(savedRecord);


        return borrowBookResponseDto;
    }

    private static BorrowBookResponseDto getBorrowBookResponseDto(BorrowRecord savedRecord) {
        BorrowBookResponseDto borrowBookResponseDto = new BorrowBookResponseDto();
        borrowBookResponseDto.setBorrowBookId(savedRecord.getId());
        borrowBookResponseDto.setBookId(savedRecord.getBook().getId());
        borrowBookResponseDto.setMemberId(savedRecord.getMember().getId());
        borrowBookResponseDto.setBookName(savedRecord.getBook().getBookName());
        borrowBookResponseDto.setAuthor(savedRecord.getBook().getAuthor());
        borrowBookResponseDto.setMemberName(savedRecord.getMember().getName());
        borrowBookResponseDto.setBorrowDate(savedRecord.getBorrowedBook());
        return borrowBookResponseDto;
    }
}
