package com.example.demo.repositories

import com.example.demo.entities.Patient
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository interface PatientRepository : JpaRepository<Patient, Long> {}
