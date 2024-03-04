package first_hw_di.Component;
import first_hw_di.Config.Crib;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class StudentWorkB {
    // Внедренние DI через поле
    @Autowired
    Crib crib;
    public void studentWorkBWorking() {
        crib.use();
        crib.descrip();
    }
}