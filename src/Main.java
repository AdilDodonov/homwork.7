import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println();
        Hero[] hero = { new Magic() , new Medic(), new Warior()};


        for (int i = 0; i <hero.length ; i++) {
            all(hero[i]);
            hero[i].applySoperAdillity() ;
        }
    }
    public static void all(Hero hero){
        hero.damage();
        hero.hp();
    }
}
