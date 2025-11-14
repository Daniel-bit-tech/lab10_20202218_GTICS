package com.example.lab10.Repository;

import com.example.lab10.Entity.Practicante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PracticantesRepository extends JpaRepository<Practicante, Long> {

}
