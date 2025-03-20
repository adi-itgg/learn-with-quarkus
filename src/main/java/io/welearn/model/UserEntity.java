package io.welearn.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.OffsetDateTime;

@Entity(name = "m_user")
public class UserEntity extends PanacheEntity {

    @Column(length = 30)
    private String name;

    @Column(length = 20)
    private String phone;

    @Column(length = 50, unique = true)
    private String email;

    @Column(length = 500)
    private String password;

    @CreationTimestamp
    @Column(name = "created_at", columnDefinition = "TIMESTAMPTZ DEFAULT NOW()")
    private OffsetDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", columnDefinition = "TIMESTAMPTZ DEFAULT NOW()")
    private OffsetDateTime updatedAt;

}
