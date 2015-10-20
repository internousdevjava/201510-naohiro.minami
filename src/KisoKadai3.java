import java.io.*;

public class KisoKadai3 {
	public static void main(String[] args) {

		String str = null; 			//書き込み内容
		String dir_path = null;		//ディレクトリのパス
		String file_name = null;	//ファイル名
		boolean bool = true;		//書き込みを行う際に、上書きか追記を選択するための変数(trueで追記)
		int newfile = 0;			//新たにファイルを作成したかどうかを判定（新たに作成した際は1にする）
		int kakiyomi = 1;			//書き込みか読み込みかを選択（1のとき書き込み）

		// ファイルの読み込みor書き込み
		System.out.println("テキストファイルの読み込みと書き込みができます");

		// 繰り返し
		int roop = 0;	//roop=0、2のときループ、roop=1のとき終了
		while (roop != 1) {

			// ディレクトリの指定
			int dir_roop = 0;	//dir_roop=0、2のときループ、dir_roop=1のときループ終了
			while (dir_roop != 1) {
				System.out.println("ディレクトリを指定してください");
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				try {
					dir_path = br.readLine();
				} catch (Exception e) {
					// e.printStackTrace();
				}
				
				// ディレクトリが存在しているか確認する
				File dir = new File(dir_path);
				if (!dir.exists()) {
					System.out.println("存在しないディレクトリですが新たにディレクトリを作成しますか？");
					System.out.println("新たにディレクトリを作成：1　　ディレクトリのパスを入力しなおす：2");
					// ディレクトリを作成するか否か
					int newdir = 0;		//newdir=1のときは新たにディレクトリを作成、2のときは再入力、0は初期値
					while (newdir < 1 || 2 < newdir) {
						br = new BufferedReader(new InputStreamReader(System.in));
						try {
							String buf = br.readLine();
							newdir = Integer.parseInt(buf);
							if (newdir < 1 || 2 < newdir) {
								System.out.println("1or2で答えてください");
							}
						} catch (Exception e) {
							// e.printStackTrace();
							newdir = 0;
							System.out.println("1or2で答えてください");
						}
					}
					if (newdir == 2) {
						System.out.print("もう一度");
						dir_roop = 2;	//ディレクトリ名を再入力
						newdir = 0;		//newdirを初期値にして再入力させる
					} else if (dir.mkdir()) {
						System.out.println("新たにディレクトリを作成しました");
						dir_roop = 1;	//ディレクトリ名決定
					} else {
						System.out.println("ディレクトリが作成できませんでした");
						System.out.print("もう一度");
						dir_roop = 2;	//ディレクトリ名を再入力
					}
				}else dir_roop = 1;
			}

			// ファイル名の指定
			int file_roop = 0;		//file_roop=0、2のときループ、file_roop=1のときループ終了
			while (file_roop != 1) {
				System.out.println("ファイル名を入力してください");
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				try {
					file_name = br.readLine();
				} catch (Exception e) {
					// e.printStackTrace();
				}
				// ファイルが存在しているか確認する
				File file = new File(dir_path + "\\" + file_name);
				if (!file.exists()) {
					System.out.println("存在しないファイルですが新たにファイルを作成しますか？");
					System.out.println("新たにファイルを作成：1　　ファイル名を入力しなおす：2");
					// ディレクトリを作成するか否か
					while (newfile < 1 || 2 < newfile) {	//newfile=1のときは新たにファイルを作成、2のときは再入力、0は初期値
						br = new BufferedReader(new InputStreamReader(System.in));
						try {
							String buf = br.readLine();
							newfile = Integer.parseInt(buf);
							if (newfile < 1 || 2 < newfile) {
								System.out.println("1or2で答えてください");
							}
						} catch (Exception e) {
							// e.printStackTrace();
							newfile = 0;
							System.out.println("1or2で答えてください");
						}
					}

					if (newfile == 2) {
						System.out.print("もう一度");
						file_roop = 2;	//ファイル名再入力
						newfile = 0;	//newfileを初期値にして再入力させる
					} else
						file_roop = 1;	//ファイル名決定
				} else 
					file_roop = 1;
					newfile = 0;
					
			}

			if (newfile != 1) {		//新しくファイルが作成された場合は上書きで書き込む
				//書き込みか読み込みか指定
				System.out.println("書き込み：1　　読み込み：2");
				kakiyomi = 0;
				while (kakiyomi < 1 || 2 < kakiyomi) {
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					try {
						String buf = br.readLine();
						kakiyomi = Integer.parseInt(buf);
						if (kakiyomi < 1 || 2 < kakiyomi) {
							System.out.println("1or2で答えてください");
						}
					} catch (Exception e) {
						// e.printStackTrace();
						kakiyomi = 0;
						System.out.println("1or2で答えてください");
					}
				}

				// 書き込みの場合、上書きか追記かを指定
				if (kakiyomi == 1) {
					System.out.println("上書きか追記かを指定できます");
					System.out.println("上書き：1　　追記：2");
					int uwatui = 0;
					while (uwatui < 1 || 2 < uwatui) {
						BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
						try {
							String buf = br.readLine();
							uwatui = Integer.parseInt(buf);
							if (uwatui < 1 || 2 < uwatui) {
								System.out.println("1or2で答えてください");
							}
						} catch (Exception e) {
							// e.printStackTrace();
							uwatui = 0;
							System.out.println("1or2で答えてください");
						}
					}
					if (uwatui == 1)
						bool = false;	//上書きモード
				}
			}

			
			//ファイルの書き込み読み込み
			if (kakiyomi == 1) {
				// ファイルへの書き込み
				try {
					// 書き込み先を作成する
					FileWriter fw = new FileWriter(dir_path + "\\" + file_name, bool);
					PrintWriter pw = new PrintWriter(new BufferedWriter(fw));

					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					System.out.println("書き込み内容");
					try {
						str = br.readLine();
					} catch (Exception e) {
						// e.printStackTrace();
					}
					//書き込む内容を指定
					pw.println(str);
					// ファイルに書き出す
					pw.close();

					System.out.println("書き込みが完了しました。");

				} catch (IOException ex) {
					//ex.printStackTrace();
				}
			} else { // kakiyomi==2のとき
				// ファイルの読み込み
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
				System.out.println("読み込みが完了しました。");
			}
			System.out.println("続けて作業しますか？");
			System.out.println("終了：1　　継続：2");
			roop = 0;
			while (roop < 1 || 2 < roop) {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				try {
					String buf = br.readLine();
					roop = Integer.parseInt(buf);
					if (roop < 1 || 2 < roop) {
						System.out.println("1or2で答えてください");
					}
				} catch (Exception e) {
					// e.printStackTrace();
					roop = 0;
					System.out.println("1or2で答えてください");
				}
			}
		}
	}
}