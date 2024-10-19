package in.hd.main.advices;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Aspect
@Component
public class MyAdvice {

	@Pointcut("execution(* in.hd.main.services.UserService.*(..)) ")
	public void pointCutMethod() {}
	
	@Before("pointCutMethod()")
	public void beforeAdvice(JoinPoint joinpoint) {
		System.out.println("execute before advice...");
	}
	
	@After("pointCutMethod()")
	public void afterAdvice(JoinPoint joinpoint) {
		System.out.println("execute after advice...");
	}
	
	@Around("pointCutMethod()")
	public void aroundAdvice(ProceedingJoinPoint point) throws Throwable {
		System.out.println("around advide...");
		point.proceed();
		
	}
	
	
	@AfterReturning("pointCutMethod()")
	public void afterRetunAdvice(JoinPoint joinPoint) {
		System.out.println("after returning advice...");
	}
	
	@AfterThrowing(value="pointCutMethod()", throwing = "exception")
	public void afterThrow(JoinPoint joinPoint,Exception exception) {
		
		System.out.println("here is an exception ..."+joinPoint);
		System.out.println("Exception is:..."+exception.getMessage());
		
	}
	

}
