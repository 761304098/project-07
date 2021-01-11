import com.sun.bean.Cpu;
import com.sun.bean.zhuban;
import com.sun.service.CpuServiceImpl;
import com.sun.service.zhubanServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class zhubanTest {
    @Test
    public void zhubanTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        zhubanServiceImpl impl = context.getBean("zhubanServiceImpl", zhubanServiceImpl.class);
        List<zhuban> zhubans = impl.queryForAll();
        for (zhuban zhuban : zhubans) {
            System.out.println(zhuban);
        }
    }
}
