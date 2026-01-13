package com.example.MiniLibraryBackend.repository;

import com.example.MiniLibraryBackend.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
