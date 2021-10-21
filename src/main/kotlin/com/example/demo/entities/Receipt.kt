package com.example.demo.entities

import java.time.LocalDate
import javax.persistence.CascadeType
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Entity
data class Receipt(
        @Id @GeneratedValue(strategy = GenerationType.AUTO) val receiptId: Long = 0,
        val details: String,
        val delivery_Date: LocalDate = LocalDate.now(),
        val status: Int = 0,
        @ManyToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
        @JoinColumn(name = "problemId")
        val disease: Disease,
)
