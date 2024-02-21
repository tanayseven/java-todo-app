package tech.tanay.todolist


import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class SampleSpringBootTest extends Specification {

    def "when context is loaded then all expected beans are created"() {
        expect:
        1 == 1
    }
}
