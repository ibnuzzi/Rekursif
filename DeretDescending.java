public class DeretDescending {
    public static void deretDescendingRekursif(int n) {
        if (n < 0) {
            return;
        } else {
            System.out.print(n + " ");
            deretDescendingRekursif(n - 1);
        }
    }

    public static void deretDescendingIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Hasil menggunakan rekursif:");
        deretDescendingRekursif(n);

        System.out.println("\nHasil menggunakan iteratif:");
        deretDescendingIteratif(n);
    }
}
