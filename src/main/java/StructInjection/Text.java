package StructInjection;

import ValueInjection.service.Persion;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by housh on 2017/2/22.
 */
public class Text {
    public static void main(String[] args) throws Exception {

        ApplicationContext cpa = new ClassPathXmlApplicationContext("beans.xml");
        Persion chinese = cpa.getBean("chineseStruct", Persion.class);
        chinese.useAxe();
/*国际化调用*/
//        International.Persion persion = cpa.getBean("persion", International.Persion.class);
//        persion.sayHi("你好");


    }
}
