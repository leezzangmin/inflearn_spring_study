package hello.itemservice.domain.item;

import lombok.Data;
import lombok.NonNull;

@Data
public class Item {

    private Long id;
    @NonNull
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
