public class Fish extends Pet {
    Fish() {
        this.health = 2.0;
        this.attack = 4.0;
        this.habitat = "water";
        this.attackMultiplier = 1.0;
        this.level = 1;
        this.luck = 5;
    }

    @Override 
    public void upgrade() {
        if(level == 1) {
            this.health = 3.0;
            this.attack = 5.0;
            level++;
        }
        else if(level == 2) {
            this.health = 4.0;
            this.attack = 6.0;
            level++;
        }
        else {
            System.out.println("Pet cannot be upgraded, maximum level achieved.");
        }
    }

    @Override
    public void useSpecial(Pet p2) {
        this.luck++;
        p2.luck++;
    }
}
