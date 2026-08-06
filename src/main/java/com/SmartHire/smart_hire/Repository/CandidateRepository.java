package com.SmartHire.smart_hire.Repository;

import com.SmartHire.smart_hire.Entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {
}
