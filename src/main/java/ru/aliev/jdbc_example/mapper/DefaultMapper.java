package ru.aliev.jdbc_example.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import ru.aliev.jdbc_example.consent.DocConsent;
import ru.aliev.jdbc_example.dto.DocConsentDTO;
import ru.aliev.jdbc_example.dto.MetadataDTO;
import ru.aliev.jdbc_example.metadata.Metadata;

@Mapper(componentModel = "spring")
public interface DefaultMapper {

//    @Mapping(target = "metadataId", expression = "java(mapMetadataIdToMetadata(docConsentDTO.getMetadataId()))")
    DocConsent toDocConsent(DocConsentDTO docConsentDTO);
    Metadata toMetadata(MetadataDTO metadataDTO);

//    @Named("mapMetadataIdToMetadata")
//    default Metadata mapMetadataIdToMetadata(Long metadataId) {
//        if (metadataId == null) {
//            return null;
//        }
//        Metadata metadata = new Metadata();
//        metadata.setId(metadataId);
//        return metadata;
//    }
}
