package com.example.demo.entities

import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table
import javax.persistence.CascadeType

@Entity
@Table(name = "receipt")
class Receipt(
        val details: String = "",
        val barcode: String = "",
        val drug_details: String = "",
        val usage: String = "",
        val delivery_Date: LocalDate = LocalDate.now(),
        val diseaseId: Long = -1, // refere to  problmeID
        val patientId: Long = -1,
        val status: Int = 0,
        @ManyToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL]) @JoinColumn(name = "problemId") val disease: Disease,
        @Id @GeneratedValue(strategy = GenerationType.SEQUENCE) val receiptId: Long? = null
)
