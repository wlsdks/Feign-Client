package dev.be.feign.feign.config;

import dev.be.feign.feign.interceptor.DemoFeignInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoFeignConfig {

    // 여기서 interceptor설정을 bean으로 추가해줘야한다.
    @Bean
    public DemoFeignInterceptor feignInterceptor() {
        return DemoFeignInterceptor.of(); // 여기서 of는 @RequiredArgsConstructor(staticName = "of") 인터셉터에 이렇게 설정해줘서 그렇게쓴것이다.
    }
}
