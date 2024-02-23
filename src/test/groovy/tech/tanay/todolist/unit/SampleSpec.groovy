package tech.tanay.todolist.unit

import spock.lang.Specification
import spock.lang.Unroll

class SampleSpec extends Specification {
    def "this is a sample test"() {
        given: "we have two numbers"
        def number1 = 3
        def number2 = 5

        when: "we add the two numbers"
        def result = number1 + number2

        then:
        result == 8
    }

    @Unroll
    def "sum of all the numbers #number1 and #number2 is #expectedSum"() {
        when:
        def sum = number1 + number2

        then:
        sum == expectedSum

        where:
        number1 | number2 || expectedSum
        1       | 2       || 3
        2       | 3       || 5
        3       | 4       || 7
    }
}