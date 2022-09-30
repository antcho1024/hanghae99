package PublicTransport;
class Bus extends PublicTransport{
    // static int bus_number_cnt =0; // 버스의 모든 객체가 공유하면서 사용 -> 버스 number로 사용시 고유 번호 생성 가능
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
