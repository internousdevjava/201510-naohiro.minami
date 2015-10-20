import java.io.*;

public class KisoKadai2 {

	public static void main(String[] args) {
		System.out.println("1～100までの整数を当てるゲームです");
		// 最後に1を入力したら続行、2を入力したら終了するのでxを1で初期化
		int x = 1;
		while (x == 1) {
			// 1～100の整数の乱数を生成しansに代入
			int ans = (int) (Math.random() * 99 + 1);

			while (true) {
				System.out.println("いくつでしょう？");

				// 1～100が入力されるまでループ
				x = 0;
				while (x < 1 || 100 < x) {
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					try {
						String buf = br.readLine();
						x = Integer.parseInt(buf);
						if (x < 1 || 100 < x) {
							System.out.println("1～100で答えてください");
						}
					} catch (Exception e) {
						// e.printStackTrace();
						x = 0;
						System.out.println("1～100で答えてください");
					}
				}

				// 正解かどうかの判定
				if (x > ans)
					System.out.println("大きすぎ");
				else if (x < ans)
					System.out.println("小さすぎ");
				else {
					System.out.println("正解");
					break;
				}
			}
			
			System.out.println("もう一回やる？");
			System.out.println("やる：1   やらない：2");

			// 1,2が入力されるまでループ
			x = 0;
			while (x < 1 || 2 < x) {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				try {
					String buf = br.readLine();
					x = Integer.parseInt(buf);
					if (x < 1 || 2 < x) {
						System.out.println("1or2で答えてください");
					}
				} catch (Exception e) {
					// e.printStackTrace();
					x = 0;
					System.out.println("1or2で答えてください");
				}
			}
			// 継続ならansにranの値を代入しループ、終了ならループを抜けてプログラム終了
			if (x != 1) break;
		}
	}

}