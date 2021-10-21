package com.example.demo.repositories

import com.example.demo.entities.Receipt
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository interface ReceiptRepository : JpaRepository<Receipt, Long> {}
