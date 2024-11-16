package com.example.demo.Record;

import com.example.demo.UserEntity.UserEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name= "record")
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Record {
    @Id
    @Column(name = "user_email", nullable = false, length = 50)
    private String user_email;

    @Column(name = "symptom", length = 50)
    private String symptom;

    @Column(name = "diag_result", length = 100)
    private String diag_result;

    @Column(name = "treat_method", length = 100)
    private String treat_method;

    @Column(name = "rec_date", nullable = false)
    private LocalDateTime rec_date;

    //user table랑 many-to-one 관계
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_email",nullable = false)
    private UserEntity user;

    // Record_Treatment_mapping
    @OneToMany(mappedBy = "record", cascade = CascadeType.ALL)
    private List<RecordTreatmentMapping> treatmentMappings;












}
