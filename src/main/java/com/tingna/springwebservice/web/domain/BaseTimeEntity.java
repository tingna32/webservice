package com.tingna.springwebservice.web.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass //JPA Entity 클래스들이 BaseTimeEntity를 상속 할 경우 (createdDate,modifiedDate)도 컬럼으로 인식
@EntityListeners(AuditingEntityListener.class)//auditing기능을 포함
public abstract class BaseTimeEntity {

    @CreatedDate //Entity가 생성되어 저장 될 때 시간이 자동 저장
    private LocalDateTime createdDate;

    @LastModifiedDate //조회한 Entity의 값을 변경 할 때 시간 자동 저장
    private LocalDateTime modifiedDate;

}