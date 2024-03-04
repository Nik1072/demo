// Внедренние DI через конструктор

package HW_1_DI.Component;

import HW_1_DI.Config.Information;
import org.springframework.stereotype.Component;

@Component
public class StudentWorkA {
    Information information;

    public StudentWorkA(Information information) { this.information = information; }

    public void StudentWorkAWorking() {
        information.use();
        information.descrip();
    }
}




