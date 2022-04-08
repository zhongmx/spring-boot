package smoketest.tomcat.custom.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author: zmx
 * @create: 2022/04/08 15:34
 * @description:
 */
@Order(2)
@Component
public class CustomFirstCommandLineRunner implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {
		System.out.println("custom first command line runner .....");
	}
}
