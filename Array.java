public class Array{

    // Dasar Array
    // public static void main(String[] args){
    //     int[]bilanganGenap = new int[10];
    //     int jumlah = 0;
        
    //     for(int i = 0; i < bilanganGenap.length; i++ ){
    //         bilanganGenap[i]= (i + 1) * 2;
    //     }
        
    //     System.out.println("Isi array");
    //     for(int bilangan : bilanganGenap){
    //         System.out.print(bilangan + "");
    //         jumlah += bilangan;
    //     }
        
    //     System.out.println("\\nJumlah semua elemen: " + jumlah);
    // }



    // Pencarian dalam Array
//     public static void main(String[] args) {
//         int[] nilai = {75, 80, 65, 90, 85, 70, 95, 88};
//         int cari = 90;
//         boolean ketemu = false;
//         int indeks = -1;

//         for (int i = 0; i < nilai.length; i++) {
//             if (nilai[i] == cari) {
//                 ketemu = true;
//                 indeks = i;
//                 break;
//     }
// }
//     if(ketemu){
//         System.out.println("Nilai " + cari + " ditemukan di indeks " + indeks);
//     } else {
//         System.out.println("Nilai " + cari + " tidak ditemukan");
//     }
//     }



    // Stastistik Array
    // public static void main(String[] args) {
    //     int[] nilai = {75, 80, 65, 90, 85, 70, 95, 88};

    //     int tertinggi = nilai[0];
    //     int terendah = nilai[0];
    //     int total = nilai[0];

    //     for (int i = 1; i < nilai.length; i++) {
    //         if (nilai[i] > tertinggi) tertinggi = nilai[i];
    //         if (nilai[i] < terendah) terendah = nilai[i];
    //         total += nilai[i];
    //         }

    //         double rataRata = (double) total / nilai.length;

    //         System.out.println("Nilai tertinggi: " + tertinggi);
    //         System.out.println("Nilai terendah: " + terendah);
    //         System.out.println("Rata-rata: " + rataRata);
    // }



    // Array 2D - Matriks
    // public static void main(String[] args) {
    //     int[][] matriksA = {
    //         {1, 2, 3},
    //         {4, 5, 6}
    //     };

    //     int[][] matriksB = {
    //         {7, 8, 9},
    //         {10, 11, 12}
    //     };

    //     int[][] hasil = new int[2][3];

    //     for (int i = 0; i < matriksA.length; i++) {
    //         for (int j = 0; j < matriksB.length; j++) {
    //             hasil[i][j] = matriksA[i][j] + matriksB[i][j];
    //         }
    //     }

    //     System.out.println("Hasil penjumlahan matriks: ");
    //     for(int[] baris : hasil) {
    //         for (int nilai : baris) {
    //             System.out.print(nilai + " ");
    //         }
    //         System.out.println();
    //     }

    // }



//     public static void main(String[] args) {
//         String[] namaSiswa = {"dika", "ovi", "sarah", "una", "tata"};
//         int[][] nilai = {
//             {80, 85, 90}, // Nilai dika
//             {70, 75, 80}, // Nilai ovi
//             {85, 80, 88}, // Nilai sarah
//             {90, 85, 95}, // Nilai una
//             {70, 75, 80}  // Nilai tata
//         };
//         String[] mapel = {"Matematika", "Bahasa Inggris", "IPA"};

//         // Menghitung rata-rata per siswa
//         System.out.println("Rata-rata nilai per siswa: ");
//         for (int i = 0; i < nilai.length; i++) {
//             double total = 0;
//             for (int n : nilai[i]) {
//                 total += n;
//         }
//         double rataSiswa = total / nilai[i].length;
//         System.out.printf("%s: %.2f ", namaSiswa[i], rataSiswa);
//     }

//     // Menghitung rata-rata per mata pelajaran
//     System.out.println("Rata-rata nilai per mata pelajaran: ");
//     for(int j = 0; j < nilai[0].length; j++) {
//         double total = 0;
//         for (int i = 0; i < nilai.length; i++) {
//             total += nilai[i][j];
//         }
//         double rataMapel = total / nilai.length;
//         System.out.printf("%s: %.2f ", mapel[j], rataMapel);
// }
// }



    // Permainan Tic-Tac-Toe
    public static void main(String[] args) {
        char[][] papan = new char[3][3];

        // Inisialisasi papan kosong
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                papan[i][j] = '-';
            }
    }

    // Simulasi beberapa langkah
    papan[0][0] = 'X';
    papan[1][1] = 'O';
    papan[2][2] = 'X';

    // Tampilkan papan
    System.out.println("Status Papan: ");
    tampilkanPapan(papan);
    
}

public static void tampilkanPapan(char[][] papan) {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(papan[i][j] + " ");
        }
        System.out.println();
    }
}
}