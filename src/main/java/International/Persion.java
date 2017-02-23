package International;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Locale;


/**
 * Created by housh on 2017/2/23.
 */
public class Persion implements ApplicationContextAware {


    private ApplicationContext ctx;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.ctx = applicationContext;
    }


    public void sayHi(String name) {

        System.out.println(ctx.getMessage("hello",new String[]{name}, Locale.getDefault()));
    }
}
