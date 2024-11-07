package org.project.project.db.payment;

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
@Table(name = "payment")
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class PaymentEntity extends BaseEntity {
    private Integer payAmount; //결제 금액
    private String payMethod;
    private LocalDateTime payDate;
    private String payStatus;
    private boolean isRefunded; //환불여부
    private LocalDateTime refundAt;
}
