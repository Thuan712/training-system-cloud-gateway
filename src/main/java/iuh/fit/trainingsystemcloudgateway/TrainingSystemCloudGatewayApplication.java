package iuh.fit.trainingsystemcloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Mono;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class TrainingSystemCloudGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrainingSystemCloudGatewayApplication.class, args);
    }

    @Bean
    public KeyResolver remoteAddrKeyResolver() {
        return exchange -> Mono.just("1");
    }
}
