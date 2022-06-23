package hello.core.autowired;

import hello.core.member.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.lang.Nullable;

import java.util.Optional;

public class AutowiredTest {

    @Test
    void AutowiredOption(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);
    }

    //임의의 테스트 빈
    static class TestBean{

        //스프링 컨테이너에 관리 되지 않는 클래스
        @Autowired(required = false)
        public void setNoBean1(Member bean1) {
            System.out.println("bean1 = " + bean1);
        }

        @Autowired
        public void setNoBean2(@Nullable Member bean2) {
            System.out.println("bean2 = " + bean2);
        }

        @Autowired
        public void setNoBean3(Optional<Member> noBean3) {
            System.out.println("noBean3 = " + noBean3);
        }
    }
}
