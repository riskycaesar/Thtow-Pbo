public class Slime extends Musuh implements BisaLoot {
    public Slime() {
        // memanggil construktor kelas induk abstrak
        super("Slime Moani ", 50);
    }

    // wajib ada : dipaksa java untuk mengoverride
    @Override
    public void serangPemain() {
        System.out.println(this.namaMusuh + "melompat dan menyiram cairam asam! player -15 hp");
    }

    @Override
    public void suaraKhas() {
        System.out.println("blobop blobop");
    }
    @Override
    public void jatuhkanItem() {
        System.out.println(this.namaMusuh + "Menjatuhkan 5x Bola Bola Air dan memberikan 15 Exp");
    }
}
