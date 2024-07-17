package ru.aliev.jdbc_example.consent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Reference;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import ru.aliev.jdbc_example.metadata.Metadata;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Table(schema = "doc", name = "doc_consents")
public class DocConsent {

    @Id
    @Column("id")
    private Long id;
    @Column("consent_type")
    private String consentType;
    @Column("signet_bank")
    private boolean signetBank;
    @Column("signet_mfk")
    private boolean signetMfk;
    @Column("mdm_id")
    private String mdmId;
    @Column("metadata_id")
    private Long metadataId;
}
