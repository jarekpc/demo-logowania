package com.jarek.repo;


import com.jarek.model.Authorities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthoritiesRepository extends JpaRepository<Authorities, String> {
}
