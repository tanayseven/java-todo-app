package tech.tanay.todolist.integration

import groovyx.net.http.RESTClient
import spock.lang.Specification

class InvoiceTest extends Specification {
    def "Should return 200 & a message with the input appended"() {
        setup:
        def primerEndpoint = new RESTClient('http://localhost:8080/')

        when:
        def resp = primerEndpoint.get(path: '/invoice')

        then:
        resp.status == 200
        resp.contentType == "application/json"
        resp.data == [
                "products": [
                        [
                                "name"    : "Rice 1kg",
                                "price"   : 60.0,
                                "quantity": 2,
                                "sku"     : "GRC-001",
                                "amount"  : 120.0,
                        ]
                ],
                "total"   : 120.0
        ]
    }

    def "Should check if the data is saved in the database"() {
        setup:
        def primerEndpoint = new RESTClient( 'http://localhost:8080/' )

        when:
        def respForCreate = primerEndpoint.post(
                path: '/product',
                contentType: 'application/json',
                body: [sku: 'ID1', name: 'Test Product', price: 100.0]
        )
        def respForGet = primerEndpoint.get( path: '/product/ID1')

        then:
        respForCreate.status == 201
        respForGet.status == 200
        respForGet.data == [
                "sku"  : "ID1",
                "name" : "Test Product",
                "price": 100.0
        ]
    }


}
