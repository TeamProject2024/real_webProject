package org.project.project.db.treatment;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.project.project.db.BaseEntity;

import java.time.LocalDateTime;

@Entity
@Table(name = "treatment")
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class TreatmentEntity extends BaseEntity {
    private LocalDateTime treatDate;
    private String treatContent;
}
