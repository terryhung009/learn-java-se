# tips
[阿里巴巴開發手冊2022](https://github.com/alibaba/p3c/blob/master/Java%E5%BC%80%E5%8F%91%E6%89%8B%E5%86%8C(%E9%BB%84%E5%B1%B1%E7%89%88).pdf)
[阿里巴巴開發手冊2019](https://morosedog.gitlab.io/java-codingGuidelines-20200427-alibaba-0/)

[阿里巴巴github](https://github.com/alibaba/p3c)

Java帝國的起源
![img_12.png](img_12.png)

1.安裝JDK

刪除JDK
1. 刪除java的安裝目錄
2. 刪除JAVA_HOME
3. 刪除path下關於java的目錄
4. java -version

安裝JDK
1. 搜尋JDK 8
2. 下載電腦的對應版本
3. 安裝JDK
4. 記住安裝的路徑
5. 配置環境變量
   1. 我的電腦-->右鍵-->屬性
   2. 環境變量-->JAVA_HOME
   3. 配置path變量
6. 測試JDK是否安裝成功
   1. 打開cmd
   2. java -version

安裝notepad++

Java HelloWorld
1. 隨便新增一個資料夾
2. 新建一個java文件
   - 文件附檔名為.java
   - Hello.java
   - 【注意點】系統可能沒有顯示副檔名
3. 編寫代碼

```java
public class Hello{
    public static void main(String[] args){
        System.out.println("Hello World");
    }
}
```
   
4. 編譯 javac java文件，會生成一個class文件
5. 運行class文件，java class文件

![img_13.png](img_13.png)

可能遇到的問題
1. 每個單字的大小不能出現問題， **java是大小寫敏感的**
2. 盡量使用英文
3. 文件名與class名必需一樣，並且首字母大寫
4. 符號使用了中文的

Java程序運行機制
- 編譯型
- 解釋型

java是哪一種? 混和型，都有

![img_14.png](img_14.png)


# Java 基礎語法

### 註釋
註釋並不會被執行，是給我們人看的

書寫註釋是一個非常好的習慣
平時寫code一定要注意規範

### 數據類型

### 類型轉換

### 變量、常數

### 運算符

### 包機制，javadoc

# 標示符

關鍵字

![img_21.png](img_21.png)

![img_22.png](img_22.png)

# 數據類型

![img_23.png](img_23.png)

![img_24.png](img_24.png)



## 變量作用域
+ 類變量
+ 實例變量
+ 局部變量

![image.png](25.png)

## 常量

![image](26.png)

## 變量的命名規範

![image](27.png)

## 常量
![img_25.png](img_25.png)

## 運算符

![img_26.png](img_26.png)

![img_27.png](img_27.png)

運算符優先級

## 包機制

![img_28.png](img_28.png)

## java doc

![img_29.png](img_29.png)

如何使用
![img_30.png](img_30.png)

# Java 流程控制

## Scanner對象

![img_31.png](img_31.png)

TODO 自己敲code
![img_32.png](img_32.png)

## 順序結構
![img_33.png](img_33.png)

## 選擇結構
![img_34.png](img_34.png)

![img_35.png](img_35.png)

![img_36.png](img_36.png)

![img_37.png](img_37.png)

![img_38.png](img_38.png)

![img_39.png](img_39.png)

注意break
![img_40.png](img_40.png)

![img_41.png](img_41.png)
反編譯
![img_42.png](img_42.png)

## 循環結構
![img_43.png](img_43.png)

![img_44.png](img_44.png)

![img_45.png](img_45.png)

![img_46.png](img_46.png)

### do...while
![img_47.png](img_47.png)

### For循環

![img_49.png](img_49.png)

![img_48.png](img_48.png)

![img_50.png](img_50.png)

### 增強for循環
![img_51.png](img_51.png)

### break continue
![img_52.png](img_52.png)

break在任何循環語句的主體部分，均可用break控制循環的流程。
break用於強行退出循環，
不執行循環中剩餘的語句，(break語句也在switch語句中使用)

continue 語句用在循環語句體中，用於終止某次循環過程，及跳過循環體中尚未執行的語句，
接著進行下一次是否執行循環的設定


//打印101~150所有質數
LabelDemo
//質數 : 只在大於1的自然數中，除了1與本身以外不再有其他因數的自然數

//打印三角形
//從直的分割三角形
![img_53.png](img_53.png)


//從橫的分割三角形

# Java 方法

# Java 數組

# 面向對象編成 OOP

![img_54.png](img_54.png)

![img_55.png](img_55.png)

![img_56.png](img_56.png)

![img_57.png](img_57.png)

![img_58.png](img_58.png)
























