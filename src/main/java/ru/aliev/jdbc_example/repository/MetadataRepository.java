package ru.aliev.jdbc_example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.aliev.jdbc_example.metadata.Metadata;
@Repository
public interface MetadataRepository extends CrudRepository<Metadata, Long> {

}
