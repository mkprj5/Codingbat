/*
Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).

squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
squareUp(2) → [0, 1, 2, 1]
squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
*/
public int[] squareUp(int n) {
  int[] result = new int[n * n];
    int pos = 0;
 
    for (int i = 1; i <= n; i++) {
        for (int k = 1; k <= n - i; k++) result[pos++] = 0;
        for (int j = i; j > 0; j--) result[pos++] = j;
    }
    return result;
}
