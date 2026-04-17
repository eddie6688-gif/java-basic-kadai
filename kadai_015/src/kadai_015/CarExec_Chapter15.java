package kadai_015;

public class CarExec_Chapter15 {
	public static void main(String[] args) {

		// 1. 產生車子的實體 (實體化)
		Car_Chapter15 myCar = new Car_Chapter15();

		// 2. 呼叫切換齒輪的方法，並傳入參數 3
		myCar.changeGear(3);

		// 3. 呼叫行駛的方法來顯示速度
		myCar.run();
	}
}