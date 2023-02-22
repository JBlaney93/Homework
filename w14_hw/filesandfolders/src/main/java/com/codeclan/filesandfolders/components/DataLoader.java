package com.codeclan.filesandfolders.components;

import com.codeclan.filesandfolders.models.File;
import com.codeclan.filesandfolders.models.Folder;
import com.codeclan.filesandfolders.models.Person;
import com.codeclan.filesandfolders.repositories.FileRepository;
import com.codeclan.filesandfolders.repositories.FolderRepository;
import com.codeclan.filesandfolders.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test") // run every time except test
@Component // this says to get an instance of this class
public class DataLoader implements ApplicationRunner {

    @Autowired // corresponding annotation to @component, make an instance of class available
    PersonRepository personRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    @Override // a way of us handling bespoke behaviour when we call run static method
    public void run(ApplicationArguments args) throws Exception {

        Person person = new Person("Jim");
        personRepository.save(person);

        Folder folder = new Folder("Things", person);
        folderRepository.save(folder);

        File file = new File("thing", 10, folder);
        fileRepository.save(file);


        Person person2 = new Person("Jimmy");
        personRepository.save(person2);

        Folder folder2 = new Folder("Things2", person);
        folderRepository.save(folder2);

        File file2 = new File("thing2", 10, folder);
        fileRepository.save(file2);


        Person person3 = new Person("Jimmer");
        personRepository.save(person3);

        Folder folder3 = new Folder("Things3", person);
        folderRepository.save(folder3);

        File file3 = new File("thing3", 10, folder);
        fileRepository.save(file3);


        Person person4 = new Person("Jimothy");
        personRepository.save(person4);

        Folder folder4 = new Folder("Things4", person);
        folderRepository.save(folder4);

        File file4 = new File("thing4", 10, folder);
        fileRepository.save(file4);

    }
}
