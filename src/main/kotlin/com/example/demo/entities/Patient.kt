package com.example.demo.entities

import javax.persistence.CascadeType
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = "patient")
class Patient(
        @OneToMany(cascade = [CascadeType.ALL], fetch = FetchType.LAZY, mappedBy = "patient")
        val diseases: List<Disease>? = null,
        @Id @GeneratedValue(strategy = GenerationType.SEQUENCE) val patientId: Long? = null
)
