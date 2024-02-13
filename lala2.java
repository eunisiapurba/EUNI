import java.util.Scanner;

public class UG3Soal2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Looping untuk perulangan program
        while (true) {
            // Input kata pertama dan kedua
            System.out.println("Bilangan Fibonacci dari kata");
            System.out.println("-------------------------");
            System.out.print("Masukkan input pertama: ");
            String firstWord = scanner.nextLine();
            System.out.print("Masukkan input kedua: ");
            String secondWord = scanner.nextLine();

            // Hitung jumlah karakter
            int n1 = countCharacters(firstWord);
            int n2 = countCharacters(secondWord);

            // Tampilkan deret Fibonacci
            System.out.println("Bilangan Fibonacci");
            for (int i = 0; i < 10; i++) {
                System.out.print(n1 + " ");
                int nextTerm = n1 + n2;
                n1 = n2;
                n2 = nextTerm;
            }

            // Tampilkan prompt keluar program
            System.out.println("\nKeluar dari program (ketikan exit): ");
            String input = scanner.nextLine();

            // Periksa input untuk keluar program
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
        }
    }

    private static int countCharacters(String word) {
        int count = 0;
        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) {
                count++;
            }
        }
        return count;
    }
}
