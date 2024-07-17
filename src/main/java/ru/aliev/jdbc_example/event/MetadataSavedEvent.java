package ru.aliev.jdbc_example.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import ru.aliev.jdbc_example.metadata.Metadata;

@Data
@AllArgsConstructor
public class MetadataSavedEvent {
    private Metadata metadata;
}
