import java.math.BigInteger;
import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int n = x.nextInt();  // Input jumlah kasus

        for (int i = 0; i < n; i++) {
            try {
                BigInteger t = x.nextBigInteger();  // Input BigInteger
                long y = t.longValue();  // Mengkonversi BigInteger menjadi long

                // Pengecekan apakah BigInteger dapat disimpan dalam rentang long
                if (t.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) < 0 || t.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) {
                    System.out.println(t + " can't be fitted anywhere.");
                } else {
                    System.out.println(t + " can be fitted in:");

                    // Pengecekan apakah nilai long dapat disimpan dalam tipe data short, int, atau long
                    if (Short.MIN_VALUE <= y && y <= Short.MAX_VALUE) {
                        System.out.println("* short");
                    }
                    if (Integer.MIN_VALUE <= y && y <= Integer.MAX_VALUE) {
                        System.out.println("* int");
                    }
                    if (Long.MIN_VALUE <= y && y <= Long.MAX_VALUE) {
                        System.out.println("* long");
                    }
                }
            } catch (Exception e) {
                System.out.println("");  // Menangani kesalahan format input
            }
        }

        x.close();  // Menutup scanner setelah semua input selesai
    }
}
