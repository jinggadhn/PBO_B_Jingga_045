public class Main {
    public static void main(String[] args) {
        RekeningBank rekening1 = new RekeningBank("202410370110045", "Jingga Maulidhina", 500000);
        RekeningBank rekening2 = new RekeningBank("202410370110011", "Sabrina Wan", 800000);

        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        rekening1.setorUang(100000);
        rekening2.setorUang(200000);

        rekening1.tarikUang(800000);
        rekening2.tarikUang(500000);

        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();
    }
}
