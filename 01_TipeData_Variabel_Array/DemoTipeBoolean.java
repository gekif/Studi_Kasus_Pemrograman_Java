public class DemoTipeBoolean {
    public static void main(String[] args) {
        boolean b = false;
        System.out.println("b adalah " + b);

        b = true;
        System.out.println("b adalah " + b);

        // Suatu nilai boolean dapat  mengendalikan statemtn if
        if (b) System.out.println("Ini dieksekusi.");

        b = false;
        if (b) System.out.println("Ini tidak dieksekusi.");

        // Keluaran dari operator relasional adalah  nilai boolean
        System.out.println("10 > 9 adalah " + (10 > 9));
    }
}
