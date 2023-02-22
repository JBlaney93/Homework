package com.codeclan.filesandfolders.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity // indicates to spring it is a managed entity, aka spring will handle mapping to database
@Table(name = "files")
public class File {

    @Id // every class that is an @entity needs an @id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // this is a way of us telling spring how the id will be generated
    private Long id;

    @Column(name = "name") // @column is technically not required but it is good to be explicit
    private String name;

    @Column(name = "size")
    private int size;

    @ManyToOne
    @JoinColumn(name = "folder_id", nullable = true)
    @JsonIgnoreProperties({ "files" }) // name of property on related class that points back
    private Folder folder;

    public File(String name, int size, Folder folder) {
        this.name = name;
        this.size = size;
        this.folder = folder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
