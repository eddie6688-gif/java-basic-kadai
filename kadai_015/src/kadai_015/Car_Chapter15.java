package kadai_015;

// 車子類別
public class Car_Chapter15 {
	// 1. 欄位 (Field)
	private int gear = 1; // 初期值為 1
	private int speed = 10; // 初期值為 10

	// 2. 方法：切換編號 (changeGear)
	public void changeGear(int afterGear) {
		// 先印出切換訊息
		System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");

		// 更新目前的齒輪位置
		this.gear = afterGear;

		// 根據切換後的齒輪決定速度 (使用 switch 或 if-else)
		switch (this.gear) {
		case 1 -> this.speed = 10;
		case 2 -> this.speed = 20;
		case 3 -> this.speed = 30;
		case 4 -> this.speed = 40;
		case 5 -> this.speed = 50;
		default -> this.speed = 10; // 如果不是 1~5，速度設為 10
		}
	}

	// 3. 方法：跑起來 (run)
	public void run() {
		System.out.println("速度は時速" + this.speed + "kmです");
	}
}