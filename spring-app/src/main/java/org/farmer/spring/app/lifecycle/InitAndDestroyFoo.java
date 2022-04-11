package org.farmer.spring.app.lifecycle;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author wuwenjun
 * @since 2022.04.11 22:31
 */
@Slf4j
@Component
public class InitAndDestroyFoo {

  @PostConstruct
  public void init() {
    log.info("Executing init");
  }

  @PreDestroy
  public void destroy() {
    log.info("Executing destroy");
  }
}
