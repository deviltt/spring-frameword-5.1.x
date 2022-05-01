package com.expand;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class MyCustomAttributeHandler extends NamespaceHandlerSupport {
	@Override
	public void init() {
		registerBeanDefinitionDecoratorForAttribute("car-desc", new CarDescInitializingBeanDefinitionDecorator());
	}
}
