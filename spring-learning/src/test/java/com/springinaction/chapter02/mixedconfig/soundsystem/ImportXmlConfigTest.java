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
@ContextConfiguration(classes = SoundSystemConfig.class)
public class ImportXmlConfigTest {

	@Rule
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();

	@Autowired
	private MediaPlayer player;


	@Test
	public void play() {
		// 配置类里面使用 @ImportSource 导入xml resource，解析使用xml配置的bean
		player.play();
		assertEquals(
				"Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles" + System.lineSeparator() +
						"-Track: Sgt. Pepper's Lonely Hearts Club Band" + System.lineSeparator() +
						"-Track: With a Little Help from My Friends" + System.lineSeparator() +
						"-Track: Lucy in the Sky with Diamonds" + System.lineSeparator() +
						"-Track: Getting Better" + System.lineSeparator() +
						"-Track: Fixing a Hole" + System.lineSeparator(),
				log.getLog());
	}

}
