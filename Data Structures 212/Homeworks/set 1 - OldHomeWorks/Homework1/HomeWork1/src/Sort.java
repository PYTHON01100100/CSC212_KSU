
	import java.util.Arrays;

	public class Sort {
		public static void selectionSort(double[] A, int n) {
			for (int i = 0; i < n - 1; i++) {
				int min = i;
				for (int j = i + 1; j < n; j++) {
					if (A[j] < A[min])
						min = j;
				}
				double tmp = A[i];
				A[i] = A[min];
				A[min] = tmp;
			}
		}

		public static void bubbleSort(double A[], int n) {
			for (int i = 0; i < n - 1; i++) {
				for (int j = 0; j < n - 1 - i; j++) {
					if (A[j] < A[j + 1]) {
						double tmp = A[j];
						A[j] = A[j + 1];
						A[j + 1] = tmp;
					}
				}
			}
		}

		public static void quickSort(double A[], int n) {
			Arrays.sort(A, 0, n - 1);
		}
	}


