package com.security.securityauth.abstractentities;

import jakarta.persistence.*;

import java.util.Date;
@MappedSuperclass
public class EntidadeAuditada extends AbstractEntity {

    @Column(updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    protected Date dataCriacao;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    protected Date dataUltimaAlteracao;

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Date getDataUltimaAlteracao() {
        return dataUltimaAlteracao;
    }

    public void setDataUltimaAlteracao(Date dataUltimaAlteracao) {
        this.dataUltimaAlteracao = dataUltimaAlteracao;
    }

    @PrePersist
    public void prePersist() {
        dataCriacao = new Date();
    }

}
