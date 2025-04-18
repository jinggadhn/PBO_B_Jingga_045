public class Pahlawan extends KarakterGame { // kelas pahlawan adalah anak dari kelas karaktergame
    // constuctor pahlawan, memanggil constructor induk (super)
    public Pahlawan(String name, int kesehatan) {
        super(name, kesehatan);
    }

    @Override // menggunakan override untuk memberikan serangan khusus
    public void serang(KarakterGame target) {
        System.out.println(getName() + " menyerang " + target.getName() + " menggunakan Orbital Strike!");
        target.setKesehatan(target.getKesehatan() - 20); // Mengurangi 20 poin kesehatan target
        System.out.println(target.getName()+ " sekarang memiliki kesehatan " + target.getKesehatan());
    }
}
