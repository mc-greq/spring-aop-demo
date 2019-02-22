package example.nio.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoLoggingAspect {

    // this is a collection of our ADVICES

    // this is how to declare pointcuts
    @Pointcut("execution(void example.nio.dao.AccountDAO.addAccount())")
    private void accountDaoAddAccount(){}

    @Pointcut("execution(* get*())")
    private void allGetters(){}

    @Pointcut("execution(void set*(..))")
    private void allSetters(){}

    // start with @Before advice
//    @Before("execution(void addAccount())")
    // here we are using our pointcut declarations and excluding one of them
    @Before("accountDaoAddAccount() && !allGetters()")
    public void beforeAddAccountAdvice(){
        System.out.println("\n====> Executing @Before advice on addAccount()");

    }

    @Before("accountDaoAddAccount()")
    public void beforeAddAccountAdviceNo2(){
        System.out.println("====> Another advice to demostrate reusing pointcut");
    }

    @Before("execution(void add*())")
    public void beforeAddAccountAdviceWildcard(){
        System.out.println("\n====> Executing @Before advice with wildcard on add*()");

    }

    @Before("execution(* add*())")
    public void beforeAddAccountAdviceAnyReturnType(){
        System.out.println("\n====> Executing @Before advice with wildcard matching on return type on add*()");
    }

    @Before("execution(void *())")
    public void beforeAddAccountAdviceVoidType(){
        System.out.println("\n====> Executing @Before advice matching on void functions");
    }

    @Before("execution(* add*(example.nio.Account))")
    public void beforeAddAccountWithParam(){
        System.out.println("\n====> Executing @Before advice matchin on parameter Account");
    }

    @Before("execution(void example.nio.dao.AccountDAO.addAmount(*)) && args(amount)")
    public void beforeAddAmountModifyAmount(int amount){
        System.out.println("\n====> Executing @Before advice intercepting method arguments and doing work on them: " +
                "\n initial amount: " + amount + ", modified amount: " + (amount + 10));
    }



}
