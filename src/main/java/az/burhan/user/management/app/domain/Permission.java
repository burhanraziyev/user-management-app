package az.burhan.user.management.app.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.Hibernate;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.Objects;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Getter
@Setter
@Entity
@Builder
@DynamicInsert
@DynamicUpdate
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "permissions")
@EntityListeners(AuditingEntityListener.class)
public class Permission {

    @Id
    @SequenceGenerator(name = "permission_id_seq", sequenceName = "permission_id_seq")
    @GeneratedValue(strategy = SEQUENCE, generator = "permission_id_seq")
    @Column(updatable = false, insertable = false, nullable = false)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false, unique = true)
    private String description;

    @CreatedDate
    @DateTimeFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    @Column(nullable = false, insertable = false, updatable = false)
    private LocalDateTime createdDate;

    @CreatedBy
    @Column(nullable = false, insertable = false, updatable = false)
    private String createdBy;

    @LastModifiedDate
    @DateTimeFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    @Column(nullable = false, insertable = false)
    private LocalDateTime lastModifiedDate;

    @LastModifiedBy
    @Column(nullable = false, insertable = false)
    private String lastModifiedBy;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Permission permission = (Permission) o;
        return id != null && Objects.equals(id, permission.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

}
