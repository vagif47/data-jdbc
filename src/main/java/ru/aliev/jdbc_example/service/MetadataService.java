package ru.aliev.jdbc_example.service;

import ru.aliev.jdbc_example.dto.MetadataDTO;
import ru.aliev.jdbc_example.metadata.Metadata;

public interface MetadataService {
    void processMetadataUpload(MetadataDTO dto);
    void delete(Long id);
}
