package ru.aliev.jdbc_example.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import ru.aliev.jdbc_example.dto.MetadataDTO;
import ru.aliev.jdbc_example.event.MetadataSavedEvent;
import ru.aliev.jdbc_example.mapper.DefaultMapper;
import ru.aliev.jdbc_example.metadata.Metadata;
import ru.aliev.jdbc_example.repository.DocConsentRepository;
import ru.aliev.jdbc_example.repository.MetadataRepository;

import java.util.Optional;


@Service
@RequiredArgsConstructor
@Slf4j
public class MetadataServiceImpl implements MetadataService{

    private final MetadataRepository repository;
    private final DocConsentRepository consentRepository;
    private final ApplicationEventPublisher eventPublisher;
    private final DefaultMapper mapper;


    public void processMetadataUpload(MetadataDTO dto){
        Metadata metadata = mapper.toMetadata(dto);
        repository.save(metadata);
        saveToDocConsentMetadataId(metadata);
        eventPublisher.publishEvent(new MetadataSavedEvent(metadata));
    }

    private void saveToDocConsentMetadataId(Metadata metadata){
        Optional<Metadata> saveId = repository.findById(metadata.getId());
        if(saveId.isPresent()){
            Metadata data = saveId.get();
            consentRepository.saveMetadataId(data.getId());
        }
    }

    public void delete(Long id){
        repository.deleteById(id);
    }


}
