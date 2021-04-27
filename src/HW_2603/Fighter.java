package HW_2603;

public class Fighter {
    public String name;
    public int health, damagePerAttack;
    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        String result = "";
        if (firstAttacker == fighter1.name) {
            while (fighter2.health > 0 ) {
                fighter2.health -= fighter1.damagePerAttack;
                if (fighter2.health <= 0) { result = fighter1.name; break;}
                else {
                    fighter1.health -= fighter2.damagePerAttack;
                    if (fighter1.health <= 0) {result = fighter2.name; break;}
                }

            }
        } else {
            while (fighter1.health > 0) {
                fighter1.health -= fighter2.damagePerAttack;
                if (fighter1.health <= 0) {result = fighter2.name; break;}
                else {
                    fighter2.health -= fighter1.damagePerAttack;
                    if (fighter2.health <= 0) {result = fighter1.name; break;}
                }
            }
        }
        return result;
    }

}
