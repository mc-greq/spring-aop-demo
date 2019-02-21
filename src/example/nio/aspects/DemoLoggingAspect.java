package example.nio.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoLoggingAspect {

    // this is a collection of our ADVICES

    // start with @Before advice
//    @Before("execution(void addAccount())")
    @Before("execution(void example.nio.dao.AccountDAO.addAccount())")
    public void beforeAddAccountAdvice(){
        System.out.println("\n====> Executing @Before advice on addAccount()");

    }

    @Before("execution(void add*())")
    public void beforeAddAccountAdviceWildcard(){
        System.out.println("\n====> Executing @Before advice with wildcard on addAccount()");

    }



}
