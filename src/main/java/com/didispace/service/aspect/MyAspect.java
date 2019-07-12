package com.didispace.service.aspect;

import org.aspectj.lang.annotation.*;

@Aspect
public class MyAspect {


    //@Pointcut 用来定义切点，他标注在方法pointCut中，
    //后面的before，after，afterReturning,afterThrowing 注解就可以使用方法来定义了
    //execution 表示执行的时候拦截里面的正则匹配方法。
    // * 表示任意返回类型的方法
    // com.didispace.service.impl.UserServiceImple 指定目标对象的全限定名称
    // printUser 指定目标对象的方法
    // (..) 表示任意参数进行匹配
    @Pointcut("execution( * com.didispace.service.impl.UserServiceImple.printUser (..) )")
    public void pointCut(){

    }

    @Before("pointCut()")
    public void before(){
        System.out.println("*** before........");
    }

    @After("pointCut()")
    public void after(){
        System.out.println("*** after.........");
    }

    @AfterThrowing("pointCut()")
    public void afterThrowing(){
        System.out.println("*** after throwing....");
    }

    @AfterReturning("pointCut()")
    public void afterReturning(){
        System.out.println("*** afterReturning....");
    }
}
