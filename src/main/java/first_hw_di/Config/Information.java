package first_hw_di.Config;
import lombok.extern.log4j.Log4j2;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
@Log4j2
public class Information implements Working {
    public Information() {}
    public void use(){
        log.info("I think...");
    }
    public void descrip() { log.info("Knowledge and skills"); }
    @PostConstruct
    public void postConstruct() {
        log.info("Bean Information created");
    }
    @PreDestroy
    public void preDestroy() {
        log.info("Bean Information destroyed");
    }
}