package dev.be.feign.common.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(Include.NON_NULL) // 이건 만약 name이라는 변수의 값이 없으면 해당 필드를 제외해주는 어노테이션이다.
public class BaseRequestInfo {

    private String name;
    private Long age;
}
