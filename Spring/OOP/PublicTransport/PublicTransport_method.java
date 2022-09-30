package PublicTransport;

public interface PublicTransport_method {
    // 속도 변경
    abstract void ChangeSpeed(int speedChange );
    // 상태 출력
    abstract void PrintState();
    // 주유량 변경
    abstract void ChangeFuel(int amount);

}
