package com.fantastic.zbatis.reflection.invoker;

import java.lang.reflect.InvocationTargetException;

/**
 * @author zc
 * @Description
 * @create 2021-06-30 10:52
 */
public interface Invoker {
    Object invoke(Object target, Object[] args) throws IllegalAccessException, InvocationTargetException;

    Class<?> getType();

}
