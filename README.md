public class Array{

    // Dasar Array
     public static void main(String[] args){  // membuat main method
         int[]bilanganGenap = new int[10];  // deklarasi array dengan panjang 10
         int jumlah = 0;
        
         for(int i = 0; i < bilanganGenap.length; i++ ){ // mendeklarasikan variabel i dan menginisialisasinya dengan 0, dan memberitahukan bahwa i lebih kecil dari panjang array bilanganGenap
             bilanganGenap[i]= (i + 1) * 2; // mengisi array dengan nilai genap
         }
        
         System.out.println("Isi array"); // menampilkan pesan "Isi array"
         for(int bilangan : bilanganGenap){ // mengisi array dengan nilai genap
             System.out.print(bilangan + ""); // menampilkan isi array + memberi spasi setiap angka
             jumlah += bilangan; // menambahkan nilai array ke variabel jumlah
         }
        
         System.out.println("\\nJumlah semua elemen: " + jumlah); // menampilkan jumlah semua elemen array + menampilkan value dari variabel jumlah
     }



    // Pencarian dalam Array
     public static void main(String[] args) { // membuat main method
         int[] nilai = {75, 80, 65, 90, 85, 70, 95, 88}; // deklarasi array dengan memberi nilai awal
         int cari = 90; // deklarasi variabel cari dengan nilai 90
         boolean ketemu = false; // deklarasi variabel sama dengan nilai false
         int indeks = -1; // deklarasi variabel indeks dengan nilai -1

         for (int i = 0; i < nilai.length; i++) { // melakukan perulangan dan mendeklarasikan variabel i, memberitahukan bahwa i lebih kecil dari panjang array nilai
             if (nilai[i] == cari) { // melakukan perbandingan nilai array nilai[i] dengan nilai cari
                 ketemu = true; // jika nilai array nilai[i] sama dengan nilai cari, maka nilai ketemu menjadi true
                 indeks = i; // nilai indeks menjadi i
                 break; // menghentikan perulangan
     }
 }
     if(ketemu){ // jika nilai ketemu menjadi true
         System.out.println("Nilai " + cari + " ditemukan di indeks " + indeks); // menampilkan nilai cari dan indeksnya
     } else { // jika nilai tidak ditemukan menjadi false
         System.out.println("Nilai " + cari + " tidak ditemukan"); // menampilkan nilai yang cari tidak ditemukan
     }
     }



    // Stastistik Array
     public static void main(String[] args) { // membuat main method
         int[] nilai = {75, 80, 65, 90, 85, 70, 95, 88}; // deklarasi array dengan memberi nilai awal

         int tertinggi = nilai[0]; // nilai tertinggi diberi value array dengan nilai[0]
         int terendah = nilai[0]; // nilai terendah diberi value array dengan nilai[0]
         int total = nilai[0]; // nilai total diberi value array dengan nilai[0]

         for (int i = 1; i < nilai.length; i++) { // melakukan perulangan dan mendeklarasikan variabel i sama dengan 1, memberitahukan bahwa i lebih kecil dari panjang array nilai
             if (nilai[i] > tertinggi) tertinggi = nilai[i]; // jika nilai array nilai[i] lebih besar dari nilai tertinggi, maka nilai tertinggi sama dengan nilai array nilai[i]
             if (nilai[i] < terendah) terendah = nilai[i]; // jika nilai array nilai[i] lebih kecil dari nilai terendah, maka nilai terendah sama dengan nilai array nilai[i]
             total += nilai[i]; // nilai total ditambahkan dengan nilai array nilai[i]
             }

             double rataRata = (double) total / nilai.length; // nilai rata-rata dihitung dengan cara membagi nilai total dengan panjang array

             System.out.println("Nilai tertinggi: " + tertinggi); // menampilkan nilai tertinggi dan isi dari variabel tertinggi
             System.out.println("Nilai terendah: " + terendah); // menampilkan nilai terendah dan isi dari variabel terendah
             System.out.println("Rata-rata: " + rataRata); // menampilkan nilai rata-rata dan isi dari variabel rataRata
     }



    // Array 2D - Matriks
     public static void main(String[] args) { // membuat main method
         int[][] matriksA = { // deklarasi array 2D dengan nama matriksA
             {1, 2, 3}, // baris pertama
             {4, 5, 6} // baris kedua
         };

         int[][] matriksB = { // deklarasi array 2D dengan nama matriksB
             {7, 8, 9}, // baris pertama
             {10, 11, 12} // baris kedua
         };

         int[][] hasil = new int[2][3]; // deklarasi array 2D dengan nama hasil dan ukuran 2x3

         for (int i = 0; i < matriksA.length; i++) { // melakukan perulangan dan mendeklarasikan variabel i sama dengan 0, memberitahukan bahwa i lebih kecil dari panjang array matriksA
             for (int j = 0; j < matriksB.length; j++) { // melakukan perulangan dan mendeklarasikan variabel j sama dengan 0, memberitahukan bahwa j lebih kecil dari panjang array matriksB
                 hasil[i][j] = matriksA[i][j] + matriksB[i][j]; // hasil array 2D hasil diisi dengan hasil penjumlahan array 2D 
             }
         }

         System.out.println("Hasil penjumlahan matriks: ");
         for(int[] baris : hasil) {
             for (int nilai : baris) {
                 System.out.print(nilai + " ");
             }
             System.out.println();
         }

     }



     public static void main(String[] args) {
         String[] namaSiswa = {"dika", "ovi", "sarah", "una", "tata"};
         int[][] nilai = {
             {80, 85, 90},  // Nilai dika
             {70, 75, 80},  // Nilai ovi
             {85, 80, 88},  // Nilai sarah
             {90, 85, 95},  // Nilai una
             {70, 75, 80}   // Nilai tata
         };
         String[] mapel = {"Matematika", "Bahasa Inggris", "IPA"};

         // Menghitung rata-rata per siswa
         System.out.println("Rata-rata nilai per siswa: ");
         for (int i = 0; i < nilai.length; i++) {
             double total = 0;
             for (int n : nilai[i]) {
                 total += n;
         }
         double rataSiswa = total / nilai[i].length;
         System.out.printf("%s: %.2f ", namaSiswa[i], rataSiswa);
     }

     // Menghitung rata-rata per mata pelajaran
     System.out.println("Rata-rata nilai per mata pelajaran: ");
     for(int j = 0; j < nilai[0].length; j++) {
         double total = 0;
         for (int i = 0; i < nilai.length; i++) {
             total += nilai[i][j];
         }
         double rataMapel = total / nilai.length;
         System.out.printf("%s: %.2f ", mapel[j], rataMapel);
 }
 }



    // Permainan Tic-Tac-Toe
    public static void main(String[] args) {
        char[][] papan = new char[3][3];

         Inisialisasi papan kosong
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