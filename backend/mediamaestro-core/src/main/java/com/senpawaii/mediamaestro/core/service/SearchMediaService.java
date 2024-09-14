package com.senpawaii.mediamaestro.core.service;

import com.senpawaii.mediamaestro.core.domain.Media;
import com.senpawaii.mediamaestro.core.ports.in.SearchMediaUseCase;
import com.senpawaii.mediamaestro.core.ports.out.SearchMediaPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class SearchMediaService implements SearchMediaUseCase {
    private final SearchMediaPort mediaRepositoryPort;


    @Override
    public List<Media> fetchAllMedia() {
        return mediaRepositoryPort.findAll();
    }

    @Override
    public Optional<Media> fetchMediaById(String id) {
        return Optional.empty();
    }

    @Override
    public <T extends Media> List<T> fetchAllMediaOfType(Class<T> mediaType) {
        return List.of();
    }
}
