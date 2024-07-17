package ru.aliev.jdbc_example.service;

import ru.aliev.jdbc_example.consent.DocConsent;
import ru.aliev.jdbc_example.dto.DocConsentDTO;

public interface DocConsentService {
    void saveDocument(DocConsent consent);

    public void processConsentUpload(DocConsentDTO dto);

}
