Buat Output seperti di bawah ini: 
        // 1,2,3,4,5,
        // 1,2,3,4,5
        // 1,3,5
        // 5,3,1
        // 2,4
        // 1,1,3,2,5


public class Main{ // deklarasi class main
    public static void main(String[] args) { // deklarasi method main
        //deklarasi dan inisialisasi 
        int[] number =  new int [5]; // deklarasi array number dengan panjang integer di dalam array = 5
        // inisialisasi
        number [0]=1; // nilai array number di index 0 = 1
        number [1]=2; // nilai array number di index 1 = 2
        number [2]=3; // nilai array number di index 2 = 3
        number [3]=4; // nilai array number di index 3 = 4
        number [4]=5; // nilai array number di index 4 = 5
         

     Menambahi koma setelah angka dengan hasil output horizontal
     for (int i = 0; i < number.length; i++) { // perulangan for dengan kondisi i < panjang array number
         System.out.print(number[i] + ","); // cetak nilai array number di index i dan tambahkan koma


    Menghilangkan koma setelah angka 5
     for(int i = 0; i< number.length; i++){ // perulangan for dengan kondisi i < panjang array number
         System.out.print(number[i]); // cetak nilai array number di index i
         if (i < number.length -1)  { // kondisi jika i < panjang array number - 1
         System.out.print(","); // cetak koma
         System.out.print(number[i] + (i < number.length -1 ? "," : "")); // cetak nilai array number di index i dan tambahkan koma jika i < panjang array


     Menampilkan angka 1,3,5
     for (int i = 0; i < number.length; i++) { // perulangan for dengan kondisi i < panjang array number
         if (i % 2 == 0) { // kondisi jika i % 2 == 0
             System.out.print(number[i] + (i < number.length -1 ? "," : "")); // cetak nilai array number di index i dan tambahkan koma jika i < panjang array
     }
     }


     Membuat output horizontal dengan urutan 5,3,1
     for (int i = number.length - 1; i >= 0; i--) { // perulangan for dengan kondisi i lebih/sama denagn 0 dan i kurang/sama dengan panjang number array 
         if(i % 2 == 0) { // kondisi jika i % 2 == 0
             System.out.print(number[i]); // cetak nilai array number di index i
             if(i>0){ // kondisi jika i lebih dari 0
                 System.out.print(","); // cetak koma
             }
         }



         Menampilkan output 2,4
         System.out.print(number[1] + "," + number[3]); // cetak nilai array number di index 1 dan 3 dan tambahkan koma


         Menampilkan output 1,1,3,2,5
         System.out.println(number[0] + number[0] + number[2] + number[1] + number[4]); // cetak nilai array number di index 0,0,2,1,4 


        
        }
    }



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




    <!------------ Latihan Array ------------->


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

         System.out.println("Hasil penjumlahan matriks: "); // menampilkan output "Hasil penjumlahan matriks: "
         for(int[] baris : hasil) { // melakukan perulangan dan mendeklarasikan variabel baris sama dengan hasil
             for (int nilai : baris) { // melakukan perulangan dan mendeklarasikan variabel nilai sama dengan baris
                 System.out.print(nilai + " "); // menampilkan value dari variabel nilai dan spasi
             }
             System.out.println(); // menampilkan enter
         }

     }



     public static void main(String[] args) { // membuat main method
         String[] namaSiswa = {"dika", "ovi", "sarah", "una", "tata"}; // deklarasi array string dengan nama namaSiswa dan isi arraynya
         int[][] nilai = { // deklarasi array 2D dengan nama nilai
             {80, 85, 90},  // Nilai dika
             {70, 75, 80},  // Nilai ovi
             {85, 80, 88},  // Nilai sarah
             {90, 85, 95},  // Nilai una
             {70, 75, 80}   // Nilai tata
         };
         String[] mapel = {"Matematika", "Bahasa Inggris", "IPA"}; // deklarasi array string dengan nama mapel dan isi arraynya

         // Menghitung rata-rata per siswa
         System.out.println("Rata-rata nilai per siswa: "); // menampilkan output "Rata-rata nilai per siswa: "
         for (int i = 0; i < nilai.length; i++) { // melakukan perulangan dan mendeklarasikan variabel i sama dengan 0, memberitahukan bahwa i lebih kecil dari panjang array nilai
             double total = 0; // deklarasi variabel total dengan tipe data double dan nilai 0
             for (int n : nilai[i]) { // melakukan perulangan dan mendeklarasikan variabel n sama dengan nilai array 2
                 total += n; // total ditambahkan dengan nilai n
         }
         double rataSiswa = total / nilai[i].length; // rataSiswa dihitung dengan cara membagi total dengan panjang array nilai
         System.out.printf("%s: %.2f ", namaSiswa[i], rataSiswa); // menampilkan namaSiswa[i] dan rataSiswa dengan format %.2f (.2f) membatasi hasil format menjadi dua angka di belakang koma.
     }

     // Menghitung rata-rata per mata pelajaran
     System.out.println("Rata-rata nilai per mata pelajaran: "); // menampilkan output "Rata-rata nilai per mata pelajaran: "
     for(int j = 0; j < nilai[0].length; j++) { // melakukan perulangan dan mendeklarasikan variabel j sama dengan 0, memberitahukan bahwa j lebih kecil dari panjang array nilai[0]
         double total = 0; // deklarasi variabel total dengan tipe data double dan nilai 0
         for (int i = 0; i < nilai.length; i++) { // melakukan perulangan dan mendeklarasikan variabel i sama dengan 0, member
             total += nilai[i][j]; // total ditambahkan dengan nilai array 2D nilai[i][j]
         }
         double rataMapel = total / nilai.length; // rataMapel dihitung dengan cara membagi total dengan panjang array nilai
         System.out.printf("%s: %.2f ", mapel[j], rataMapel); // menampilkan mapel[j] dan rataMapel dengan format %.2f (.2f) membatasi hasil format menjadi dua angka di belakang koma.
 }
 }



    // Permainan Tic-Tac-Toe
    public static void main(String[] args) { // membuat main method
        char[][] papan = new char[3][3]; // deklarasi array 2D dengan nama papan dan isi arraynya

         Inisialisasi papan kosong
        for (int i = 0; i < 3; i++) { // melakukan perulangan dan mendeklarasikan variabel i sama dengan 0, memberitahukan bahwa i lebih kecil dari 3
            for (int j = 0; j < 3; j++) { // melakukan perulangan dan mendeklarasikan variabel j sama dengan 0, memberitahukan bahwa j lebih kecil dari 3
                papan[i][j] = '-'; // papan[i][j] diinisialisasi dengan nilai '-'
            }
    }

    // Simulasi beberapa langkah
    papan[0][0] = 'X'; // papan[0][0] diinisialisasi dengan nilai 'X'
    papan[1][1] = 'O'; // papan[1][1] diinisialisasi dengan nilai 'O'
    papan[2][2] = 'X'; // papan[2][2] diinisialisasi dengan nilai 'X'

     // Tampilkan papan
    System.out.println("Status Papan: "); // menampilkan output "Status Papan: "
    tampilkanPapan(papan); // memanggil method tampilkanPapan dengan parameter papan
    
}

public static void tampilkanPapan(char[][] papan) { // membuat method tampilkanPapan dengan parameter papan
    for (int i = 0; i < 3; i++) { // melakukan perulangan dan mendeklarasikan variabel i sama dengan 0, memberitahukan bahwa i lebih kecil dari 3
        for (int j = 0; j < 3; j++) {  // melakukan perulangan dan mendeklarasikan variabel j sama dengan 0, memberitahukan bahwa j lebih kecil dari 3
            System.out.print(papan[i][j] + " "); // menampilkan papan yang berisikan indeks[i], indeks[j] dengan tambahan spasi
        }
        System.out.println(); // menampilkan output baris baru
    }
}
}