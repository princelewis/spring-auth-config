package com.usbtc.kiosk.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * AppConfiguration
 */
@Configuration
public class AppConfiguration {

  // Overriding configurations like this cannot be in an autoconfigured
  // configuration
  @Bean
  public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
    PropertySourcesPlaceholderConfigurer pc = new PropertySourcesPlaceholderConfigurer();
    pc.setTrimValues(true);
    return pc;
  }
}