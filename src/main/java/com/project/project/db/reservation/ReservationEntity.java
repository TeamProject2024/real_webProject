package org.project.project.db.reservation;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.project.project.db.BaseEntity;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "reservation")
@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class ReservationEntity extends BaseEntity {
    @EmbeddedId
    private ReservationId reservationId; //복합키 (병원코드 + 이메일 + 예약일)

    private String content; //예약 내용

    private LocalDateTime modifyReserveationAt;

    //TODO 의사, 사용자, 치과 연결 필요
}
