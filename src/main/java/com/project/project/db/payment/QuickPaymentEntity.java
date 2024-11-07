package org.project.project.db.payment;

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
import org.project.project.db.user.UserEntity;

import java.time.LocalDate;

@Entity
@Table(name = "quick")
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class QuickPaymentEntity extends BaseEntity {

    @Id
    private String cardNum;

    private String bankName;

    private LocalDate createdAt;

    private LocalDate updateAt;

    @ManyToOne
    private UserEntity userEntity;
}
