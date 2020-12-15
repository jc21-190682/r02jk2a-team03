
public class Kadai04 {

	/**
	 * 課題04
	 * 文字列の中に含まれるアルファベットの中で、一番多く使われている文字を返す
	 * @param s 文字列
	 * @return sの中に入っていた文字
	 */
	char getMaxString(String s) {
		if(s == null) return 0;
		if(s == "") return 0;
		
		char[] lowerAlpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t',
                'u','v','w','x','y','z'};
		
		char[] upperAlpha ={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T',
                'U','V','W','X','Y','Z'};
        final int ALPHANUM = 26;
        
		int[] alphaCnt = new int[ALPHANUM]; //アルファベットの数をそれそれ格納する
		for(int i=0;i<ALPHANUM;i++) alphaCnt[i]=0; //0で初期化

		boolean flag = false;	//アルファベット
		for(int i=0;i<s.length();i++){
			char stmp = s.charAt(i);
			for(int n=0;n<ALPHANUM;n++){
				if(lowerAlpha[n]==stmp || upperAlpha[n]==stmp){  
					alphaCnt[n]++;
					flag = true;
					break;
				}
			}
		}//for終了
		
		//出現頻度が高い文字を選択  
		int max=0;
		for(int i=1;i<ALPHANUM;i++){
			if(alphaCnt[max]<alphaCnt[i]){
				max = i;
			}
		}
		
		if(flag) return 0;
		
	
		return upperAlpha[max];
	}
}
