package com.codeclan.example.users.components;

import com.codeclan.example.users.models.File;
import com.codeclan.example.users.models.Folder;
import com.codeclan.example.users.models.User;
import com.codeclan.example.users.repositories.FileRepository;
import com.codeclan.example.users.repositories.FolderRepository;
import com.codeclan.example.users.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;
    @Autowired
    FolderRepository folderRepository;
    @Autowired
    UserRepository userRepository;

    public DataLoader(){

    }
    public void run(ApplicationArguments args) {
        User newUser = new User("Kat");
        userRepository.save(newUser);


        Folder folder1 = new Folder(newUser, "CV");
        folderRepository.save(folder1);
        File file1 = new File("CV", "doc", 5, folder1);
        fileRepository.save(file1);
        File file2 = new File("CVnew", "doc", 5, folder1);
        fileRepository.save(file2);
        File file3 = new File("CV-updated", "doc", 5, folder1);
        fileRepository.save(file3);
    }
}
