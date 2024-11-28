public class PenjumlahanRekursif {
    public static int penjumlahanRekursif(int f) {
        if (f == 0){
            return 0;
        } else {
            return f + penjumlahanRekursif(f - 1);
        }
    }

    public static void main(String[] args) {
        int f = 8;
        int hasil = penjumlahanRekursif(f);
        System.out.println("Hasil penjumlahan dari 1 sampai " + f + " adalah: " + hasil);
    }
}
