package com.tt.replacemethod;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class MyReplaceMethod implements MethodReplacer {
	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("我是替换方法");
		return null;
	}
}
