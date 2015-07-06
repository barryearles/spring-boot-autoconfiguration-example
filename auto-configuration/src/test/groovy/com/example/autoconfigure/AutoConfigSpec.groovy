package com.example.autoconfigure

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.SpringApplicationContextLoader
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

import static org.junit.Assert.assertEquals

@ContextConfiguration(
    classes = ServiceConfiguration,
    loader = SpringApplicationContextLoader
)
class AutoConfigSpec extends Specification {

    @Autowired
    AnnotationConfigApplicationContext applicationContext

    def "Test the default @ServiceConfiguration is used"() {

        setup: 'Add the ServiceConfiguration configuration to the context'
        applicationContext.register(ServiceConfiguration)

        when: 'The Result bean is loaded from the spring application context'
        String result = applicationContext.getBean('result')

        then: 'The result bean should be default-result'
        assertEquals 'default-result', result
    }
}
