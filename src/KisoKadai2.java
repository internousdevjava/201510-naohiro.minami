import java.io.*;

public class KisoKadai2 {

	public static void main(String[] args) {
		System.out.println("1�`100�܂ł̐����𓖂Ă�Q�[���ł�");
		// �Ō��1����͂����瑱�s�A2����͂�����I������̂�x��1�ŏ�����
		int x = 1;
		while (x == 1) {
			// 1�`100�̐����̗����𐶐���ans�ɑ��
			int ans = (int) (Math.random() * 99 + 1);

			while (true) {
				System.out.println("�����ł��傤�H");

				// 1�`100�����͂����܂Ń��[�v
				x = 0;
				while (x < 1 || 100 < x) {
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					try {
						String buf = br.readLine();
						x = Integer.parseInt(buf);
						if (x < 1 || 100 < x) {
							System.out.println("1�`100�œ����Ă�������");
						}
					} catch (Exception e) {
						// e.printStackTrace();
						x = 0;
						System.out.println("1�`100�œ����Ă�������");
					}
				}

				// �������ǂ����̔���
				if (x > ans)
					System.out.println("�傫����");
				else if (x < ans)
					System.out.println("��������");
				else {
					System.out.println("����");
					break;
				}
			}
			
			System.out.println("���������H");
			System.out.println("���F1   ���Ȃ��F2");

			// 1,2�����͂����܂Ń��[�v
			x = 0;
			while (x < 1 || 2 < x) {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				try {
					String buf = br.readLine();
					x = Integer.parseInt(buf);
					if (x < 1 || 2 < x) {
						System.out.println("1or2�œ����Ă�������");
					}
				} catch (Exception e) {
					// e.printStackTrace();
					x = 0;
					System.out.println("1or2�œ����Ă�������");
				}
			}
			// �p���Ȃ�ans��ran�̒l���������[�v�A�I���Ȃ烋�[�v�𔲂��ăv���O�����I��
			if (x != 1) break;
		}
	}

}
