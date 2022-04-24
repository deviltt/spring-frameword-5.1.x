package com.springinaction.chapter02.mixedconfig.soundsystem;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:chapter02/mixedconfig/cdplayer-config.xml")
public class ImportJavaConfigTest {

	@Rule
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();

	@Autowired
	private MediaPlayer player;


	@Test
	public void play() {
		// 使用xml里面配置的bean，但是bean里面依赖的是配置方式声明的 bean
		player.play();
		assertEquals(
				"Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles" + System.lineSeparator(),
				log.getLog());
	}

}
