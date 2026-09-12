import java.util.Scanner;

public class StrukBelanja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama barang 1: ");
        String nama1 = input.nextLine();

        System.out.print("Nama barang 2: ");
        String nama2 = input.nextLine();

        System.out.print("Nama barang 3: ");
        String nama3 = input.nextLine();

        System.out.print("Harga satuan barang 3: ");
        int harga3 = input.nextInt();

        input.close();
    }
}