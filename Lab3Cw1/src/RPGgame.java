public class RPGgame {
    public static void main(String[] args){

        Hero knight = new Knight();
        Hero archer = new Archer();
        Hero cannoner = new Cannoneer();
        Hero gunner = new Gunner();

        knight.setWeapon(new Sword());
        archer.setWeapon(new Bow());
        cannoner.setWeapon(new Cannon());
        gunner.setWeapon(new Rifle());

        knight.attack();
        knight.display();

        archer.attack();
        archer.display();

        cannoner.attack();
        cannoner.display();

        gunner.attack();
        gunner.display();
    }
}
