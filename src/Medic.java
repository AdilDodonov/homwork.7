public class Medic extends Hero {
    @Override
    public void applySoperAdillity() {
        System.out.println(" Medic super ");

    }


    @Override
    public int hp() {
        return 100;
    }

    @Override
    public int damage() {
        return 0;
    }
}
