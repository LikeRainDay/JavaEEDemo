package AspectJ;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by housh on 2017/2/26.
 */
@Aspect
public class TextAspect {

    @Around("execution(* International.*.*(..))")
    public Object processTx(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("执行目标方法之前，模拟开始事务");
        Object[] args = proceedingJoinPoint.getArgs();
        if (args != null && args.length > 1) {
            args[0] = "[增加的前缀]" + args[0];
        }
        Object proceed = proceedingJoinPoint.proceed(args);
        System.out.println("执行目标方法之后，模拟事物结束。。。");
        if (proceed != null && proceed instanceof Integer)
            proceed = (Integer) proceed * (Integer) proceed;

        return proceed;
    }


}


