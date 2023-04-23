package dev.be.feign.config;

import dev.be.feign.feign.logger.FeignCustomLogger;
import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 여기가 client관련된 설정하는 global한 config다.
public class FeignConfig {

    /**
     * 내가만든 logger를 등록시켜준다.
     */
    @Bean
    public Logger feignLogger() {
        return new FeignCustomLogger();
    }

}
