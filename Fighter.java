// Kelas Fighter yang merupakan subclass dari MobaHero
class Fighter extends MobaHero {
    // Constructor
    public Fighter(String name, int hp, int attack) {
        super(name, hp, attack);
    }

    // Implementasi method abstrak untuk skill khusus
    @Override
    public void castSkill() {
        System.out.println(getName() + " menggunakan skill khusus: " + getName() + " Strike!");
    }
}