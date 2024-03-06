// Внедрение двух бинов, реализующих один интерфейс

package HW_1_DI.Component;

import HW_1_DI.Config.Working;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentWorkFin {
    @Autowired
    Working crib;

    @Autowired
    Working information;

    public void StudentWorkFinWorking() {
        crib.use();
        crib.descrip();
        information.use();
        information.descrip();
    }
}