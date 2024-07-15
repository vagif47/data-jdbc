package ru.aliev.jdbc_example.repository;

import org.springframework.data.repository.CrudRepository;
import ru.aliev.jdbc_example.metadata.Metadata;

public interface MetadataRepository extends CrudRepository<Metadata, Long> {

    Metadata findByFileName (String fileName);
a
}
