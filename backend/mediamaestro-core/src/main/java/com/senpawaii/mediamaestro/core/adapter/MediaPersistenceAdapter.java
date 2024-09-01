package com.senpawaii.mediamaestro.core.adapter;

import com.senpawaii.mediamaestro.core.domain.Media;
import com.senpawaii.mediamaestro.core.ports.out.SearchMediaPort;
import com.senpawaii.mediamaestro.core.service.MediaPersistenceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class MediaPersistenceAdapter implements SearchMediaPort {
    private final MediaPersistenceService mediaPersistenceService;

    @Override
    public List<Media> findAll() {
        return List.of();
    }

    @Override
    public Optional<Media> findById(String id) {
        return Optional.empty();
    }
}
