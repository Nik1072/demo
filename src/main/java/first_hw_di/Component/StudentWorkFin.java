package first_hw_di.Component;
import first_hw_di.Config.Working;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class StudentWorkFin {
    // Внедрение двух бинов, реализующих один интерфейс
    @Autowired
    Working crib;
    @Autowired
    Working information;
    public void studentWorkFinWorking() {
        crib.use();
        crib.descrip();
        information.use();
        information.descrip();
    }
}