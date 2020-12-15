
public class Kadai03 {

	/**
	 * 課題03
	 * 文字列の中に含まれるアルファベットを調べて、返すメソッド
	 * @param s 文字列
	 * @return sの中に入っていた文字
	 */
	char[] characterList(String s) { 
		if(s == null){
			return null;
		}
		
		char[] lowerAlpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t',
                'u','v','w','x','y','z'};
		
		char[] upperAlpha ={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T',
                'U','V','W','X','Y','Z'};
  
		boolean[] checkList = new boolean[26];  //対応する文字があったらtrueを入れる
		//checkListの全要素をfalseで初期化
		for(int i=0;i<checkList.length;i++) checkList[i]=false;
	
		int charLength=0; //returnするchar型配列の要素数を格納する変数
		for(int i=0;i<s.length();i++){
			for(int n=0;n<lowerAlpha.length;n++){
				if(checkList[n]==false){
					if(lowerAlpha[n]==s.charAt(i)||upperAlpha[n]==s.charAt(i)){
						checkList[n]=true;
						charLength++;
						break;
					}
				}
			}
		}//for終了
		
		if(charLength == 0){	//アルファベット文字列ではないときに
			return null;
		}
		
		char[] charList = new char[charLength];     //returnするアルファベットを格納する変数
		int cL=0;
		for(int i=0;i<checkList.length;i++){
			if(checkList[i]==true){
				charList[cL]=upperAlpha[i];
				cL++;
			} 
		}
  
		return charList;
	}
}
