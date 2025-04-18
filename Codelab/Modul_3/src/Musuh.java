public class Musuh extends KarakterGame { // kelas musuh adalah anak dari kelas karaktergame
    // constuctor musuh, memanggil constructor induk (super)
    public Musuh(String name, int kesehatan) {
        super(name, kesehatan);
    }

    @Override // menggunakan override untuk memberikan serangan khusus
    public void serang(KarakterGame target) {
        System.out.println(getName() + " menyerang " + target.getName() + " menggunakan Snake Bite!");
        target.setKesehatan(target.getKesehatan() - 15); // Mengurangi 15 poin kesehatan target
        System.out.println(target.getName() + " sekarang memiliki kesehatan " + target.getKesehatan());
    }
}
