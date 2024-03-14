public class Gunner extends Hero{
    @Override
    boolean allowWeapon(Weapon weapon) {
        return (weapon instanceof Rifle);
    }

    @Override
    void display() {
        System.out.println("Gunnery Gunner");
    }
}
