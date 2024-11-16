package com.example.demo.Record;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "record_treatment_mapping")
public class RecordTreatmentMapping {

    @ManyToOne
    @JoinColumn(name = "user_email")
    private Record record;

    @ManyToOne
    @JoinColumn(name = "treat_id")
    private Treatment treatment;






}
