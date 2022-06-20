package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        //탐색할 패키지의 시작 위치를 지정하기 위함
        basePackages = "hello.core",
        //앞에 만들어 놓은 설정 정보를 가져오는 것을 방지하기 위해
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

}
