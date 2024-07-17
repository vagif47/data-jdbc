package ru.aliev.jdbc_example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocConsentDTO {
    private String consentType;
    private boolean signetBank;
    private boolean signetMfk;
    private Long metadataId;
    private String storageKey;
    private String fileName;
    private String mdmId;
}