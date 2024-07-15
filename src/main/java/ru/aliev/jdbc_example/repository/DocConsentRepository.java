package ru.aliev.jdbc_example.repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import ru.aliev.jdbc_example.consent.DocConsent;
import ru.aliev.jdbc_example.dto.DocConsentMetadataDTO;


public interface DocConsentRepository extends CrudRepository<DocConsent, Long> {
    @Query("SELECT * " +
            "FROM doc.doc_consents dc " +
            "JOIN doc.metadata m ON dc.metadata_id = m.id " +
            "WHERE dc.id = :id")
    DocConsentMetadataDTO findDocConsentWithMetadataById(Long id);

    DocConsent findByConsentType(String type);

    void deleteById(Long id);
}
