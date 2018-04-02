package cn.devcenter.framework.zipkin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.context.ApplicationContext;

@SpringCloudApplication
@Slf4j
public class ZipkinServer {

    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext = SpringApplication.run(ZipkinServer.class);
        log.info("===== " + applicationContext.getId() + " started =====");
    }

}
