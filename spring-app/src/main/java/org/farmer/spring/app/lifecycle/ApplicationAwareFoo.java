package org.farmer.spring.app.lifecycle;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author wuwenjun
 * @since 2022.04.11 23:02
 */
@Slf4j
@Component
public class ApplicationAwareFoo implements ApplicationContextAware {
  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    // Print environment information.
    log.info("Environment {}", new Gson().toJson(applicationContext.getEnvironment()));
  }
}
