package chukh_alex.hwl1t1;

public class App {
    public static void main(String[] args) {

        System.out.println("1) Computer:");
        Thingstable computer = new Thingstable(10.0,13000.0);
        computer.position1();
        computer.technics();
        System.out.println("It is my new computer:)");

        System.out.println("");
        System.out.println("2) Monitor:");
        Thingstable monitor = new Thingstable(3.0,3000.0);
        monitor.position2();
        monitor.technics();

        System.out.println("");
        System.out.println("3) Mouse: ");
        Thingstable mouse = new Thingstable(0.2, 750.0);
        mouse.position2();
        mouse.device();

        System.out.println("");
        System.out.println("4) Keyboard: ");
        Thingstable keyboard = new Thingstable(0.4, 500.0);
        keyboard.position2();
        keyboard.device();

        System.out.println("");
        System.out.println("5) Camera: ");
        Thingstable camera = new Thingstable(0.15, 300.0);
        camera.position3();
        camera.communication();

        System.out.println("");
        System.out.println("6) Printer: ");
        Thingstable printer = new Thingstable(5.0, 3000.0);
        printer.position2();
        printer.printing();

        System.out.println("");
        System.out.println("7) Headphones: ");
        Thingstable headphones = new Thingstable(0.4, 990.0);
        headphones.position2();
        headphones.sound();

        System.out.println("");
        System.out.println("8) Loudspeakers: ");
        Thingstable loudspeakers = new Thingstable(0.5, 1000.0);
        loudspeakers.position2();
        loudspeakers.music();

        System.out.println("");
        System.out.println("9) Tables lamp: ");
        Thingstable lamp = new Thingstable(0.800, 1100.0);
        lamp.position2();
        lamp.light();

        System.out.println("");
        System.out.println("10) Yummy:)))");
        Thingstable yummy = new Thingstable(1.0, 50.0);
        yummy.position2();
        yummy.yummy();
    }
}


