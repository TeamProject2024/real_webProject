package org.project.project.db.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.project.project.db.BaseEntity;
import org.project.project.db.admin.AdminId;
import org.project.project.db.dentistry.DentistryEntity;

@Entity
@Table(name = "user")
@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class AdminEntity extends BaseEntity {

    @EmbeddedId
    private AdminId adminId;  // 복합 기본 키 (병원 코드 + 이메일)

    @Column(length = 20)
    private String adminName;

    @Column(length = 20)
    private String tel;

    @Column(length = 20)
    private String authorityClass;

//    @ManyToOne
//    @JoinColumn(name = "businessNum", referencedColumnName = "businessNum", insertable = false, updatable = false)
//    private DentistryEntity dentistry;  // 병원과 연결 (복합 키 사용)

}
