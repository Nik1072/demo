package first_hw_di.Component;
import first_hw_di.Config.Information;
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