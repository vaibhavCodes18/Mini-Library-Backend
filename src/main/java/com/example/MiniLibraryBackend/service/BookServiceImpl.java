package com.example.MiniLibraryBackend.service;

import com.example.MiniLibraryBackend.dto.BookRequestDto;
import com.example.MiniLibraryBackend.dto.BookResponseDto;
import com.example.MiniLibraryBackend.entity.Book;
import com.example.MiniLibraryBackend.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class BookServiceImpl implements BookService{
    @Autowired
    private BookRepository bookRepository;
    @Override
    public BookResponseDto addBook(BookRequestDto bookRequestDto) {
        Book book = new Book();
        book.setBookName(bookRequestDto.getBookName());
        book.setAuthor(bookRequestDto.getAuthor());

        Book addedBook = bookRepository.save(book);

        BookResponseDto bookResponseDto = new BookResponseDto();
        bookResponseDto.setBookId(addedBook.getId());
        bookResponseDto.setBookName(addedBook.getBookName());
        bookResponseDto.setAuthor(addedBook.getAuthor());
        return bookResponseDto;
    }
}
