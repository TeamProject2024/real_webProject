package org.project.project.db.dentistry;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.project.project.db.BaseEntity;
import org.project.project.db.doctor.DoctorEntity;
import org.springframework.data.annotation.Id;

import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "dentistry")
@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class DentistryEntity extends BaseEntity {

    @Id
    @NotNull
    private String businessNum; //사업자 번호

    private String denName;

    private String address;

    private Integer zip;

    private LocalTime weekDayOpenHours;

    private LocalTime weekDayCloseHours;

    private LocalTime weekEndOpenHours;

    private LocalTime weekEndCloseHours;

    private LocalTime lunchTime;

    private String service; //진료 항목

    private String dentistryIntroduction;

    @OneToMany(mappedBy = "dentistry" , cascade = CascadeType.REMOVE)
    private List<DoctorEntity> doctorList;
}
