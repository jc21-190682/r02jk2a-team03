
public class Kadai02 {

	/**
	 * 課題02
	 * 文字列の中に、指定されたアルファベットが何文字入っているかを返すメソッド
	 * @param s 文字列
	 * @param c 文字
	 * @return sの中に入っていたcの文字数
	 */
	int countString(String s,char c){
		   if(s == null) return -1;
		   
		   int cnt=0;
		   
		   for(int i=0;i<s.length();i++){
		     char stmp = s.charAt(i); //文字列sから1文字取り出しsmtpに代入
		    // System.out.println(stmp);
		     if(stmp >= 'a' && stmp<='z'){  //sが英小文字か？
		        if(stmp == toLower(c)){
		          cnt++;
		          // System.out.println("cnt："+cnt);
		        } 
		     }else if(stmp >= 'A' && stmp <= 'Z'){ //sが英大文字か？
		        if(stmp == toUpper(c)) {
		          cnt++;
		          // System.out.println("cnt："+cnt);
		        }
		     }
		   }
		   
		   return cnt;
	}//countString終了
	
	char toUpper(char c){  //小文字を大文字に変換する
	    if(c >= 'a' && c <= 'z'){ //cが英小文字か？
	      c-=32; //英大文字に変換
	    }
	    return c;
	}
	
	char toLower(char c){  //大文字を小文字に変換する
	    if(c >= 'A' && c <= 'Z'){ //cが英大文字か？
	      c+=32;
	    }
	    
	    return c;
	}
}
