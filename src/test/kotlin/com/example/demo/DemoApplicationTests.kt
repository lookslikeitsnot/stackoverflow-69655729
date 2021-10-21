package com.example.demo

import com.example.demo.entities.Disease
import com.example.demo.entities.Patient
import com.example.demo.entities.Receipt
import com.example.demo.repositories.PatientRepository
import com.example.demo.repositories.ReceiptRepository
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.jdbc.Sql

@SpringBootTest
class DemoApplicationTests {
  @Autowired private lateinit var patientRepository: PatientRepository

  @Autowired private lateinit var receiptRepository: ReceiptRepository

  @Test fun contextLoads() {}

  @Test
  @Sql(scripts = ["/patient.sql"])
  fun readPatient() {
    assert(patientRepository.findById(3000).isPresent)
  }

  @Test
  @Sql(scripts = ["/receipt.sql"])
  fun readReceipt() {
    assert(receiptRepository.findById(100).isPresent)
  }

  @Test
  fun savePatient() {
    val patient: Patient = Patient()

    val savedPatient = patientRepository.save(patient)

    println(savedPatient)

    assert(savedPatient.patientId != 0L)
  }

  @Test
  fun saveReceipt() {
    val patient: Patient = Patient()
    val disease1: Disease = Disease(diseaseName = "Smallpox", patient = patient)
    val disease2: Disease = Disease(diseaseName = "Flu", patient = patient)
    val receipt11: Receipt = Receipt(details = "Receipt 11", disease = disease1)
    val receipt12: Receipt = Receipt(details = "Receipt 12", disease = disease1)
    val receipt21: Receipt = Receipt(details = "Receipt 21", disease = disease2)
    val receipt22: Receipt = Receipt(details = "Receipt 22", disease = disease2)

    val savedReceipts =
        receiptRepository.saveAll(listOf(receipt11, receipt12, receipt21, receipt22))

    println(savedReceipts)

    assert(savedReceipts.size == 4)
  }
}
