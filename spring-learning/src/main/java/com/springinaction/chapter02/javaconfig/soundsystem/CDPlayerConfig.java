package com.springinaction.chapter02.javaconfig.soundsystem;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {
  
  @Bean
  public CompactDisc compactDisc() {
    return new SgtPeppers();
  }
  
  @Bean
  public CDPlayer cdPlayer(CompactDisc compactDisc) {	// 这里 spring 会自动注入对应类型的bean
    return new CDPlayer(compactDisc);
  }

}
