package first_hw_di.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
@Configuration
public class BasisForWorkConfig {
    @Bean
    @Scope(value = "prototype")
    public Information information() {
        return new Information();
    }
    @Bean
    @Scope(value = "prototype")
    public Crib crib() {
        return new Crib();
    }
}