// 12S24024 - Yesika Nadia Saragih
// 12S24027 - Grasia Gayatri Simanullang
import java.util.*;
import java.lang.Math;

public class T03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judul, penulis, penerbit, formatBukuElektronik, kategori;
        int tahunTerbit, stok;
        double hargaPembelian, minimumMargin, rating;
        String kategoriDiskon;
        String kategoriBuku;

        do {
            iSBN = input.nextLine();
            if (iSBN.equals("---")) {
            } else {
                judul = input.nextLine();
                penulis = input.nextLine();
                tahunTerbit = Integer.parseInt(input.nextLine());
                penerbit = input.nextLine();
                if (penerbit.equals("---")) {
                    penerbit = "---";
                } else {
                    penerbit = penerbit;
                }
                formatBukuElektronik = input.nextLine();
                hargaPembelian = Double.parseDouble(input.nextLine());
                minimumMargin = Double.parseDouble(input.nextLine());
                if (minimumMargin > 0) {
                    kategoriDiskon = "---";
                } else {
                    if (minimumMargin < -(hargaPembelian * 40 / 100 * -1)) {
                        kategoriDiskon = "Once in a lifetime";
                    } else {
                        if (hargaPembelian < -(hargaPembelian * 20 / 100)) {
                            kategoriDiskon = "Never come twice";
                        } else {
                            kategoriDiskon = "No regret";
                        }
                    }
                }
                stok = Integer.parseInt(input.nextLine());
                rating = Double.parseDouble(input.nextLine());
                if (rating >= 4.7) {
                    kategori = "Best Pick";
                } else {
                    if (rating >= 4.5) {
                        kategori = "Must Read";
                    } else {
                        if (rating >= 4.0) {
                            kategori = "Recommended";
                        } else {
                            if (rating >= 3.0) {
                                kategori = "Average";
                            } else {
                                kategori = "Low";
                            }
                        }
                    }
                }
            }
            if (kategoriDiskon.equals("Once in a lifetime") && kategori.equals("BestPick")) {
                kategoriBuku = "The ultimate best";
            } else {
                kategoriBuku = "---";
            }
            System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahunTerbit + "|" + penerbit + "|" + formatBukuElektronik + "|" + hargaPembelian + "|" + minimumMargin + "|" + stok + "|" + rating + "|" + kategori + "|" + kategoriDiskon + "|" + kategoriBuku);
        } while (iSBN.equals("---"));
    }
}
