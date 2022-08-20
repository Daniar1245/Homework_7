public class Main {
    public static void main(String[] args) {
        Medic medic = new Medic();
        Magic magic = new Magic();
        Warrior warrior = new Warrior();
        HavingSuperAbility[] hero = {magic, medic, warrior};
        for (int i = 0; i < hero.length; i++) {
            hero[i].applySuperAbility();
        }
    }
}