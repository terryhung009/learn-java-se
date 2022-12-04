編寫一個名為“findDuplicate()”的函數，將一個整數array作為參數，
並檢查array中是否有重複值。如果有，則return true，
否則return false。

public static void main(String[] args) {
findDuplicate(new int[] {1, 3, 5, 7, 9, 3});
findDuplicate(new int[] {}); // returns false
findDuplicate(new int[] {3, 4, 5, 6, 7, 10000, 0});
}

true
false
false