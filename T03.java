// 12S24024 - Yesika Nadia Saragih
// 12S24027 - Grasia Gayatri Simanullang 



import java.util.*;
import java.lang.Math;

public class T03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judul, penulis, tahunterbit, penerbit, formatbuku;
        double hargapembelian, minimummargin;
        int stok;
        double rating;
        String kategori;

        kategori = " ";
        String kategoridiskon, kategoribuku;
        double penilaianbuku;

        do {
            iSBN = input.nextLine();
            if (iSBN.equals("---")) {
            } else {
                judul = input.nextLine();
                penulis = input.nextLine();
                tahunterbit = input.nextLine();
                penerbit = input.nextLine();
                if (penerbit.equals("---")) {
                    penerbit = "---";
                } else {
                    penerbit = penerbit;
                }
                formatbuku = input.nextLine();
                hargapembelian = input.nextDouble();
                minimummargin = input.nextDouble();
                if (minimummargin > 0) {
                    kategoridiskon = "---";
                } else {
                    if (minimummargin < -(hargapembelian * 40 / 100)) {
                        kategoridiskon = "Once in a lifetime";
                    } else {
                        if (minimummargin < -(hargapembelian * 20 / 100)) {
                            kategoridiskon = "Never come twice";
                        } else {
                            kategoridiskon = "No regret";
                        }
                    }
                }
                stok = input.nextInt();
                rating = input.nextDouble();
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
                                if (rating < 3.0) {
                                    kategori = "Low";
                                } else {
                                    kategori = "---";
                                }
                            }
                        }
                    }
                }
                if (kategoridiskon.equals("Once in a lifetime") && kategori.equals("Best Pick")) {
                    kategoribuku = "The ultimate best";
                } else {
                    kategoribuku = "---";
                }
                System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahunterbit + "|" + penerbit + "|" + formatbuku + "|" + hargapembelian + "|" + minimummargin + "|" + stok + "|" + rating + "|" + kategori + "|" + kategoridiskon + "|" + kategoribuku);
            }
        } while (!iSBN.equals("---"));
    }
}
