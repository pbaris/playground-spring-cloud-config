package playground.scc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class PlaygroundSpringCloudConfigApplication {

	public static void main(String[] args) {
	    SpringApplication.run(PlaygroundSpringCloudConfigApplication.class, args);
	}
}
