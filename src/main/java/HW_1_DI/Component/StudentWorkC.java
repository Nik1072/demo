// Внедренние DI через сеттер

package HW_1_DI.Component;

import HW_1_DI.Config.Information;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentWorkC {
    Information information;

    @Autowired
    public void setInformation(Information information) {
        this.information = information;
    }

    public void StudentWorkCWorking() {
        information.use();
        information.descrip();
    }
}