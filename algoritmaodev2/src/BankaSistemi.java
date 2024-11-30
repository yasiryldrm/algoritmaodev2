import java.util.Scanner;
public class BankaSistemi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Başlangıç bakiyenizi giriniz: ");
        double bakiye = scanner.nextDouble();

        boolean devamEt = true;

        while (devamEt) {
            System.out.println("\n=== BANKA İŞLEMLERİ ===");
            System.out.println("1. Para Yatırma");
            System.out.println("2. Para Çekme");
            System.out.println("3. Bakiye Sorgulama");
            System.out.println("4. Çıkış");
            System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz (1-4): ");

            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
                    double yatirilanTutar = scanner.nextDouble();
                    if (yatirilanTutar > 0) {
                        bakiye += yatirilanTutar;
                        System.out.println("İşlem başarılı! Yeni bakiyeniz: " + bakiye + " TL");
                    } else {
                        System.out.println("Geçersiz tutar! Lütfen pozitif bir değer giriniz.");
                    }
                    break;

                case 2:
                    System.out.print("Çekmek istediğiniz tutarı giriniz: ");
                    double cekilenTutar = scanner.nextDouble();
                    if (cekilenTutar > 0) {
                        if (cekilenTutar <= bakiye) {
                            bakiye -= cekilenTutar;
                            System.out.println("Para çekme işlemi başarılı! Yeni bakiyeniz: " + bakiye + " TL");
                        } else {
                            System.out.println("Yetersiz bakiye! Mevcut bakiyeniz: " + bakiye + " TL");
                        }
                    } else {
                        System.out.println("Geçersiz tutar! Lütfen pozitif bir değer giriniz.");
                    }
                    break;

                case 3:
                    System.out.println("Mevcut bakiyeniz: " + bakiye + " TL");
                    break;

                case 4:
                    System.out.println("Bizi tercih ettiğiniz için teşekkürler. İyi günler!");
                    devamEt = false;
                    break;

                default:
                    System.out.println("Geçersiz seçim! Lütfen 1-4 arasında bir değer giriniz.");
            }
        }

        scanner.close();
    }
}

