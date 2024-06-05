package packing;

import java.util.Random;

public class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " (가격: " + price + "골드)\n";
    }

    public static Item gatherItem() {
        Random random = new Random();
        int randomNumber = random.nextInt(3); // 0부터 2까지의 랜덤 숫자를 생성합니다.

        switch (randomNumber) {
            case 0:
                return new Item("잡초", 1); // 잡초
            case 1:
                return new Item("약초", 10); // 약초
            case 2:
                return new Item("버섯", 5); // 버섯
            default:
                return null;
        }
    }

    public static Item POTION = new Item("포션", 15);
}