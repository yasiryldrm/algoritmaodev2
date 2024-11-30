import java.util.Scanner;

public class YemekSiparişSistemi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplamTutar = 0;
        boolean siparişDevam = true;

        while (siparişDevam) {
            // Menüyü göster
            System.out.println("\n---- MENÜ ----");
            System.out.println("1. Pizza: 50 TL");
            System.out.println("2. Burger: 30 TL");
            System.out.println("3. İçecek: 10 TL");
            System.out.println("0. Siparişi Tamamla");

            System.out.print("\nLütfen bir ürün seçiniz (0-3): ");
            int secim = scanner.nextInt();

            if (secim == 0) {
                siparişDevam = false;
                continue;
            }

            if (secim < 0 || secim > 3) {
                System.out.println("Geçersiz seçim! Lütfen tekrar deneyiniz.");
                continue;
            }

            System.out.print("Kaç adet istiyorsunuz?: ");
            int adet = scanner.nextInt();

            // Tutarı hesapla
            switch (secim) {
                case 1:
                    toplamTutar += 50 * adet;
                    System.out.println(adet + " adet Pizza eklendi.");
                    break;
                case 2:
                    toplamTutar += 30 * adet;
                    System.out.println(adet + " adet Burger eklendi.");
                    break;
                case 3:
                    toplamTutar += 10 * adet;
                    System.out.println(adet + " adet İçecek eklendi.");
                    break;
            }

            System.out.println("Toplam Tutar: " + toplamTutar + " TL");
        }

        if (toplamTutar > 0) {
            boolean odemeTamam = false;

            while (!odemeTamam) {
                System.out.println("\nToplam Ödemeniz Gereken Tutar: " + toplamTutar + " TL");
                System.out.print("Lütfen ödeme yapınız: ");
                int odeme = scanner.nextInt();

                if (odeme == toplamTutar) {
                    System.out.println("Siparişiniz onaylandı. Afiyet olsun!");
                    odemeTamam = true;
                } else if (odeme < toplamTutar) {
                    System.out.println("Yetersiz ödeme! Lütfen tekrar deneyiniz.");
                } else {
                    System.out.println("Para üstü: " + (odeme - toplamTutar) + " TL");
                    System.out.println("Siparişiniz onaylandı. Afiyet olsun!");
                    odemeTamam = true;
                }
            }
        }

        scanner.close();
    }
}