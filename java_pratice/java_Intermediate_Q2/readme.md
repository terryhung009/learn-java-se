中階2.
編寫一個名為"shuffle()”的函數，唯一的參數為一個array of integers，return type為int[]，返回的array與參數array的元素相同，但元素順序為隨機排序的結果。

public static void main(String[] args) {
int[] array = {5, 2, 34, 4, 6, 677, 12, 45, 15, 21, 1234, 612, 778, 303, 132, 245, 677};
shuffle(array);
for (int i : array) {
System.out.print(i + " ");
}
System.out.println();
System.out.println("========================");
shuffle(array);
for (int i : array) {
System.out.print(i + " ");
}
System.out.println();
System.out.println("========================");
shuffle(array);
for (int i : array) {
System.out.print(i + " ");
}
}


15 2 677 612 245 778 6 34 12 1234 677 45 4 132 303 21 5
========================
303 677 677 612 4 6 12 15 5 21 245 132 2 1234 34 778 45
========================
4 677 778 45 5 132 677 21 1234 612 303 12 2 6 15 245 34



