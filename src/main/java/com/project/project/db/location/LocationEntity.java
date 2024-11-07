package org.project.project.db.location;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.project.project.db.BaseEntity;
import org.project.project.db.user.UserEntity;

@Entity
@Table(name = "location")
@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class LocationEntity extends BaseEntity {
    private String latitude;

    private String longitude;

    @ManyToOne
    private UserEntity userEntity;
}
