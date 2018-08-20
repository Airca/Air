package springcloud.netflix_zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import springcloud.netflix_zuul.filter.AccessFilter;

@EnableZuulProxy
@SpringCloudApplication
public class NetflixZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixZuulApplication.class, args);
	}

	@Bean
	public AccessFilter accessFilter() {
		return new AccessFilter();
	}

}
