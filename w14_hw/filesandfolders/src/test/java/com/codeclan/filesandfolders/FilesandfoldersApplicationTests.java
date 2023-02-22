package com.codeclan.filesandfolders;

import com.codeclan.filesandfolders.models.File;
import com.codeclan.filesandfolders.models.Folder;
import com.codeclan.filesandfolders.models.Person;
import com.codeclan.filesandfolders.repositories.FileRepository;
import com.codeclan.filesandfolders.repositories.FolderRepository;
import com.codeclan.filesandfolders.repositories.PersonRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@ActiveProfiles("test")
@SpringBootTest
class FilesandfoldersApplicationTests {

	@Autowired
	PersonRepository personRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreatePersonAndFolderAndFile(){
		Person person = new Person("Jim");
		personRepository.save(person);

		Folder folder = new Folder("Things", person);
		folderRepository.save(folder);

		File file = new File("thing", 10, folder);
		fileRepository.save(file);
	}

}
