package lotto;

import java.util.HashSet;
import java.util.Set;

public class LottoBySet {
	public static void main(String[] args) {
		Set<Integer> lottoSet = new HashSet<Integer>();
		while (lottoSet.size() < 6) {
			int i = (int)(Math.random() * 45 + 1);
			lottoSet.add(i);
		}
		for (Integer num : lottoSet) {
			System.out.print(num+" ");
		}
		System.out.println();
	}
}