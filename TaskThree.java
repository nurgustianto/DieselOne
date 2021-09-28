
public class TaskThree {
	static void generateString(int A, int B) {
		String rt = "";
		while (0 < A || 0 < B) {

			if (A < B) {
				if (0 < B--) {
					rt += ('b');
				}
				if (0 < B--) {
					rt += ('b');
				}
				if (0 < A--) {
					rt += ('a');
				}
			}

			else if (B < A) {
				if (0 < A--) {
					rt += ('a');
				}
				if (0 < A--) {
					rt += ('a');
				}
				if (0 < B--) {
					rt += ('b');
				}
			}
			else {
				if (0 < A--) {
					rt += ('a');
				}
				if (0 < B--) {
					rt += ('b');
				}
			}
		}
		System.out.println(rt);
	}
	public static void main(String[] args) {
		int A = 17, B = 8;
		generateString(A, B);
	}
}