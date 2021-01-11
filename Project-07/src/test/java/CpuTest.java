/*
import com.sun.bean.Cpu;
import com.sun.bean.User;
import com.sun.service.CpuServiceImpl;
import com.sun.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CpuTest {
    @Test
    public void CpuTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CpuServiceImpl impl = context.getBean("cpuServiceImpl", CpuServiceImpl.class);
        List<Cpu> list = impl.queryForSeries("酷睿i3");
        for (Cpu cpu : list) {
            System.out.println(cpu);
        }
    }
}
*/
