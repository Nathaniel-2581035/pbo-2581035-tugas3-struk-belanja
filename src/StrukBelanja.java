import java.util.Scanner;

public class StrukBelanja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama barang 1: ");
        String nama1 = input.nextLine();
        System.out.print("Harga satuan barang 1: ");
        int harga1 = input.nextInt();
        System.out.print("Jumlah barang 1: ");
        int jumlah1 = input.nextInt();
        input.nextLine();

        System.out.print("Nama barang 2: ");
        String nama2 = input.nextLine();
        System.out.print("Harga satuan barang 2: ");
        int harga2 = input.nextInt();
        System.out.print("Jumlah barang 2: ");
        int jumlah2 = input.nextInt();
        input.nextLine();

        System.out.print("Nama barang 3: ");
        String nama3 = input.nextLine();
        System.out.print("Harga satuan barang 3: ");
        int harga3 = input.nextInt();
        System.out.print("Jumlah barang 3: ");
        int jumlah3 = input.nextInt();
        input.nextLine();

        System.out.print("Uang dibayar: ");
        int uangDibayar = input.nextInt();

        int subtotal1 = harga1 * jumlah1;
        int subtotal2 = harga2 * jumlah2;
        int subtotal3 = harga3 * jumlah3;

        int totalBelanja = subtotal1 + subtotal2 + subtotal3;
        int kembalian = uangDibayar - totalBelanja;

        System.out.println();
        System.out.println("===== STRUK BELANJA =====");
        System.out.println(nama1 + "\t" + jumlah1 + " x " + harga1 + " = " + subtotal1);
        System.out.println(nama2 + "\t" + jumlah2 + " x " + harga2 + " = " + subtotal2);
        System.out.println(nama3 + "\t" + jumlah3 + " x " + harga3 + " = " + subtotal3);
        System.out.println("--------------------------");
        System.out.println("Total belanja\t\t= " + totalBelanja);
        System.out.println("Uang dibayar\t\t= " + uangDibayar);
        System.out.println("Kembalian\t\t= " + kembalian);

        input.close();
    }
}