package ValueInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ValueInjection.service.Persion;

/**
 * Created by housh on 2017/2/22.
 */
public class BeanText  {
    public static void main(String[] args) throws Exception {
        //创建Spring的容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        //获取chinese实例
        Persion chinese = ctx.getBean("chinese", Persion.class);
        //调用useAxe()方法
        chinese.useAxe();
    }
}
