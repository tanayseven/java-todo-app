package tech.tanay.todolist.model;

import java.util.List;

public record Invoice(
        List<Product> products,
        double total
) {


}
