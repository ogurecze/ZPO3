public class Archer extends Hero{
    @Override
    boolean allowWeapon(Weapon weapon) {
        return (weapon instanceof Bow);
    }

    @Override
    void display() {
        System.out.println("Archery archer");
    }
}
