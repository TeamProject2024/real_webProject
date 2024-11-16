package com.example.demo.Record;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@Setter
@Table(name = "treatment")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Treatment {
    @Id
    @Column(name = "treat_id", nullable = false, length = 30)
    private String treatId;

    @Column(name = "user_email", nullable = false, length = 50)
    private String userEmail;

    @Column(name = "den_id", nullable = false, length = 30)
    private String denId;

    @Column(name = "treat_content", nullable = false, length = 255)
    private String treatContent;

    @Column(name = "treat_day", nullable = false)
    private LocalDateTime treatDay;

    @Column(name = "doc_id", length = 30)
    private String docId;

    @OneToMany(mappedBy = "treatment", cascade = CascadeType.ALL)
    private List<RecordTreatmentMapping> treatmentMappings;



}
