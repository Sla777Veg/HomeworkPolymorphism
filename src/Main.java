public class Main {
    public static void main(String[] args) {
        Car lada = new Car("lada","Granta",1.7);
        DriverB driverB = new DriverB("Вася",2, lada);
        dataCar(lada, driverB);

        Car kia = new Car("kia","Sportage", 2.4);
        DriverB driverB2 = new DriverB("Коля",3, kia);
        dataCar2(kia, driverB2);

        Bus ferrari = new Bus("ferrari", "F-500", 3.4);
        DriverD driverD = new DriverD("Маша",5, ferrari);
        dataCar3(ferrari, driverD);

        CargoCar mercedes = new CargoCar("mercedes", "SCLK", 4.1);
        DriverC driverC = new DriverC("Даша",10, mercedes);
        dataCar4(mercedes, driverC);

        System.out.println(kia.equals(lada));
        System.out.println(kia.equals(kia));
        System.out.println(mercedes.equals(mercedes));
        System.out.println(mercedes.equals(ferrari));

    }

    private static void dataCar(Car lada, DriverB driverB) {
        System.out.print("\n");
        System.out.println(driverB);
        System.out.println(lada);
        driverB.startMove();
        lada.PitStop();
        driverB.refill();
        driverB.finishMove();
        System.out.println("Лучшее время круга: "+lada.BestLap());
        System.out.println("Максимальная скорость: "+lada.maxSpeed());
    }

    private static void dataCar2(Car kia, DriverB driverB2) {
        System.out.print("\n");
        System.out.println(driverB2);
        System.out.println(kia);
        driverB2.startMove();
        kia.PitStop();
        driverB2.refill();
        driverB2.finishMove();
        System.out.println("Лучшее время круга: "+kia.BestLap());
        System.out.println("Максимальная скорость: "+kia.maxSpeed());

    }

    private static void dataCar3(Bus ferrari, DriverD driverD) {
        System.out.print("\n");
        System.out.println(driverD);
        System.out.println(ferrari);
        driverD.startMove();
        ferrari.PitStop();
        driverD.refill();
        driverD.finishMove();
        System.out.println("Лучшее время круга: "+ferrari.BestLap());
        System.out.println("Максимальная скорость: "+ferrari.maxSpeed());
    }

    private static void dataCar4(CargoCar mercedes, DriverC driverC) {
        System.out.print("\n");
        System.out.println(driverC);
        System.out.println(mercedes);
        driverC.startMove();
        mercedes.PitStop();
        driverC.refill();
        driverC.finishMove();
        System.out.println("Лучшее время круга: "+mercedes.BestLap());
        System.out.println("Максимальная скорость: "+mercedes.maxSpeed());
    }

}