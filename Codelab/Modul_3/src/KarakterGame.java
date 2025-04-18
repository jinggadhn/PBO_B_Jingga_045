public class KarakterGame {
    private String name; // untuk menyimpan nama karakter
    private int kesehatan; // untuk menyimpan jumlah jumlah kessehatan karakter

    // constructor untuk karakter dengan nama dan kesehatan
    public KarakterGame(String name, int kesehatan) {
        this.name = name;
        this.kesehatan = kesehatan;
    }

    // method setter dan getter
    public String getName() {
        return name;
    }
    public int getKesehatan() {
        return kesehatan;
    }
//    public void setName(String name) {
//        this.name = name;
//    }
    public void setKesehatan(int kesehatan) {
        this.kesehatan = kesehatan;
    }
    public void serang(KarakterGame target){
        System.out.println(name + " menyerang " + target.getName());
    }
}