package dev.be.feign.controller;

import dev.be.feign.common.dto.BaseResponseInfo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/target_server") // -> 이건 application.yaml에 설정되어있는 url값이다.
public class TargetConroller {

    @GetMapping("/get")
    public BaseResponseInfo demoGet(@RequestHeader("customHeaderName") String header,
                                    @RequestParam("name") String name,
                                    @RequestParam("age") Long age) {
        return BaseResponseInfo.builder()
                                .header(header)
                                .name(name + "from target server")
                                .age(age)
                                .build();
    }
}
