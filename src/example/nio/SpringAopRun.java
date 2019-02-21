package example.nio;

import example.nio.dao.AccountDAO;
import example.nio.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAopRun {

    public static void main(String[] args) {

        // read spring configuration java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DemoConfig.class, MyLoggerConfig.class);

        // get the bean from container
        AccountDAO accountDAO = context.getBean(AccountDAO.class);
        MembershipDAO membershipDAO = context.getBean(MembershipDAO.class);

        // call the business method
        accountDAO.addAccount();
        membershipDAO.addAccount();

        // close the context
        context.close();
    }
}
