package com.tt;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Map;

public class Book implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
	private String bookName;
	private DefaultListableBeanFactory beanFactory;

	public Book() {
		System.out.println("Book Initializing ");
	}

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = (DefaultListableBeanFactory) beanFactory;
		Map<String, Book> beansOfType = ((DefaultListableBeanFactory) beanFactory).getBeansOfType(Book.class);


		System.out.println("Book.setBeanFactory invoke");

		Book book = beansOfType.get("book1");
		System.out.println(book);
	}

	public void setBeanName(String name) {
		System.out.println("Book.setBeanName invoke");
	}

	public void destroy() throws Exception {
		System.out.println("Book.destory invoke");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Book.afterPropertiesSet invoke");
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("Book.setApplicationContext invoke");
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
		System.out.println("setBookName: Book name has set.");
	}

	public void myPostConstruct() {
		System.out.println("Book.myPostConstruct invoke");
	}

	// 自定义初始化方法
	@PostConstruct
	public void springPostConstruct() {
		System.out.println("@PostConstruct");
	}

	public void myPreDestroy() {
		System.out.println("Book.myPreDestroy invoke");
		System.out.println("---------------destroy-----------------");
	}

	// 自定义销毁方法
	@PreDestroy
	public void springPreDestory() {
		System.out.println("@PreDestory");
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("------inside finalize-----");
	}
}
