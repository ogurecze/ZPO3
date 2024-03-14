public class Knight extends Hero{
    @Override
    boolean allowWeapon(Weapon weapon) {
        return (weapon instanceof Sword);
    }

    @Override
    void display() {
        System.out.println("Knightly Knight");
    }
}
