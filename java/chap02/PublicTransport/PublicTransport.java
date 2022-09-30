package PublicTransport;

abstract class PublicTransport{
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
    abstract void ChangeSpeed(int speedChange );
    // 상태 변경 (운행 시작 포함)
    public void ChangeState(int state){
        this.state = state;
        if(state!=1) passenger =0; //차고지행 또는 일반으로 변경시 승객 0명으로 초기화
    }
    // 상태 출력
    abstract void PrintState();
    // 주유량 변경
    abstract void ChangeFuel(int amount);

}
