package com.ldlywt.springlearning.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

/**
 * <pre>
 *     author : lex
 *     e-mail : ldlywt@163.com
 *     time   : 2018/05/29
 *     desc   :
 *     version: 1.0
 * </pre>
 */
@Slf4j
public class MyApplicationStartedEventListener implements ApplicationListener<ApplicationStartingEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartingEvent applicationStartingEvent) {
        SpringApplication springApplication = applicationStartingEvent.getSpringApplication();
//        springApplication.setBanner(null);
        log.info("------------MyApplicationStartedEventListener---------------");
    }
}
