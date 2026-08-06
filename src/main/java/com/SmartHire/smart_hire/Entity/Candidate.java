package com.SmartHire.smart_hire.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "candidates")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String name;

    @Column(unique = true)
    private String email;

    private String phone;

    @Column(name = "resume_text")
    private String resumeText;

    @Column(name = "resume_file_path")
    private String resumeFilePath;

    @Column(name = "experience_years")
    private Integer experienceYears;

    private String status;

    @Column(name = "createdAt")
    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
        if (this.status == null) {
            this.status = "Pending";

        }
    }

}
