package smoketest.tomcat.custom.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author: zmx
 * @create: 2022/04/08 15:33
 * @description:
 */
@Order(1)
@Component
public class CustomFirstApplicationRunner implements ApplicationRunner {
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("custom first application runner .....");
	}
}
