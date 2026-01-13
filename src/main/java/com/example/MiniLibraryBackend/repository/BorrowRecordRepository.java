package com.example.MiniLibraryBackend.repository;

import com.example.MiniLibraryBackend.entity.BorrowRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowRecordRepository extends JpaRepository<BorrowRecord, Long> {
}
