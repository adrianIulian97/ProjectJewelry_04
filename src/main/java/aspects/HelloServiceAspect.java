package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloServiceAspect {

//    @Before("execution(* services.HelloService.hello(..))")
//    public void before() {
//        System.out.println("A");
//    }
//
//    @After("execution(* services.HelloService.hello(..))")
//    public void after() {
//        System.out.println("B");
//    }
//
//    @AfterReturning("execution(* services.HelloService.hello(..))")
//    public void afterReturning() {
//        System.out.println("C");
//    }
//
//    @AfterThrowing("execution(* services.HelloService.hello(..))")
//    public void afterThrowing() {
//        System.out.println("D");
//    }

    @Around("execution(* services.HelloService.hello(..))")
    public Object arround(ProceedingJoinPoint jointPoint) {
        System.out.println("Something else");
        return "Something else :)";
    }
}
