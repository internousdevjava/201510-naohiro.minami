import java.io.*;

public class KisoKadai3 {
	public static void main(String[] args) {

		String str = null; 			//�������ݓ��e
		String dir_path = null;		//�f�B���N�g���̃p�X
		String file_name = null;	//�t�@�C����
		boolean bool = true;		//�������݂��s���ۂɁA�㏑�����ǋL��I�����邽�߂̕ϐ�(true�ŒǋL)
		int newfile = 0;			//�V���Ƀt�@�C�����쐬�������ǂ����𔻒�i�V���ɍ쐬�����ۂ�1�ɂ���j
		int kakiyomi = 1;			//�������݂��ǂݍ��݂���I���i1�̂Ƃ��������݁j

		// �t�@�C���̓ǂݍ���or��������
		System.out.println("�e�L�X�g�t�@�C���̓ǂݍ��݂Ə������݂��ł��܂�");

		// �J��Ԃ�
		int roop = 0;	//roop=0�A2�̂Ƃ����[�v�Aroop=1�̂Ƃ��I��
		while (roop != 1) {

			// �f�B���N�g���̎w��
			int dir_roop = 0;	//dir_roop=0�A2�̂Ƃ����[�v�Adir_roop=1�̂Ƃ����[�v�I��
			while (dir_roop != 1) {
				System.out.println("�f�B���N�g�����w�肵�Ă�������");
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				try {
					dir_path = br.readLine();
				} catch (Exception e) {
					// e.printStackTrace();
				}
				
				// �f�B���N�g�������݂��Ă��邩�m�F����
				File dir = new File(dir_path);
				if (!dir.exists()) {
					System.out.println("���݂��Ȃ��f�B���N�g���ł����V���Ƀf�B���N�g�����쐬���܂����H");
					System.out.println("�V���Ƀf�B���N�g�����쐬�F1�@�@�f�B���N�g���̃p�X����͂��Ȃ����F2");
					// �f�B���N�g�����쐬���邩�ۂ�
					int newdir = 0;		//newdir=1�̂Ƃ��͐V���Ƀf�B���N�g�����쐬�A2�̂Ƃ��͍ē��́A0�͏����l
					while (newdir < 1 || 2 < newdir) {
						br = new BufferedReader(new InputStreamReader(System.in));
						try {
							String buf = br.readLine();
							newdir = Integer.parseInt(buf);
							if (newdir < 1 || 2 < newdir) {
								System.out.println("1or2�œ����Ă�������");
							}
						} catch (Exception e) {
							// e.printStackTrace();
							newdir = 0;
							System.out.println("1or2�œ����Ă�������");
						}
					}
					if (newdir == 2) {
						System.out.print("������x");
						dir_roop = 2;	//�f�B���N�g�������ē���
						newdir = 0;		//newdir�������l�ɂ��čē��͂�����
					} else if (dir.mkdir()) {
						System.out.println("�V���Ƀf�B���N�g�����쐬���܂���");
						dir_roop = 1;	//�f�B���N�g��������
					} else {
						System.out.println("�f�B���N�g�����쐬�ł��܂���ł���");
						System.out.print("������x");
						dir_roop = 2;	//�f�B���N�g�������ē���
					}
				}else dir_roop = 1;
			}

			// �t�@�C�����̎w��
			int file_roop = 0;		//file_roop=0�A2�̂Ƃ����[�v�Afile_roop=1�̂Ƃ����[�v�I��
			while (file_roop != 1) {
				System.out.println("�t�@�C��������͂��Ă�������");
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				try {
					file_name = br.readLine();
				} catch (Exception e) {
					// e.printStackTrace();
				}
				// �t�@�C�������݂��Ă��邩�m�F����
				File file = new File(dir_path + "\\" + file_name);
				if (!file.exists()) {
					System.out.println("���݂��Ȃ��t�@�C���ł����V���Ƀt�@�C�����쐬���܂����H");
					System.out.println("�V���Ƀt�@�C�����쐬�F1�@�@�t�@�C��������͂��Ȃ����F2");
					// �f�B���N�g�����쐬���邩�ۂ�
					while (newfile < 1 || 2 < newfile) {	//newfile=1�̂Ƃ��͐V���Ƀt�@�C�����쐬�A2�̂Ƃ��͍ē��́A0�͏����l
						br = new BufferedReader(new InputStreamReader(System.in));
						try {
							String buf = br.readLine();
							newfile = Integer.parseInt(buf);
							if (newfile < 1 || 2 < newfile) {
								System.out.println("1or2�œ����Ă�������");
							}
						} catch (Exception e) {
							// e.printStackTrace();
							newfile = 0;
							System.out.println("1or2�œ����Ă�������");
						}
					}

					if (newfile == 2) {
						System.out.print("������x");
						file_roop = 2;	//�t�@�C�����ē���
						newfile = 0;	//newfile�������l�ɂ��čē��͂�����
					} else
						file_roop = 1;	//�t�@�C��������
				} else 
					file_roop = 1;
					newfile = 0;
					
			}

			if (newfile != 1) {		//�V�����t�@�C�����쐬���ꂽ�ꍇ�͏㏑���ŏ�������
				//�������݂��ǂݍ��݂��w��
				System.out.println("�������݁F1�@�@�ǂݍ��݁F2");
				kakiyomi = 0;
				while (kakiyomi < 1 || 2 < kakiyomi) {
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					try {
						String buf = br.readLine();
						kakiyomi = Integer.parseInt(buf);
						if (kakiyomi < 1 || 2 < kakiyomi) {
							System.out.println("1or2�œ����Ă�������");
						}
					} catch (Exception e) {
						// e.printStackTrace();
						kakiyomi = 0;
						System.out.println("1or2�œ����Ă�������");
					}
				}

				// �������݂̏ꍇ�A�㏑�����ǋL�����w��
				if (kakiyomi == 1) {
					System.out.println("�㏑�����ǋL�����w��ł��܂�");
					System.out.println("�㏑���F1�@�@�ǋL�F2");
					int uwatui = 0;
					while (uwatui < 1 || 2 < uwatui) {
						BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
						try {
							String buf = br.readLine();
							uwatui = Integer.parseInt(buf);
							if (uwatui < 1 || 2 < uwatui) {
								System.out.println("1or2�œ����Ă�������");
							}
						} catch (Exception e) {
							// e.printStackTrace();
							uwatui = 0;
							System.out.println("1or2�œ����Ă�������");
						}
					}
					if (uwatui == 1)
						bool = false;	//�㏑�����[�h
				}
			}

			
			//�t�@�C���̏������ݓǂݍ���
			if (kakiyomi == 1) {
				// �t�@�C���ւ̏�������
				try {
					// �������ݐ���쐬����
					FileWriter fw = new FileWriter(dir_path + "\\" + file_name, bool);
					PrintWriter pw = new PrintWriter(new BufferedWriter(fw));

					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					System.out.println("�������ݓ��e");
					try {
						str = br.readLine();
					} catch (Exception e) {
						// e.printStackTrace();
					}
					//�������ޓ��e���w��
					pw.println(str);
					// �t�@�C���ɏ����o��
					pw.close();

					System.out.println("�������݂��������܂����B");

				} catch (IOException ex) {
					//ex.printStackTrace();
				}
			} else { // kakiyomi==2�̂Ƃ�
				// �t�@�C���̓ǂݍ���
				try {
					FileReader fr = new FileReader(dir_path + "\\" + file_name);
					BufferedReader br = new BufferedReader(fr);

					int ch;
					while ((ch = br.read()) != -1) {
						System.out.print((char) ch);
					}

					//fr.close();
					br.close();

				} catch (FileNotFoundException e) {
					System.out.println(e);
				} catch (IOException e) {
					System.out.println(e);
				}
				System.out.println("�ǂݍ��݂��������܂����B");
			}
			System.out.println("�����č�Ƃ��܂����H");
			System.out.println("�I���F1�@�@�p���F2");
			roop = 0;
			while (roop < 1 || 2 < roop) {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				try {
					String buf = br.readLine();
					roop = Integer.parseInt(buf);
					if (roop < 1 || 2 < roop) {
						System.out.println("1or2�œ����Ă�������");
					}
				} catch (Exception e) {
					// e.printStackTrace();
					roop = 0;
					System.out.println("1or2�œ����Ă�������");
				}
			}
		}
	}
}
