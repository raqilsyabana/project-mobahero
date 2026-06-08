import java.util.Scanner;

// Kelas abstrak untuk hero MOBA
abstract class MobaHero {
    private String name;
    private int hp;
    private int attack;

    // Constructor untuk MobaHero
    public MobaHero(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    // Getter untuk atribut
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }

    // Setter untuk atribut
    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    // Method untuk basic attack
    public void basicAttack() {
        System.out.println(name + " menyerang dengan damage " + attack);
    }

    // Method abstrak untuk skill khusus
    public abstract void castSkill();
}

public class MobaHeroTest {
    public static void main(String[] args) {
        // Membuat scanner untuk input
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Selamat datang di mini MOBA Hero Simulator ===");

        // Input untuk hero untuk meminta jumlah hero yang dimasukkan ke dalam tim
        System.out.print("Masukkan jumlah hero yang ingin dimasukkan ke dalam tim: ");
        int jumlahHero = scanner.nextInt();

        // Polymorphism: Array of Objects untuk menggunakan tipe kelas induk
        MobaHero[] team = new MobaHero[jumlahHero];

        // Input untuk setiap hero
        for (int i = 0; i < jumlahHero; i++) {
            System.out.println("=== Hero " + (i + 1) + " ===");
            System.out.print("Masukkan nama hero: ");
            String name = scanner.next();
            System.out.print("Masukkan HP hero: ");
            int hp = scanner.nextInt();
            System.out.print("Masukkan attack hero: ");
            int attack = scanner.nextInt();

            // Membuat objek hero dan menyimpannya dalam array
            team[i] = new MobaHero(name, hp, attack) {
                @Override
                public void castSkill() {
                    System.out.println(name + " menggunakan skill khusus!");
                }
            };
        }

        // Memilih role untuk setiap hero
        for (int i = 0; i < jumlahHero; i++) {
            System.out.println("=== Hero " + (i + 1) + " ===");
            System.out.println("Pilih role untuk " + team[i].getName() + ":");
            System.out.println("1. Tank");
            System.out.println("2. Damage");
            System.out.println("3. Support");
            System.out.print("Masukkan pilihan: ");
            int role = scanner.nextInt();

            switch (role) {
                case 1:
                    // Implementasi role Tank
                    break;
                case 2:
                    // Implementasi role Damage
                    break;
                case 3:
                    // Implementasi role Support
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        // Menampilkan informasi hero dan skill khusus
        for (MobaHero hero : team) {
            System.out.println("Nama Hero: " + hero.getName());
            System.out.println("HP: " + hero.getHp());
            System.out.println("Attack: " + hero.getAttack());
            hero.castSkill();
            System.out.println();
        }

        // Menutup scanner
        scanner.close();
    }
}
