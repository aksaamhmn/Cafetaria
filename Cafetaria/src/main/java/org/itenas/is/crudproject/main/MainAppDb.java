//package org.itenas.is.crudproject.main;
//
//import java.util.Scanner;
//import org.itenas.is.crudproject.viewdb.DosenTetapMenuDb;
//import org.itenas.is.crudproject.viewdb.DosenKontrakMenuDb;
//import org.itenas.is.crudproject.viewdb.DosenNonTendikMenuDb;
//
//public class MainAppDb {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int pilihan;
//        do {
//            System.out.println("----------------------------");
//            System.out.println("        Menu                ");
//            System.out.println("----------------------------");
//            System.out.println("1. Kelola Dosen Tetap       ");
//            System.out.println("2. Kelola Dosen Kontrak     ");
//            System.out.println("3. Kelola Data Non-Tendik   ");
//            System.out.println("4. Keluar Aplikasi          ");
//            System.out.println("----------------------------");
//            System.out.println("");
//            System.out.print("Masukkan pilihan: ");
//            pilihan = scanner.nextInt();
//            System.out.println("");
//            switch (pilihan) {
//                case 1:
//                    DosenTetapMenuDb.handleMenu();
//                    break;
//                case 2:
//                    DosenKontrakMenuDb.handleMenu();
//                    break;
//                case 3:
//                    DosenNonTendikMenuDb.handleMenu();
//                    break;
//                case 4:
//                    System.out.println("Anda telah keluar dari aplikasi.");
//                    break;
//                default:
//                    System.out.println("Pilihan tidak valid.");
//            }
//            
//        } while (pilihan != 4);
//    }
//}