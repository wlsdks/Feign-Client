package dev.be.feign.feign.config;

import dev.be.feign.feign.decoder.DemoFeignErrorDecoder;
import dev.be.feign.feign.interceptor.DemoFeignInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoFeignConfig {

    // 여기서 interceptor설정을 bean으로 추가해줘야한다. 여기는 global은 아니고 약간 지역이라고 보면된다.
    @Bean
    public DemoFeignInterceptor feignInterceptor() {
        return DemoFeignInterceptor.of(); // 여기서 of는 @RequiredArgsConstructor(staticName = "of") 인터셉터에 이렇게 설정해줘서 그렇게쓴것이다.
    }

    // 여기서 error처리로 만든 decoder를 빈 등록을 해준다.
    @Bean
    public DemoFeignErrorDecoder demoErrorDecoder() {
        return new DemoFeignErrorDecoder();
    }
}
