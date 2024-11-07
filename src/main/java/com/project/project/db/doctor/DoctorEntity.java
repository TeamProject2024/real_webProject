package org.project.project.db.doctor;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.project.project.db.BaseEntity;
import org.project.project.db.dentistry.DentistryEntity;

import java.time.LocalDate;

@Entity
@Table(name = "doctor")
@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class DoctorEntity extends BaseEntity {

    @Id
    private String docId;

    private String name;

    private LocalDate createdAt;

    @ManyToOne
    private DentistryEntity dentistry;
}
