package dev.be.feign.feign.interceptor;

import feign.Request;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;

import java.nio.charset.StandardCharsets;
import java.util.Objects;

@RequiredArgsConstructor(staticName = "of")
public class DemoFeignInterceptor implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate template) {

        // get 요청일 경우
        if (Objects.equals(template.method(), Request.HttpMethod.GET.name())) {
            System.out.println("[GET] [DemoFeignInterceptor] queries : " + template.queries());
            return;
        }

        // post 요청일 경우
        String encodedRequestBody = StringUtils.toEncodedString(template.body(), StandardCharsets.UTF_8);
        System.out.println("[POST] [DemoFeignInterceptor] requestBody: " + encodedRequestBody);

        // 추가적으로 본인이 필요한 로직을 추가한다.

        String convertRequestBody = encodedRequestBody;
        template.body(convertRequestBody);
    }
}