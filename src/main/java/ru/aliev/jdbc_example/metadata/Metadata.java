package ru.aliev.jdbc_example.metadata;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "doc", name = "metadata")
public class Metadata {

    @Id
    @Column("id")
    private Long id;
    @Column("storage_key")
    private String storageKey;
    @Column("file_name")
    private String fileName;
    @Column("mdm_id")
    private String mdmId;
}
