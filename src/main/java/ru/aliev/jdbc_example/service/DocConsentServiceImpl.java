package ru.aliev.jdbc_example.service;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.aliev.jdbc_example.consent.DocConsent;
import ru.aliev.jdbc_example.repository.DocConsentRepository;

@Service
@RequiredArgsConstructor
@Slf4j
@Data
public class DocConsentServiceImpl implements DocConsentService{

    private final DocConsentRepository repository;
    @Transactional
    public void saveDocument(DocConsent consent) {
        DocConsent docConsent = new DocConsent();
        docConsent.setConsentType(consent.getConsentType());
        docConsent.setSignetMfk(consent.isSignetMfk());
        docConsent.setSignetBank(consent.isSignetBank());
        docConsent.setMetadataId(consent.getMetadataId());
        repository.save(docConsent);
    }
}
