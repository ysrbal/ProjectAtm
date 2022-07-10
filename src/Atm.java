import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String userName, password;
        int hak = 3;
        int bakiye = 2000;
        int cekme, yatirma;
        int choose;

        while (hak > 0) {
            System.out.print("Kullanici Adinizi Giriniz : ");
            userName = inp.nextLine();
            System.out.print("Sifrenizi Giriniz : ");
            password = inp.nextLine();
            if (userName.equals("Java101") && password.equals("patika.dev")) {
                System.out.println("Giris Basarili. X Bankasina Hosgeldiniz.");
                do {
                    System.out.println("Lutfen Yapmak Istediginiz Islemi Seciniz : ");
                    System.out.println("1 - Para Cekme\n" + "2 - Para Yatirma\n" + "3 - Bakiye Sorgulama\n" + "4 - Cikis");
                    System.out.print("Seciminiz : ");
                    choose = inp.nextInt();

                    switch (choose) {
                        case 1:
                            do {
                                System.out.println("Bakiyeniz :" + bakiye);
                                System.out.print("Lutfen Cekmek Istediginiz Tutari Giriniz : ");
                                cekme = inp.nextInt();
                                if (cekme > bakiye) {
                                    System.out.println("Yeterli Bakiyeniz Yoktur. Tekrar deneyiniz.");
                                } else {
                                    bakiye -= cekme;
                                    System.out.println("Para Cekme Isleminiz Basari ile Gerceklesti.");
                                    System.out.println("Kalan Bakiyeniz : " + bakiye);
                                    System.out.println(" ");
                                }
                            } while (cekme > bakiye);
                            break;
                        case 2:
                            System.out.println("Lutfen Yatirmak Istediginiz Tutari Giriniz : ");
                            yatirma = inp.nextInt();
                            bakiye += yatirma;
                            System.out.println("Guncel Bakiyeniz : " + bakiye);
                            System.out.println(" ");
                            break;
                        case 3:
                            System.out.println(" Guncel Bakiyeniz : " + bakiye);
                            System.out.println(" ");
                            break;
                        case 4:
                            System.out.println("Guvenli Sekilde Cikis Yaptiniz.");
                            System.out.println("Iyi Gunler Dileriz.");
                            break;
                    }
                } while (choose != 4);

                break;
            } else {
                hak--;
                System.out.println("Hatali kullanici adi ya da sifre girdiniz. Lutfen tekrar deneyiniz.");
                if (hak == 0) {
                    System.out.println("Sifreniz Bloke Olmustur. Lutfen Banka ile Iletisime Geciniz.");
                } else {
                    System.out.println("Kalan Hakkiniz : " + hak);
                }
            }
        }
    }
}
