
import java.io.*;

public class KisoKadai1 {

	public static void main(String[] args) {

		// x�̒l���L�[�{�[�h������́i1~100�̐�������͂���܂Ń��[�v�j
		int x = 0;
		while (x < 1 || 100 < x) {
			System.out.print("1����100�܂ł̐���x�̒l����͂��Ă�������: ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				String buf = br.readLine();
				x = Integer.parseInt(buf);
			} catch (Exception e) {
				// e.printStackTrace();
				x = 0;
			}
		}
		// y�̒l���L�[�{�[�h������́i1~100�̐�������͂���܂Ń��[�v�j
		int y = 0;
		while (y < 1 || 100 < y) {
			System.out.print("1����100�܂ł̐������̒l����͂��Ă�������: ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				String buf = br.readLine();
				y = Integer.parseInt(buf);
			} catch (Exception e) {
				// e.printStackTrace();
				y = 0;
			}
		}

		// ���\�̕\��
		for (int i = y; i > 0; i--) {
			for (int j = 1; j <= x; j++) {
				// x*y�̌����ɂ���ė]���̑傫����ω������邱�ƂŒ���
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
				
				// ��*���̌��ʂ��o��
				System.out.print(i * j);
			}
			System.out.println();
		}

	}

}
