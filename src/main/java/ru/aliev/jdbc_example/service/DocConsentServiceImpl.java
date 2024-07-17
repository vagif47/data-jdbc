package ru.aliev.jdbc_example.service;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.aliev.jdbc_example.dto.DocConsentDTO;
import ru.aliev.jdbc_example.event.MetadataSavedEvent;
import ru.aliev.jdbc_example.consent.DocConsent;
import ru.aliev.jdbc_example.mapper.DefaultMapper;
import ru.aliev.jdbc_example.metadata.Metadata;
import ru.aliev.jdbc_example.repository.DocConsentRepository;
import ru.aliev.jdbc_example.repository.MetadataRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
@Data
public class DocConsentServiceImpl implements DocConsentService{

    private final DocConsentRepository repository;
    private final MetadataRepository metadataRepository;
    private final DefaultMapper mapper;


    public void saveDocument(DocConsent consent) {
        DocConsent docConsent = new DocConsent();
        docConsent.setConsentType(consent.getConsentType());
        docConsent.setSignetMfk(consent.isSignetMfk());
        docConsent.setSignetBank(consent.isSignetBank());
        docConsent.setMetadataId(consent.getMetadataId());
        docConsent.setMdmId(consent.getMdmId());
        repository.save(docConsent);
    }

    @Transactional
    public void processConsentUpload(DocConsentDTO dto){
        DocConsent docConsent = mapper.toDocConsent(dto);
        saveDocument(docConsent);
    }



    @EventListener
    public void metadataHandling(MetadataSavedEvent event){
        Metadata metadata = event.getMetadata();
        Optional<DocConsent> optionalDocConsent = repository.findById(metadata.getId());
        if(optionalDocConsent.isPresent()) {
            DocConsent docConsent = optionalDocConsent.get();
            saveMdmIdInMetadata(metadata, docConsent);
        }
    }

    private void saveMdmIdInMetadata(Metadata metadata, DocConsent docConsent) {
        String mdmId = docConsent.getMdmId();
        if (mdmId != null && !mdmId.isEmpty()) {
            Metadata newMetadata = metadata;
            newMetadata.setMdmId(mdmId);
            metadataRepository.save(newMetadata);
        }
    }
}
