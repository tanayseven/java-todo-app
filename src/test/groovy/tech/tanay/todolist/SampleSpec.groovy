package tech.tanay.todolist

import spock.lang.Specification

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
}