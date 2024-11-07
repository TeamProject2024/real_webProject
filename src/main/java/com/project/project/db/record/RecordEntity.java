package org.project.project.db.record;

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

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "record")
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class RecordEntity extends BaseEntity {

    private String symptom; //환자 현재 증상

    private String diagnosisResult; //진단 결과

    private String treatmentMethod; //치료 방법
    
    private LocalDate treatmentDateAt; // 진료 내역 일자

    @ManyToOne
    private UserEntity userEntity;
}
