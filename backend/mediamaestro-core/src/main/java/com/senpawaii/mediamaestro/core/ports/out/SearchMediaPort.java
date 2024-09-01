package com.senpawaii.mediamaestro.core.ports.out;

import com.senpawaii.mediamaestro.core.domain.Media;

import java.util.List;
import java.util.Optional;

public interface SearchMediaPort {
    List<Media> findAll(); // Fetch all media entries
    Optional<Media> findById(String id); // Fetch media by ID
}
