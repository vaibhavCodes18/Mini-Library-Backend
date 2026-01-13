package com.example.MiniLibraryBackend.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bookName;
    private String author;
    private LocalDate addedBook;


    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BorrowRecord> borrowRecords = new ArrayList<BorrowRecord>();

    public Book() {
    }

    @PrePersist
    public void onCreate(){
        this.addedBook = LocalDate.now();
    }
}
