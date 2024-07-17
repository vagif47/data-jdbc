package ru.aliev.jdbc_example.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.aliev.jdbc_example.dto.MetadataDTO;
import ru.aliev.jdbc_example.metadata.Metadata;
import ru.aliev.jdbc_example.service.MetadataService;

@RestController
@RequiredArgsConstructor
public class MetadataController {

    private final MetadataService metadataService;

    @PostMapping("/save-metadata")
    public void saveMetadata(@RequestBody MetadataDTO metadataDTO){
        metadataService.processMetadataUpload(metadataDTO);
    }

    @GetMapping("/get-metadata")
    public Metadata getMetadata(Long id){
        return null;
    }

    @DeleteMapping("delete-all-documents/{id}")
    public ResponseEntity<HttpStatus> deleteMetadataWithConsents(@PathVariable Long id) {
        try {
            metadataService.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
