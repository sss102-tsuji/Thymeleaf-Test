package jp.co.soramasu.service.impl;

import jp.co.soramasu.service.HelloService;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceImpl implements HelloService {
    @Override
    public String saySomething() {
        return "Spring-MVCへようこそ";
    }
}
