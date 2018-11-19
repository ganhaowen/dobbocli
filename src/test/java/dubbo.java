import com.baizhi.service.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class dubbo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:dubbo.xml");
        HelloService helloService = (HelloService) context.getBean("helloService");
        String msg = helloService.hello("嘻嘻");
        System.out.println(msg);
    }
}
