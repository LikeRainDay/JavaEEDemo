package AspectJ;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by housh on 2017/2/26.
 */
@Aspect
public class AuthAspect {

    @Before("execution(* International.*.*(..))")
    public void authority() {
        System.out.println("你好吗！");
    }

}
