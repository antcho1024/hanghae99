package PublicTransport;

public class Main {
    public static void main(String args[]){
        // 버스 2대 생성
        Bus bus_1 = new Bus("0001");
        Bus bus_2 = new Bus("0002");
        // 각 버스 번호 다른지 확인
        System.out.println("버스1 번호 : "+bus_1.number +"\n" +"버스2 번호 : "+bus_2.number + "\n");

        // (1,2) 승객 2명 탑승
        int fee = bus_1.PassengerBoarding(2);
        System.out.println("탑승 승객 수 : "+bus_1.passenger);
        System.out.println(String.format("잔여 승객 수 : %d", bus_1.maxPassenger - bus_1.passenger ));
        System.out.println(String.format("요금 확인 : %d",fee));
        System.out.println();

        // (3,4) 주유량 -50
        bus_1.ChangeFuel(-50);
        System.out.println(String.format("주유량 : %d",bus_1.fuel));
        System.out.println();

        // (5,6)상태 차고지행으로 변경, 주유 +10
        bus_1.ChangeState(0);
        bus_1.ChangeFuel(10);
        // (7)출력
        bus_1.PrintState();
        System.out.println(String.format("주유량 : %d",bus_1.fuel));
        System.out.println();

        // (8)상태변경
        bus_1.ChangeState(1);
        // (9,10) 승객 +45, 경고
        bus_1.PassengerBoarding(45);
        // (11, 12)
        fee = bus_1.PassengerBoarding(5);
        System.out.println("탑승 승객 수 : "+bus_1.passenger);
        System.out.println(String.format("잔여 승객 수 : %d", bus_1.maxPassenger - bus_1.passenger ));
        System.out.println(String.format("요금 확인 : %d",fee));
        System.out.println();

        // (13,14,15)
        bus_1.ChangeFuel(-55);
        System.out.println(String.format("주유량 : %d",bus_1.fuel));
        bus_1.PrintState();
        System.out.println();

        System.out.println("----------------------");
        ////////////////////////////////////////////////////

        Taxi taxi_1 = new Taxi("0003");
        Taxi taxi_2 = new Taxi("0004");

        System.out.println("버스1 번호 : "+bus_1.number +"\n" +"버스2 번호 : "+bus_2.number + "\n");
        System.out.println("taxi 1 주유량 : "+ taxi_1.fuel);
        System.out.println("taxi 2 주유량 : "+ taxi_1.fuel);
        System.out.print("taxi 1");
        taxi_1.PrintState();
        System.out.print("taxi 2");
        taxi_2.PrintState();
        System.out.println();

        // (1,2)
        fee = taxi_1.PassengerBoarding(2, "서울역",2);
        System.out.println("탑승 승객 수 : "+taxi_1.passenger);
        System.out.println(String.format("잔여 승객 수 : %d", taxi_1.maxPassenger - taxi_1.passenger ));
        System.out.println(String.format("요금 확인 : %d",taxi_1.basicFee));
        System.out.println(String.format("목적지 : %s",taxi_1.destination));
        System.out.println(String.format("목적지까지 거리 : %s",taxi_1.distance));
        System.out.println(String.format("지불할 요금 : %s",fee));
        taxi_1.PrintState();
        System.out.println();

        // (3)
        taxi_1.ChangeFuel(-80);
        // (4)
        taxi_1.Payment();
        //(5)
        System.out.println("주유량 : "+ taxi_1.fuel);
        System.out.println("누적요금 : "+ taxi_1.SumFee);
        System.out.println();

        // (6)
        fee = taxi_1.PassengerBoarding(5, "",0);
        System.out.println();

        // (7)
        fee = taxi_1.PassengerBoarding(3, "구로디지털단지역",12);
        // (8,9)
        System.out.println("탑승 승객 수 : "+taxi_1.passenger);
        System.out.println(String.format("잔여 승객 수 : %d", taxi_1.maxPassenger - taxi_1.passenger ));
        System.out.println(String.format("요금 확인 : %d",taxi_1.basicFee));
        System.out.println(String.format("목적지 : %s",taxi_1.destination));
        System.out.println(String.format("목적지까지 거리 : %s",taxi_1.distance));
        System.out.println(String.format("지불할 요금 : %s",fee));
        System.out.println();
        // (10)
        taxi_1.ChangeFuel(-20);
        // (11)
        taxi_1.Payment();
        // (12)
        System.out.println("주유량 : "+ taxi_1.fuel);
        taxi_1.PrintState();
        System.out.println("누적요금 : "+ taxi_1.SumFee);
    }
}