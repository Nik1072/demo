package first_hw_di.component;
import first_hw_di.config.Information;
import org.springframework.stereotype.Component;
@Component
public class StudentWorkA {
    Information information;
    // Внедренние DI через конструктор
    public StudentWorkA(Information information) { this.information = information; }
    public void studentWorkAWorking() {
        information.use();
        information.descrip();
    }
}