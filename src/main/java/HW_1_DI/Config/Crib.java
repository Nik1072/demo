package HW_1_DI.Config;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j2;

@Log4j2

public class Crib implements Working {
    public Crib() {
    }
    public void use(){
        log.info("I copy...");
    }
    public void descrip() { log.info("Cheating"); }

    @PostConstruct
    public void postConstruct() {
        log.info("Bean Crib created");
    }

    @PreDestroy
    public void preDestroy() {
        log.info("Bean Crib destroyed");
    }
}