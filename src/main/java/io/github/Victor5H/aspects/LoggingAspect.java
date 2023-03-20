package io.github.Victor5H.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class LoggingAspect {

	@Pointcut("execution(* io.github.Victor5H.services.ProductServiceImpl.multiply(..))")
	public void pointCut() {

	}

	@Before("pointCut()")
	public void logBefore() {
		System.out.println("before");
	}

	@After("execution(* io.github.Victor5H.services.ProductServiceImpl.multiply(..))")
	public void logAfter() {
		System.out.println("After");
	}

	@AfterReturning("pointCut()")
	public void logAfterReturning() {
		System.out.println("AFter returing");
	}

	@AfterThrowing(throwing = "error", pointcut = "pointCut()")
	public void afterThrowing(Throwable error) {
		System.out.println("After Throwing " + error);
	}

//	@Around("pointCut()")
//	public String logAround() {
//		System.out.println("Around");
//		return "dsf|";
//	}
}
