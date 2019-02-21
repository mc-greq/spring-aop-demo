package example.nio.dao;

import jdk.jfr.Label;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    public void addAccount(){
        System.out.println(getClass() + ": doing some db work: add account");
    }

}
