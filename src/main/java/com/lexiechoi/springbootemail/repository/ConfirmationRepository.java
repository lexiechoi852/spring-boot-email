package com.lexiechoi.springbootemail.repository;

import com.lexiechoi.springbootemail.domain.Confirmation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConfirmationRepository extends JpaRepository<Confirmation, Long> {
    Confirmation findByToken(String token);
}
