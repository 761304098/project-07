import com.sun.bean.Ying;
import com.sun.bean.zhuban;
import com.sun.service.YingServiceImpl;
import com.sun.service.zhubanServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class YingTest {
    @Test
    public void YingTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        YingServiceImpl impl = context.getBean("yingServiceImpl", YingServiceImpl.class);
        List<Ying> yings = impl.queryForAll();
        for (Ying ying : yings) {
            System.out.println(ying);
        }
    }
}
