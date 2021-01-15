import com.sun.bean.Gu;
import com.sun.bean.Nei;
import com.sun.service.GuServiceImpl;
import com.sun.service.NeiServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuTest {
    @Test
    public void GuTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        GuServiceImpl ServiceImpl = context.getBean("guServiceImpl", GuServiceImpl.class);
        Map<String,Object> map =new HashMap<String, Object>();
         map.put("price1",1000);
         map.put("price2",2000);
        List<Gu> gus = ServiceImpl.queryForPrice2(map);
        for (Gu gu : gus) {
            System.out.println(gu);
        }
    }
}
