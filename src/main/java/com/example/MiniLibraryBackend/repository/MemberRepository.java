package com.example.MiniLibraryBackend.repository;

import com.example.MiniLibraryBackend.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
