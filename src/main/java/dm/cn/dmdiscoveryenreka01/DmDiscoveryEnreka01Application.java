package dm.cn.dmdiscoveryenreka01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DmDiscoveryEnreka01Application {
    /**
     * 测试GIT
     * @param args
     */
    public static void main(String[] args) {

        SpringApplication.run(DmDiscoveryEnreka01Application.class, args);


    }
}
