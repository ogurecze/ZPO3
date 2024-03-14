public abstract class Hero {
    private Weapon weapon;
    abstract boolean allowWeapon(Weapon weapon);

    public void setWeapon(Weapon weapon) {
        if (allowWeapon(weapon)) {
            this.weapon = weapon;
        } else  {
            System.out.println("Weapon not allowed");
        }
    }

    public void attack(){
        if (weapon != null) {
            weapon.attack();
        } else {
            System.out.println("No weapon equipped");
        }
    }

    abstract void display();
}
