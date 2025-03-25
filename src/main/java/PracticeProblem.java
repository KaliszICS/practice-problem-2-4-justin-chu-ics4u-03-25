public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void selectionSortName(String[] names, int[] ages) {
		int namel = names.length;

		for (int i = 0; i < namel -1; i++) {

			int minIndex = i;

			for (int j = i + 1; j < namel; j++) {

				if (names[j].compareToIgnoreCase(names[minIndex]) < 0) {
					minIndex = j;
				}
			}
			//swaaaaaaaap
			String temp = names[i];
			names[i] = names[minIndex];
			names[minIndex] = temp;

			//swaaaaaaaaaaaaaaaaap
			int temp2 = ages[i];
			ages[i] = ages[minIndex];
			ages[minIndex] = temp2;
		}
	}

	public static void selectionSortAge(String[] names, int[] ages) {
		int agel = ages.length;

		for (int i = 0; i < agel - 1; i++) {

			int minIndex = i;

			for (int j = i + 1; j < agel; j++) {
				if (ages[j] < ages[minIndex]) {
					minIndex = j;
				}
			}

			//swaaaaaaaap
			int tempAges = ages[minIndex];
			ages[minIndex] = ages[i];
			ages[i] = tempAges;

			//swaaaaaaaaaaaaaaaap
			String tempNames = names[minIndex];
			names[minIndex] = names[i];
			names[i] = tempNames;

		}
	}

}
