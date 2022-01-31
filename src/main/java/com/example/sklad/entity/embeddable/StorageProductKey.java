package com.example.sklad.entity.embeddable;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.UUID;

@Embeddable
@Data
@MappedSuperclass
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class StorageProductKey implements Serializable {

    @Column(name = "product_uuid")
    @Type(type = "uuid-char")
    @NotNull
    private UUID productUUID;

    @Column(name = "storage_uuid")
    @Type(type = "uuid-char")
    @NotNull
    private UUID storageUUID;

}
