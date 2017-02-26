package AspectJ;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by housh on 2017/2/26.
 */
@Aspect
//@Pointcut
public class FourAdviceTest {


    @Around("execution(* International.*.*(..))")
    public Object processTx(ProceedingJoinPoint joinPoint) {

        return null;
    }

    @Before("execution(* International.*.*(..))")
    public void authoBefore(JoinPoint joinPoint) {

    }

    @AfterReturning("execution(* International.*.*(..))")
    public void authoAfterReturning(JoinPoint joinPoint) {

    }

    @After("execution(* International.*.*(..))")
    public void authoAfter(JoinPoint joinPoint) {

    }

}
