package org.projectvoyage.voyage.app.model.entity.base;

/**
 * Base class for all business entities
 * @author
 */


import org.projectvoyage.voyage.app.model.entity.person.Account;

import java.time.LocalDateTime;
import java.util.Objects;

public class AbstractEntity {
    private int id;

    private LocalDateTime createdAt;

    private LocalDateTime modifiedAt;

    private Account createBy;

    private Account modifiedBy;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(LocalDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public Account getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Account createBy) {
        this.createBy = createBy;
    }

    public Account getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Account modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractEntity that = (AbstractEntity) o;
        return id == that.id && Objects.equals(createdAt, that.createdAt) && Objects.equals(modifiedAt, that.modifiedAt) && Objects.equals(createBy, that.createBy) && Objects.equals(modifiedBy, that.modifiedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createdAt, modifiedAt, createBy, modifiedBy);
    }
}
