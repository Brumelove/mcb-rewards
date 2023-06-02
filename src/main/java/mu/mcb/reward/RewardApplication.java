package mu.mcb.reward;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.util.TimeZone;
/**
 * @author Brume
 */
@SpringBootApplication
@EnableFeignClients
public class RewardApplication {
    public static void main(String[] args)
	{
        SpringApplication.run(RewardApplication.class, args);
    }

}
