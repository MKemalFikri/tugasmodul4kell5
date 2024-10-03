package tugasmodul4kell5;

import java.util.ArrayList;
import java.util.Scanner;

public class tugasmodull4kkel5 {
        static int motormaks = 10;
        static ArrayList<String[]> motor = new ArrayList<>();
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("selamat datang di data penyimpanan motor");
                System.out.println("1. tambah data motor");
                System.out.println("2. hapus data motor");
                System.out.println("3. cari motor anda");
                System.out.println("4. list motor anda");
                System.out.println("5. exit");
                System.out.println("ada yang bisa kami bantu?");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice){
                    case (1) :
                        tambahmotor(scanner);
                        break;
                    case (2) :
                        hapusmotor (scanner);
                        break;
                    case (3):
                        carimotor (scanner);
                        break;
                    case (4):
                        listmotor (scanner);
                        break;
                    case (5):
                        System.out.println("terimakasih telah memakai jasa kami");
                        scanner.close();
                        return;
                    default:
                        System.out.println("pilihan anda tidak valid");
                }
            }
        }
        public static void tambahmotor (Scanner scanner){
            if (motor.size() < motormaks) {
                System.out.println("masukan motor anda");
                String tipe = scanner.nextLine();
                System.out.println("masukan cc motor anda");
                String cc = scanner.nextLine();
                for (String[] Motor : motor) {
                    if (Motor[0].equalsIgnoreCase(tipe)){
                        System.out.println("motor dengan judul ini sudah ada");
                    }
                }
                motor.add(new String[] {tipe, cc});
                System.out.println("motor berhasil ditambahkan");
            }
            else {
                System.out.println("kepenuhan :(");
            }
        }
        public static void hapusmotor (Scanner scanner) {
            System.out.println("motor apa yang ingin anda hapus? ");
            String tipe = scanner.nextLine();
            boolean found = false;

            for (int i = 0; i <motor.size(); i++) {
                String [] Motor = motor.get(i);
                if (Motor[0].equalsIgnoreCase(tipe)){
                    motor.remove(i);
                    found = true;
                    System.out.println("motor " +tipe+ " berhasil di hapus");
                }
            }
            if (!found){
                System.out.println("motor belum kamu simpan");
            }
        }
        public static String[] carimotor (Scanner scanner){
            System.out.println("masukan motor yang ingin anda cari");
            String tipe = scanner.nextLine();
            boolean found = false;
            for (String[] Motor : motor){
                if (Motor[0].equalsIgnoreCase(tipe))
                    System.out.println("anda memiliki motor "+ Motor[0]+ " dengan cc "+Motor[1]);
                found = true;
                return Motor;
            }
            if (!found) {
                System.out.println("motornya tidak ada :(");
            }
            return null;
        }
        public static void listmotor (Scanner scanner){
            System.out.println("ini motor yang ada di data penyimpanan");
            if (motor.isEmpty()){
                System.out.println("belum ada data motor yang kamu simpan");
            }
            else {
                for (String [] Motor : motor){
                    System.out.println("Motor: "+Motor[0]+ " cc: " +Motor[1]);
                }
            }
        }
    }
