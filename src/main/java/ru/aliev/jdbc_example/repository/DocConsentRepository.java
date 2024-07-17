package ru.aliev.jdbc_example.repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.aliev.jdbc_example.consent.DocConsent;
import ru.aliev.jdbc_example.dto.DocConsentDTO;
import ru.aliev.jdbc_example.metadata.Metadata;

@Repository
public interface DocConsentRepository extends CrudRepository<DocConsent, Long> {
    @Query("SELECT * " +
            "FROM doc.doc_consents dc " +
            "JOIN doc.metadata m ON dc.metadata_id = m.id " +
            "WHERE dc.id = :id")
    DocConsentDTO findDocConsentWithMetadataById(Long id);

    void deleteById(Long id);

    @Query("UPDATE doc_consent SET metadata_id = :metadataId WHERE id = :id")
    void saveMetadataId(Long id);

    @Query("UPDATE doc.doc_consents SET metadata_id = :metadataId WHERE id = :id")
    void updateMetadataId(Long id, Long metadataId);
}
