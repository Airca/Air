package springcloud.computeservicetwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ComputeServiceTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComputeServiceTwoApplication.class, args);
	}
}
