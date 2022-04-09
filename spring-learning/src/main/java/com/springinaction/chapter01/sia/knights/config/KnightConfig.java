package com.springinaction.chapter01.sia.knights.config;

import com.springinaction.chapter01.sia.knights.BraveKnight;
import com.springinaction.chapter01.sia.knights.Knight;
import com.springinaction.chapter01.sia.knights.Quest;
import com.springinaction.chapter01.sia.knights.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {

  @Bean
  public Knight knight() {
    return new BraveKnight(quest());
  }
  
  @Bean
  public Quest quest() {
    return new SlayDragonQuest(System.out);
  }

}
