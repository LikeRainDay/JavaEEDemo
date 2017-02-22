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


    }
}
