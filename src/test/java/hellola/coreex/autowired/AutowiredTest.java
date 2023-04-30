package hellola.coreex.autowired;

import hellola.coreex.member.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.lang.Nullable;

import java.util.Optional;

public class AutowiredTest {


    @Test
    void AutowiredOption() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);
    }

    static class TestBean {
        @Autowired(required = false)
        public void setA(Member member) {
            System.out.println("member = " + member);
        }

        @Autowired
        public void setB(@Nullable Member member) {
            System.out.println("discountPolicy = " + member);
        }

        @Autowired
        public void setA(Optional<Member> Member) {
            System.out.println("Member = " + Member);
        }


    }
}
