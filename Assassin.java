class Assassin extends MobaHero {
    public Assassin(String name, int hp, int attack) {
        super(name, hp, attack);
    }

    @Override
    public void castSkill() {
        System.out.println(getName() + " menggunakan skill khusus: " + getName() + " Shadow Strike!");
    }
}