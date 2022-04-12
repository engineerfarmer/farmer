package org.farmer.spring.app.lifecycle;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * @author wuwenjun
 * @since 2022.04.11 22:31
 */
@Slf4j
@Component
public class InitAndDestroyFoo {

  @Resource private DependencyFoo dependencyFoo;

  public InitAndDestroyFoo() {
    log.info("Execute constructor");
  }

  @PostConstruct
  public void init() {
    log.info("Executing init {}", this.dependencyFoo);
  }

  @PreDestroy
  public void destroy() {
    log.info("Executing destroy");
  }
}
