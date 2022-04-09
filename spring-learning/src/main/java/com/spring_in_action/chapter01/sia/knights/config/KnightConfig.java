package com.spring_in_action.chapter01.sia.knights.config;

import com.spring_in_action.chapter01.sia.knights.BraveKnight;
import com.spring_in_action.chapter01.sia.knights.Knight;
import com.spring_in_action.chapter01.sia.knights.Quest;
import com.spring_in_action.chapter01.sia.knights.SlayDragonQuest;
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
