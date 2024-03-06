// Внедренние DI через поле

package HW_1_DI.Component;

import HW_1_DI.Config.Crib;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentWorkB {

    @Autowired
    Crib crib;

    public void StudentWorkBWorking() {
        crib.use();
        crib.descrip();
    }
}