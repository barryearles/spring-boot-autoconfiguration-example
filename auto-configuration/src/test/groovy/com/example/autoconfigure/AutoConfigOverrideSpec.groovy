package com.example.autoconfigure

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.SpringApplicationContextLoader
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

import static org.junit.Assert.assertEquals

@ContextConfiguration(
    classes = AutoConfigOverrideSpec.OverrideResultConfiguration,
    loader = SpringApplicationContextLoader
)
class AutoConfigOverrideSpec extends Specification {

    @Autowired
    AnnotationConfigApplicationContext applicationContext

    def "Test the provided @OverrideResultConfiguration has precedence over it's default configured in ServiceConfiguration"() {

        setup: 'Add the ServiceConfiguration configuration to the context'
        applicationContext.register(ServiceConfiguration)

        when: 'The Result bean is loaded from the spring application context'
        String result = applicationContext.getBean('result')

        then: 'The result bean should be custom-result'
        assertEquals 'custom-result', result
    }

    @Configuration
    static class OverrideResultConfiguration {
        @Bean
        public String result() {
            return 'custom-result';
        }
    }
}
