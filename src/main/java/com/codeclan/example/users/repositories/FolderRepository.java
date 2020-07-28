package com.codeclan.example.users.repositories;

import com.codeclan.example.users.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
