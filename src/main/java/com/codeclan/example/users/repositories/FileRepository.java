package com.codeclan.example.users.repositories;

import com.codeclan.example.users.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
