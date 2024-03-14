public class Cannoneer extends Hero{
    @Override
    boolean allowWeapon(Weapon weapon) {
        return (weapon instanceof Cannon);
    }

    @Override
    void display() {
        System.out.println("Cannoneery Cannoner");
    }
}
