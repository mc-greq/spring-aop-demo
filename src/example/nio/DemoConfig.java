package example.nio;

import example.nio.aspects.DemoLoggingAspect;
import example.nio.dao.AccountDAO;
import example.nio.dao.MembershipDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("example.nio")
public class DemoConfig {

//    The code below would be required without @ComponentScan
//
//    @Bean
//    public MembershipDAO membershipDAO(){
//        return new MembershipDAO();
//    }
//
//    @Bean
//    public DemoLoggingAspect demoLoggingAspect(){
//        return new DemoLoggingAspect();
//    }
//
//    @Bean
//    public AccountDAO accountDAO(){
//        return new AccountDAO();
//    }
}
