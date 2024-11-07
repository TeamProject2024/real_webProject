package org.project.project.db.user;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.project.project.db.BaseEntity;
import org.project.project.db.location.LocationEntity;
import org.project.project.db.payment.QuickPaymentEntity;
import org.project.project.db.record.RecordEntity;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "user")
@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class UserEntity extends BaseEntity {

    @Id
    @Email
    @NotNull
    private String email;

    private String name;

    private String tel;

    private LocalDate birth;

    private boolean kakaoId;

    private boolean googleId;

    private LocalDate createAt;

    private Integer zip; //우편번호

    private String address;

    @OneToMany(mappedBy = "location" , cascade = CascadeType.REMOVE) //사용자 선호 위치
    private List<LocationEntity> locationList;

    @OneToMany(mappedBy = "record" , cascade = CascadeType.REMOVE) // 사용자 진료 내역
    private List<RecordEntity> recordList;

    @OneToMany(mappedBy = "quick") // 간단 결제
    private List<QuickPaymentEntity> quickList;
    //TODO 병원과 연결 필요
}
