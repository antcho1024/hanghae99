class PublicTransport{
    public String number;       // 번호
    public int passenger = 0;   // 현재 승객 수
    public int fuel = 100;      // 주유량
    public int speed = 0;       // 속도
    public int speedChange;         // 속도변경
    public int state;// 상태 (bus: 1 운행중, 0 차고지행 / taxi:1 운행중, 0 일반 -1운행불가)
    public int maxPassenger;// 최대 승객 수

    PublicTransport(int maxPassenger, String number){
        this.maxPassenger = maxPassenger;
        this.number = number;
    }


    // 속도 변경
    public void ChangeSpeed(int speedChange ){}
    // 상태 변경 (운행 시작 포함)
    public void ChangeState(int state){
        this.state = state;
        if(state!=1) passenger =0; //차고지행 또는 일반으로 변경시 승객 0명으로 초기화
    }
    // 상태 출력
    public void PrintState(){}
    // 주유량 변경
    public void ChangeFuel(int amount){}

}

class Bus extends PublicTransport{
    public int fee = 1000;      // 요금
    Bus(String number){
        super(30, number);
        state = 1;
    }

    public int PassengerBoarding(int cnt){
        passenger += cnt;
        if(passenger >maxPassenger) {
            System.out.println("최대 승객 수 초과");
            passenger -=cnt;
            return 0;
        }
        return fee*cnt; // 지불할 요금
    }
    @Override
    public void PrintState(){
        if(state==1) System.out.println("상태 : 운행");
        else System.out.println("상태 : 차고지행");
    }
    @Override
    public void ChangeFuel(int amount){
        fuel += amount;
        if(fuel <10) {
            System.out.println("주유 필요\n");
            ChangeState(0); // 상태 차고지행으로 변경
        }
    }
    @Override
    public void ChangeSpeed(int speedChange ){
        if(fuel<10){
            System.out.println("운행할 수 없습니다. 주유 필요\n");
            return;
        }
        speed += speedChange;
    }




}
class Taxi extends PublicTransport{
    public String destination ="";
    public int distance;
    public int basicDistance = 1;
    public int basicFee = 3000;
    public int perFee = 1000;
    public int SumFee = 0;
    Taxi(String number){
        super(4, number);
        state = 0;
    }
    @Override
    public void PrintState(){
        if(state==1) System.out.println("상태 : 운행중");
        else if(state == 0) System.out.println("상태 : 일반");
        else System.out.println("상태 : 운행불가");
    }
    @Override
    public void ChangeFuel(int amount){
        fuel += amount;
        if(fuel <10) {
            System.out.println("주유 필요\n");
            ChangeState(-1); // 운행 불가 상태로 변경
        }
    }
    @Override
    public void ChangeSpeed(int speedChange ){
//        if(fuel<10){
//            System.out.println("운행할 수 없습니다. 주유 필요\n");
//            return;
//        }
        speed += speedChange;
    }
    public int PassengerBoarding(int cnt, String destination, int distance){
        if(state!=0) return 0; // 탑승 불가
        passenger += cnt;
        if(passenger >maxPassenger) {
            System.out.println("최대 승객 수 초과");
            passenger -= cnt;
            return 0;
        }
        ChangeState(1);
        this.destination = destination;
        this.distance = distance;
        SumFee += (distance-basicDistance)*perFee + basicFee; //누적 요금 게산
        return (distance-basicDistance)*perFee + basicFee; //지불할 요금
    }
//    // 거리당 요금 추가 -> PassengerBoarding에서 했는데.. 분리할까..
//    public void AddFee{
//
//    }
    // 요금 결제
    public void Payment(){
        if(state ==1)  ChangeState(0); // 상태 일반으로 변경
        passenger = 0;      // 현재 타 있는 승객 0으로 초기화
    }
}

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
