中階3.
編寫一個名為“flatten”的函數來展平一個array。

public static void main(String[] args) {
int[][][] arr = {{ {1, 2} }, { {3, 4}, {5}, {6} }, { {7, 8}, {9, 10}}, {{3, 4}, {4, 1}}, {{}, {43, 13}}};
int[] array = flatten(arr);
for (int n : array) {
System.out.print(n + " ");
}
}


result:
1 2 3 4 5 6 7 8 9 10 3 4 4 1 43 13



