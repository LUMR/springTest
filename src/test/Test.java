package test;

import aop.ServiceLogging;
import dao.IUserBiz;
import entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.IUserService;

/**
 * Created by lumr on 2017/4/24.
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        IUserService service = (IUserService) ctx.getBean("userService");
        service.saveUser(new User("luml"));
//        ServiceLogging logging = (ServiceLogging) ctx.getBean("serviceLogging");
//        logging.beforeService();
    }
}
