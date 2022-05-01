package com.expand;

import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.xml.BeanDefinitionDecorator;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Attr;
import org.w3c.dom.Node;

public class CarDescInitializingBeanDefinitionDecorator implements BeanDefinitionDecorator {
	@Override
	public BeanDefinitionHolder decorate(Node node, BeanDefinitionHolder definition, ParserContext parserContext) {
		String desc = ((Attr) node).getValue();
		definition.getBeanDefinition().getPropertyValues().addPropertyValue("desc", desc);
		return definition;
	}
}
