// Kelas Mage yang merupakan subclass dari MobaHero
class Mage extends MobaHero {
    // Konstructor untuk Mage
    public Mage(String name, int hp, int attack) {
        super(name, hp, attack);
    }

    // Implementasi method abstrak untuk skill khusus
    @Override
    public void castSkill() {
        System.out.println(getName() + " menggunakan skill khusus dengan damage " + (getAttack() * 2));
    }
}
