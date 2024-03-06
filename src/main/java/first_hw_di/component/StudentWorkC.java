package first_hw_di.component;
import first_hw_di.config.Information;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class StudentWorkC {
    Information information;
    // Внедренние DI через сеттер
    @Autowired
    public void setInformation(Information information) {
        this.information = information;
    }
    public void studentWorkCWorking() {
        information.use();
        information.descrip();
    }
}