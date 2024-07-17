package ru.aliev.jdbc_example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MetadataDTO {

    private String storageKey;
    private String fileName;
}
