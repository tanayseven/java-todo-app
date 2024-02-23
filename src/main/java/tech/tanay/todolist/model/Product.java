package tech.tanay.todolist.model;

public record Product(
        String sku,
        String name,
        long quantity,
        double price,
        double amount
) {
}
