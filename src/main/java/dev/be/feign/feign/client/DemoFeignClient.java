package dev.be.feign.feign.client;

import dev.be.feign.common.dto.BaseResponseInfo;
import dev.be.feign.feign.config.DemoFeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
        name = "demo-client", // pk같은 개념이다. 이 페인클라이언트의 이름이다.
        url = "${feign.url.prefix}", //요청을 보내고자 하는 타겟 서버의 url값을 여기에 적는다. => application.properties에서 관리
        configuration = DemoFeignConfig.class//이 feignClient에선 어떤 config를 적용할지 지정할수 있다.
)
public interface DemoFeignClient {

    @GetMapping("/get")
    ResponseEntity<BaseResponseInfo> callGet(@RequestHeader("CustomHeaderName") String customHeader,
                                             @RequestParam("name") String name,
                                             @RequestParam("age") Long age);

}
