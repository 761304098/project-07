import com.sun.bean.Xian;
import com.sun.bean.Ying;
import com.sun.service.XianServiceImpl;
import com.sun.service.YingServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class XianTest {
    @Test
    public void YingTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        XianServiceImpl impl = context.getBean("xianServiceImpl", XianServiceImpl.class);
        List<Xian> xians = impl.queryForAll();
        for (Xian xian : xians) {
            System.out.println(xians);
        }
    }
}
