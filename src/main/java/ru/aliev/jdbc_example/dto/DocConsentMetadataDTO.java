package ru.aliev.jdbc_example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocConsentMetadataDTO {
    private Long docConsentId;
    private String consentType;
    private boolean signetBank;
    private boolean signetMfk;
    private Long metadataId;
    private String storageKey;
    private String fileName;
}