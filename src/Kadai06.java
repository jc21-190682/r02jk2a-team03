
public class Kadai06 {

	/**
	 * 課題06
	 * 引数として渡された配列の中で、降順で2番目の値を返す
	 * @param d 数値が入っている配列
	 * @return 配列の中の降順で2番目の値
	 */
	int get2ndMax(int[] d) {
		if(null == d) return Integer.MIN_VALUE;
		int max=d[0];
		int max2=d[0];

		for(int i=1;i<d.length;i++) {
			if(max <d[i]) {
				max2=max;
				max =d[i];
			}
		}

		return max2;
	}
}
