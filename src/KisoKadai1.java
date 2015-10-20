
import java.io.*;

public class KisoKadai1 {

	public static void main(String[] args) {

		// xの値をキーボードから入力（1~100の整数を入力するまでループ）
		int x = 0;
		while (x < 1 || 100 < x) {
			System.out.print("1から100までの整数xの値を入力してください: ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				String buf = br.readLine();
				x = Integer.parseInt(buf);
			} catch (Exception e) {
				// e.printStackTrace();
				x = 0;
			}
		}
		// yの値をキーボードから入力（1~100の整数を入力するまでループ）
		int y = 0;
		while (y < 1 || 100 < y) {
			System.out.print("1から100までの整数ｙの値を入力してください: ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				String buf = br.readLine();
				y = Integer.parseInt(buf);
			} catch (Exception e) {
				// e.printStackTrace();
				y = 0;
			}
		}

		// 九九表の表示
		for (int i = y; i > 0; i--) {
			for (int j = 1; j <= x; j++) {
				// x*yの桁数によって余白の大きさを変化させることで調整
				if (i * j < 10) {
					System.out.print("     ");
				} else if (i * j < 100) {
					System.out.print("    ");
				} else if (i * j < 1000) {
					System.out.print("   ");
				} else if (i * j < 10000) {
					System.out.print("  ");
				} else {
					System.out.print(" ");
				}
				
				// ｘ*ｙの結果を出力
				System.out.print(i * j);
			}
			System.out.println();
		}

	}

}