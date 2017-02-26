package AspectJ;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by housh on 2017/2/26.
 */
@Aspect
public class RepairAspect {


    @AfterThrowing(throwing = "throwable", pointcut = "execution(* International.*.*(..))")
    public void doRecoverActions(Throwable throwable) {

    }
}
