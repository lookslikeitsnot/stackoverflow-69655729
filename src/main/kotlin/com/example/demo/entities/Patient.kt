package com.example.demo.entities

import javax.persistence.CascadeType
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity
data class Patient(
        @Id @GeneratedValue(strategy = GenerationType.AUTO) val patientId: Long = 0,
        @OneToMany(cascade = [CascadeType.ALL], fetch = FetchType.LAZY, mappedBy = "patient")
        val diseases: List<Disease>? = null
)
