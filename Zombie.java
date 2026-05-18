public class Zombie extends Musuh implements BisaLoot {
    public Zombie() {
        // memanggil construktor kelas induk abstrak
        super("Zombie Amba ", 150);
    }

    // wajib ada : dipaksa java untuk mengoverride
    @Override
    public void serangPemain() {
        System.out.println(this.namaMusuh + "melompat mencakar dengan kuku yang tajam dan mengigit! player -20 hp");
    }
    @Override
    public void suaraKhas() {
        System.out.println("kicau kicau kicau mania");
    }
     @Override
    public void jatuhkanItem() {
        System.out.println(this.namaMusuh + "Menjatuhkan 1x Daging Busuk dan memberikan 50 Exp");
    }
}
