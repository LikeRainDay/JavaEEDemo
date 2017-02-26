package AspectJ;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by housh on 2017/2/26.
 */
@Aspect
public class PointCut {
    /**
     * 定义的切点
     */
    @Pointcut("execution(* International.*.*(..))")
    public void myPointcut() {
    }

    /**
     * 调用定义的切点
     */
    @AfterReturning(returning = "rvt", pointcut = "myPointcut()")
    public void log(Object rvt) {

    }

}
