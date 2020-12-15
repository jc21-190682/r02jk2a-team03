public class Kadai01 {
	
	/**
	 * 課題01
	 * 文字列の左右の文字を反転して返すメソッド
	 * @param s　対象の文字
	 * @return 左右を反転した結果
	 */
	
	String ReverseString(String s) {
		//TODO プログラムをここに作成する
		if (s==null) return null;
		String str = String.valueOf(s.charAt(s.length()-1));
		
		for(int i=s.length()-2;i>=0;i--) {
			str+=s.charAt(i);
		}
		
		return str;
	}
}
