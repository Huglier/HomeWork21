public class Main {
    public static void main(String[] args) {
        Transport[] transports = {
            new Bicycle("Stels", 2),
            new Car("BMW",4),
            new Truck("Man",12)
        };


    ServiceStation serviceStation = new ServiceStation();
    serviceStation.check(transports[2]);
    serviceStation.check(transports[1]);
    serviceStation.check(transports[0]);
}
}