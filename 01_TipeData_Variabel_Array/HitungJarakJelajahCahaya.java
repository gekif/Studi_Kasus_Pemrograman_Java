public class HitungJarakJelajahCahaya {
    public static void main(String args[]) {
        int kecCahaya;
        long hari, detik, jarak;

        // Kecepatan cahaya  dalam km per detik
        kecCahaya =  340000;
        hari = 1000;

        detik = hari  * 24 * 60 * 60;
        jarak  = kecCahaya * detik;

        System.out.print("Dalam " +  hari);
        System.out.print(" hari, cahaya menjelajah berkisar ");
        System.out.println( jarak + " km. ");
    }
}
