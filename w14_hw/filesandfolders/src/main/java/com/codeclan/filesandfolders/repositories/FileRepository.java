package com.codeclan.filesandfolders.repositories;

import com.codeclan.filesandfolders.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // indicates to Spring that we can manage an instance of this as a repository
public interface FileRepository extends JpaRepository<File, Long> {
}
