package com.senpawaii.mediamaestro.core.ports.in;

import com.senpawaii.mediamaestro.core.domain.Media;

import java.util.List;
import java.util.Optional;

public interface SearchMediaUseCase {
    List<Media> fetchAllMedia();
    Optional<Media> fetchMediaById(String id);
    <T extends Media> List<T> fetchAllMediaOfType(Class<T> mediaType);
}
