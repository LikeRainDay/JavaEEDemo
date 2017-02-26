package AspectJ;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

/**
 * 切入
 * Created by housh on 2017/2/26.
 */
@Aspect
public class LogoAspect {

    @AfterReturning(returning = "o", pointcut = "execution(* International.*.*(..) )")
    public void Login(Object o) {
        System.out.println("获取目标方法的返回值：" + o);
    }


}
