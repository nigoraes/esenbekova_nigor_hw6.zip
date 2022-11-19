public class Main {
    public static void main(String[] args) {

Boss boss = new Boss();
boss.setHealght(200);
boss.setDamage(100);
boss.weapon.setWeaponType(WeaponType.MAGICAL);
boss.weapon.setWeaponName("y");
        System.out.println("\nhealth: " + boss.getHealght() + "\ndamage: " + boss.getDamage() +
                "\nWeapontype :"+boss.weapon.getWeaponType() + "\nweaponname: " + boss.weapon.getWeaponName());







    }
}