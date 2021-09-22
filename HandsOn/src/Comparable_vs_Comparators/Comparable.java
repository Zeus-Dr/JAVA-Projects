package Comparable_vs_Comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Laptop> laps = new ArrayList<>();
		laps.add(new Laptop("Dell", 16, 800));
		laps.add(new Laptop("Apple", 8, 1200));
		laps.add(new Laptop("Toshiba", 12, 700));

		Comparator<Laptop> com = new Comparator<Laptop>() {

			@Override
			public int compare(Laptop o1, Laptop o2) {
				// TODO Auto-generated method stub
				if (o1.getPrice() > o2.getPrice()) {
					return 1;
				} else {
					return -1;
				}
			}

		};

		Collections.sort(laps, com);

		for (Laptop laptop : laps) {
			System.out.println(laptop);
		}
	}

}
