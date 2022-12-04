中階1.
編寫一個名為"mySort()”的函數，唯一的參數為一個array of integers，return type為int[]，返回的array與參數array的元素相同，但由小到大排序。

public static void main(String[] args) {
int[] array = {5, 2, 34, 4, 6, 677, 12, 45, 15, 21, 1234, 612, 778, 303, 132, 245, 677};
mySort(array);
for (int i : array) {
System.out.print(i + " ");
}
}

2 4 5 6 12 15 21 34 45 132 245 303 612 677 677 778 1234