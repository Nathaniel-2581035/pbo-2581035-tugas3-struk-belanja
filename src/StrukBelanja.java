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

        System.out.print("Jumlah barang 3: ");
        int jumlah3 = input.nextInt();

        System.out.print("Harga satuan barang 1: ");
        int harga1 = input.nextInt();

        System.out.print("Jumlah barang 1: ");
        int jumlah1 = input.nextInt();

        System.out.print("Harga satuan barang 2: ");
        int harga2 = input.nextInt();

        System.out.print("Jumlah barang 2: ");
        int jumlah2 = input.nextInt();

        input.close();
    }
}