package com.example.myApp.domain.workers.worker;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "worker", schema = "upkeep")
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "email", length = 200)
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "job_title", length = 100)
    private String jobTitle;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "hourly_rate", precision = 4, scale = 4)
    private BigDecimal hourlyRate;

}