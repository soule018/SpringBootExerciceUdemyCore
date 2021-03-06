package com.mycompany.dvdstore.entity;


import javax.persistence.*;

@Entity
@Table(name="movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition="BIGINT")
    Long id;
    String title;
    String genre;
    String description;

    public Movie(String title, String genre, Long id) {
        this.title = title;
        this.genre = genre;
        this.id = id;
    }

    public Movie(String title, String genre, Long id, String description) {
        this.title = title;
        this.genre = genre;
        this.id = id;
        this.description = description;
    }

    public Movie() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
