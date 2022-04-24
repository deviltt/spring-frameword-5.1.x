package com.springinaction.chapter02.mixedconfig.soundsystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(CDPlayerConfig.class)
@ImportResource("classpath:chapter02/mixedconfig/cd-config.xml")
public class SoundSystemConfig {

}
