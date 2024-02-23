package tech.tanay.todolist.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.tanay.todolist.model.Invoice;
import tech.tanay.todolist.model.Product;

import java.util.List;

@RestController
public class InvoiceController {
    @GetMapping("/invoice")
    public Invoice getInvoice() {
        return new Invoice(List.of(
                new Product("GRC-001", "Rice 1kg", 2,  60, 120)
        ), 120);
    }

}
