package com.exam.lashagagnidze.entity;

import com.exam.lashagagnidze.enums.RecordState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class AppEntity {

    @CreatedDate
    @Column(name = "CREATE_DATE", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @JsonIgnore
    protected Date createdDate;

    @LastModifiedDate
    @Column(name = "UPDATE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonIgnore
    protected Date lastModifiedDate;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "RECORD_STATE", nullable = false)
    @JsonIgnore
    protected RecordState recordState = RecordState.ACTIVE;
}