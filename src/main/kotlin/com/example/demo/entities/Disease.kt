package com.example.demo.entities

import javax.persistence.CascadeType
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.OneToMany
import javax.persistence.Table
import org.jetbrains.annotations.NotNull

@Entity
@Table(name = "disease")
class Disease(
        val diseaseName: String = "",
        val diseaseDetails: String = "",
        val status: Int = 0,
        val seekPersonId: Long = -1, // Basically Belongs form patientID
        val admissionId: Long = -1,
        @NotNull
        @ManyToOne(cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
        @JoinColumn(name = "patientId")
        val patient: Patient,
        @OneToMany(cascade = [CascadeType.ALL], fetch = FetchType.LAZY, mappedBy = "disease")
        val receipts: List<Receipt>? =null,
        @Id @GeneratedValue(strategy = GenerationType.SEQUENCE) val problemId: Long? = null
)
