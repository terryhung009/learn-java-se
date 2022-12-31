7.編寫一個名為"rightShift()"的函數，該函數的兩個參數分別為一個整數n，
以及一個array of integers，而return type為int[]，
return的值為把整個array當中的元素向右邊移動n格後的結果。

public static void main(String[] args) {
int[] newArr = rightShift(new int[] {4, 21, 4, 3, 6, 7, 12, 43, 11, 233}, 1);
for (int i : newArr) {
System.out.print(i + " ");
}
System.out.println();
System.out.println("==========================");
int[] newArr2 = rightShift(new int[] {4, 21, 4, 3, 6, 7, 12, 43, 11, 233}, 4);
for (int i : newArr2) {
System.out.print(i + " ");
}
}

233 4 21 4 3 6 7 12 43 11
==========================
12 43 11 233 4 21 4 3 6 7