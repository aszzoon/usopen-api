package com.usopen.usopenapi

import jakarta.persistence.Column
import jakarta.persistence.EntityListeners
import jakarta.persistence.MappedSuperclass
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime

@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
class BaseEntity {

    @CreatedDate
    @Column(name = "\"REG_DT\"", updatable = false, columnDefinition = "TIMESTAMP")
    protected open var regDate: LocalDateTime = LocalDateTime.now()

    @LastModifiedDate
    @Column(name = "\"MDFCN_DT\"", columnDefinition = "TIMESTAMP")
    protected open var modData: LocalDateTime = LocalDateTime.now()
}
