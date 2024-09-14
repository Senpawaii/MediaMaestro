package com.senpawaii.mediamaestro.adapter.out.persistence.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "MOVIE")
public class MovieEntity extends MediaEntity {
    private String director; // TODO: This should an entity
    private int durationMinutes;

    @ManyToMany
    @JoinTable(
            name = "MOVIE_CAST",
            joinColumns = @JoinColumn(name = "MOVIE_ID"), // column in the junction table that will reference the primary key of MovieEntity
            inverseJoinColumns = @JoinColumn(name = "ACTOR_ID") // column in the junction table that will reference the primary key of ActorEntity
    )
    @Column(name = "ACTOR")
    private Set<ActorEntity> cast = new HashSet<>();

    private String imdbId;

}