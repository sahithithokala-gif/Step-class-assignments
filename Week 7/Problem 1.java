public class Character {
    private final int maxHealth;
    private int health;

    public Character(int maxHealth) {
        this.maxHealth = maxHealth;
        this.health = maxHealth;
    }

    public void takeDamage(int amount) {
        if (amount > 0) {
            health = Math.max(0, health - amount);
        }
    }

    public void heal(int amount) {
        if (amount > 0) {
            health = Math.min(maxHealth, health + amount);
        }
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public static void main(String[] args) {
        Character c = new Character(100);
        
        c.takeDamage(30);
        System.out.println("Health after 30 damage: " + c.getHealth()); // 70

        c.heal(50);
        System.out.println("Health after 50 heal: " + c.getHealth()); // 100 (capped)

        c.takeDamage(150);
        System.out.println("Health after 150 damage: " + c.getHealth()); // 0 (floored)
    }
}