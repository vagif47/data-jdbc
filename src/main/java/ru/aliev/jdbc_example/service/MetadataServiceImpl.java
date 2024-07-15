package ru.aliev.jdbc_example.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.aliev.jdbc_example.metadata.Metadata;
import ru.aliev.jdbc_example.repository.MetadataRepository;

@Service
@RequiredArgsConstructor
@Slf4j
public class MetadataServiceImpl implements MetadataService{

    private final MetadataRepository repository;

    @Transactional
    public void saveMetadata(Metadata meta) {
       Metadata metadata = new Metadata();
        metadata.setStorageKey(meta.getStorageKey());
        metadata.setFileName(meta.getFileName());
        repository.save(metadata);
    }
}
