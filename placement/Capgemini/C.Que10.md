# 💼 Capgemini Interview Question 10: Matrix Addition

## 📝 Description
Add two 2D matrices of the same dimensions and print the result.

## 📌 Pseudocode
```
BEGIN
  READ matrixA[N][M], matrixB[N][M]
  FOR i = 0 TO N-1
    FOR j = 0 TO M-1
      result[i][j] = matrixA[i][j] + matrixB[i][j]
    END FOR
  END FOR
  PRINT result
END
```

## ☕ Java Solution
```java
public class MatrixAddition {
    public static void main(String[] args) {
        int[][] a = {{1,2},{3,4}};
        int[][] b = {{5,6},{7,8}};
        int[][] r = new int[2][2];
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                r[i][j] = a[i][j] + b[i][j];
        for (int[] row : r) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }
    }
}
```

## 🔗 Source / Reference
[GeeksForGeeks – Matrix Addition](https://www.geeksforgeeks.org/java-program-for-matrix-addition/)
