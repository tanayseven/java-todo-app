package tech.tanay.todolist.integration

import groovyx.net.http.RESTClient
import spock.lang.Specification

class SampleSpringBootTest extends Specification {

    def "Should return 200 & a message with the input appended"() {
        setup:
        def primerEndpoint = new RESTClient( 'http://localhost:8080/' )

        when:
        def resp = primerEndpoint.get( path: '/products')

        then:
        resp.status == 200
        resp.contentType == "application/json"
    }
}
