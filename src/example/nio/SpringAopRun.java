package example.nio;


import example.nio.dao.AccountDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAopRun {

    public static void main(String[] args) {

        // read spring configuration java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DemoConfig.class);

        // get the bean from container
        AccountDAO accountDAO = context.getBean(AccountDAO.class);

        // call the business method
        accountDAO.addAccount();

        // close the context
        context.close();
    }
}
