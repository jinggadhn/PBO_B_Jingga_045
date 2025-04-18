public class Main {
    public static void main(String[] args) {
            // membuat objek pahlawan dan musuh dengan nama dan jumlah kesehatan masing-masing
            KarakterGame karakterUmum = new KarakterGame("Karakter Umum", 100);
            Pahlawan brimstone = new Pahlawan("Brimstone", 150);
            Musuh viper = new Musuh("Viper", 200);

            // menampilkan status awal dari karakter yang dibuat
            System.out.println("Status awal:");
            System.out.println(brimstone.getName() + " memiliki kesehatan: " + brimstone.getKesehatan());
            System.out.println(viper.getName() + " memiliki kesehatan: " + viper.getKesehatan());
            System.out.println();

            // tempat untuk melakukan aksi serang antara pahlawan dan musuh
            brimstone.serang(viper); // Brimstone menyerang Viper
            viper.serang(brimstone); // Viper menyerang Brimstone
        }
}
