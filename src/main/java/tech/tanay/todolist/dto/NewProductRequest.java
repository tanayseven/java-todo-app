package tech.tanay.todolist.dto;

public record NewProductRequest(
        String sku,
        String name,
        double price) {
}
