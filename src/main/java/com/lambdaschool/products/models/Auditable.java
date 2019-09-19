package com.lambdaschool.products.models;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
abstract class Auditable
{
    @CreatedBy
    String createdby;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    Date createdate;

    @LastModifiedBy
    String lastmodifiedby;

    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    Date lastmodifieddate;
}
