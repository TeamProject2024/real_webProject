package org.project.project.db.admin;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class AdminId implements Serializable {

    private String businessNum; // 병원 코드
    private String email;


    /*
    위의 equals와 hashCode 메서드는 복합 키로 사용되는 AdminId 클래스의 객체가 두 개일 때,
    이들이 동일한 키를 가지고 있는지 비교하고 해시 코드를 생성하는 데 사용됩니다.
    이 메서드는 JPA에서 엔티티를 비교하거나, 컬렉션 (예: HashSet 또는 HashMap)에 저장할 때
    정확하게 식별하기 위해 반드시 필요합니다.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;  // 같은 객체일 경우 true 반환
        if (o == null || getClass() != o.getClass()) return false;  // 클래스가 다르거나 null인 경우 false 반환

        AdminId adminId = (AdminId) o;  // 비교할 객체를 AdminId로 캐스팅
        return businessNum.equals(adminId.businessNum) && email.equals(adminId.email);  // businessNum과 email 필드를 각각 비교
    }

    @Override
    public int hashCode() {
        return 31 * businessNum.hashCode() + email.hashCode();
    }
}
