package javaworld.project;

import java.util.ArrayList;
import java.util.List;

public class Character {
    private String name;
    private int level;
    private int health;
    private int maxHealth;
    private int attack;
    private int defense;
    private double exp;
    private double expRequired;
    private int gold;
    private List<Item> inventory;

    public Character(String name, int health, int attack, int defense, double expRequired) {
        this.name = name;
        this.level = 1;
        this.health = health;
        this.maxHealth = health;
        this.attack = attack;
        this.defense = defense;
        this.exp = 0;
        this.expRequired = expRequired;
        this.gold = 0;
        this.inventory = new ArrayList<>();
    }

    public void attack(Character target) {
        System.out.println(this.name + "(이)가 " + target.name + "을(를) 공격합니다!");
        int damage = Math.max(0, this.attack - target.defense);
        target.health -= damage;
        System.out.println(target.name + "에게 " + damage + "의 데미지를 입혔습니다.");
        System.out.println(target.name + "의 체력이 " + target.health + "이 되었습니다.\n");

        if (target.health <= 0) {
            System.out.println(target.name + "을(를) 쓰러트렸습니다! 경험치 " + target.expRequired + "를 획득합니다.\n");
            gainExp(target.expRequired);
            gainGold(20);
        }
    }

    public void gainExp(double exp) {
        this.exp += exp;
        System.out.println(this.name + "이(가) " + exp + " 경험치를 획득하였습니다. (현재 경험치: " + this.exp + ")\n");
        checkLevelUp();
    }

    private void checkLevelUp() {
        while (this.exp >= this.expRequired) {
            this.exp -= this.expRequired;
            levelUp();
        }
    }

    private void levelUp() {
        this.level++;
        this.health += 3;
        this.maxHealth += 3;
        this.attack += 1;
        this.expRequired *= 1.4;
        System.out.println(this.name + "이(가) 레벨업 하였습니다! 현재 레벨: " + this.level);
        System.out.println("체력이 3, 공격력이 1 증가하였습니다.");
        System.out.printf("다음 레벨업까지 필요한 경험치: %.1f\n", this.expRequired);
    }

    public void display() {
        System.out.println("레벨: " + level);
        System.out.println("체력: " + health + "/" + maxHealth);
        System.out.println("공격력: " + attack);
        System.out.println("방어력: " + defense);
        System.out.println("현재 경험치: " + exp);
        System.out.println("레벨업에 필요한 경험치: " + expRequired);
        System.out.println("골드: " + gold);
    }

    public int getHealth() {
        return this.health;
    }

    public void heal() {
        this.health = this.maxHealth;
        System.out.println(this.name + "의 체력이 최대치로 회복되었습니다. 현재 체력: " + this.health + "/" + this.maxHealth);
    }

    public void gainGold(int amount) {
        this.gold += amount;
        System.out.println(this.name + "이(가) " + amount + "골드를 획득하였습니다. (현재 골드: " + this.gold + ")");
    }

    public boolean spendGold(int amount) {
        if (this.gold >= amount) {
            this.gold -= amount;
            System.out.println(this.name + "이(가) " + amount + "골드를 사용하였습니다. (현재 골드: " + this.gold + ")");
            return true;
        } else {
            System.out.println("골드가 부족합니다. (현재 골드: " + this.gold + ")");
            return false;
        }
    }

    public List<Item> getInventory() {
        return this.inventory;
    }

    public void addItem(Item item) {
        inventory.add(item);
        System.out.println(item.getName() + "을(를) 가방에 추가했습니다.");
    }

    public void usePotion() {
        if (!inventory.isEmpty()) {
            for (Item item : inventory) {
                if (item.getName().equals("포션")) {
                    System.out.println(this.name + "이(가) 포션을 사용하여 체력을 회복합니다.");
                    this.health = Math.min(this.maxHealth, this.health + 20);
                    System.out.println("체력이 " + this.health + "/" + this.maxHealth + "로 회복되었습니다.");
                    inventory.remove(item);
                    return;
                }
            }
            System.out.println("가방에 포션이 없습니다.");
        } else {
            System.out.println("가방이 비어있습니다.");
        }
    }
    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
    public int getMaxHealth() {
        return maxHealth;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public static final Character DARK_LORD = new Character("마왕", 200, 50, 30, 500);
}