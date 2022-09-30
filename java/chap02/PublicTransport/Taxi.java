package PublicTransport;
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