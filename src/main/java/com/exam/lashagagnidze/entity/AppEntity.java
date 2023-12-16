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
@FieldDefaults(level = AccessLevel.PROTECTED)
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class AppEntity {

    @CreatedDate
    @Column(updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @JsonIgnore
    Date createdDate;

    @LastModifiedDate
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    @JsonIgnore
    Date lastModifiedDate;

    @Enumerated(EnumType.ORDINAL)
    @Column(nullable = false)
    @JsonIgnore
    RecordState recordState = RecordState.ACTIVE;
}