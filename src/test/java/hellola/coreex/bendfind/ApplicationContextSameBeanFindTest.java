//package hellola.coreex.bendfind;
//
//import hellola.coreex.member.MemberRepository;
//import hellola.coreex.member.MemoryMemberRepository;
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.Map;
//
//import static org.junit.jupiter.api.Assertions.assertThrows;
//
//public class ApplicationContextSameBeanFindTest {
//
//    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SameBeanConfig.class);
//
//    @Test
//    @DisplayName("타입으로 조회시 같은 타입이 둘 이상 있으면, 중복 오류가 발생한다.")
//    void findBeanByTypeDuplicate() {
//
//        assertThrows(NoUniqueBeanDefinitionException.class,
//                () -> ac.getBean(MemberRepository.class));
//    }
//
//    @Test
//    @DisplayName("타입 조회시 둘 이상이면 빈 이름으로 지정")
//    void findBeanByName() {
//        MemberRepository memberRepository = ac.getBean("memberRepository1", MemberRepository.class);
//        Assertions.assertThat(memberRepository).isInstanceOf(MemberRepository.class);
//    }
//
//    @Test
//    @DisplayName("특정타입 모두 조회")
//    void findAllBeanByType() {
//        Map<String, MemberRepository> beansOfType = ac.getBeansOfType(MemberRepository.class);
//        for (String key : beansOfType.keySet()) {
//            System.out.println("key =" + key + " value =" + beansOfType.get(key));
//        }
//    }
//
//
//    @Configuration
//    static class SameBeanConfig {
//
//        @Bean
//        public MemberRepository memberRepository1() {
//            return new MemoryMemberRepository();
//        }
//
//        @Bean
//        public MemberRepository memberRepository2() {
//            return new MemoryMemberRepository();
//        }
//    }
//}
