package com.senpawaii.mediamaestro.adapter.out.persistence.entity;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "media_type")
@Table(name = "MEDIA")
public abstract class MediaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String genre;
    private int year;
    private String filePath;
}
