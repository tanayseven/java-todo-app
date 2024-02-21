package tech.tanay.todolist;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "product")
public class ProductEntity {
    @Id
    private String sku;
    private String name;
    private Integer price;

    public ProductEntity(String sku, String name, Integer price) {
        this.sku = sku;
        this.name = name;
        this.price = price;
    }

    public ProductEntity() {}
}
