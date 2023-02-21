package com.codeclan.filesandfolders.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "files")
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "size")
    private int size;

    @ManyToOne
    @JoinColumn(name = "folder_id", nullable = true)
    @JsonIgnoreProperties({ "files" })
    private Folder folder;

    public File(int size, Folder folder) {
        this.size = size;
        this.folder = folder;
    }

    public File(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }
}
