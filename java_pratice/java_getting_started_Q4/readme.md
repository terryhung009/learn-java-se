編寫一個名為"reverseArray()”的函數，參數為一個array of Integers，
return type為int[]，返回的值為將array of Integers全部反轉後的新array。

public static void main(String[] args) {
int[] array = {4, 3, 6, 7, 9, 10, 33, 0, -4, 12, 400, 133, 324, 1234231, 12334};
int[] reversedArray = reverseArray(array);
for (int i : reversedArray) {
System.out.println(i);
}
}

12334
1234231
324
133
400
12
-4
0
33
10
9
7
6
3
4