public class MotorDemo {
    public static void main(String[] args) {
        Motor motor1 = new Motor("A", 100);
        Motor motor2 = new Motor("B", 200);
        Motor motor3 = new Motor("C", 300);
        Motor motor4 = new Motor("D", 400);
        Motor motor5 = new Motor("E", 500);

        Motor[] motor = new Motor[5];
        motor[0] = motor1;
        motor[1] = motor2;
        motor[2] = motor3;
        motor[3] = motor4;
        motor[4] = motor5;
        
        motor[0].ligar();
        motor[2].ligar();
        motor[4].ligar();
        
        for(int i = 0; i < motor.length; i++){
            if(!motor[i].isLigado()){
                System.out.println(motor[i].getPotencia());
            }
        }
    }
}
