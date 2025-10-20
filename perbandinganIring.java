
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class perbandinganIring {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input nama (Scanner): ");
        String nama1 = sc.nextLine();

        System.out.print("Input nama (BufferedReader): ");
        String nama2 = br.readLine();

        System.out.println("Nama 1: " + nama1);
        System.out.println("Nama 2: " + nama2);
    }
}
