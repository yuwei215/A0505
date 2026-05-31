import java.util.Scanner;

public class A0505 {

    // 計算 Hamming Distance 的方法
    public static int calculateDistance(String s1, String s2) {

        // 檢查長度是否相同
        if (s1.length() != s2.length()) {
            System.out.println("錯誤：兩個字串長度必須相同！");
            return -1;
        }

        int distance = 0;

        System.out.println("\n逐一比較過程：");

        // 一個一個字元比較
        for (int i = 0; i < s1.length(); i++) {

            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            System.out.print("位置 " + i + " : " + c1 + " vs " + c2);

            // 如果不同就加 1
            if (c1 != c2) {
                distance++;
                System.out.println("  → 不同");
            } else {
                System.out.println("  → 相同");
            }
        }

        return distance;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Hamming Distance 計算程式 ===");

        // 使用者輸入第一個字串
        System.out.print("請輸入第一個字串：");
        String str1 = sc.nextLine();

        // 使用者輸入第二個字串
        System.out.print("請輸入第二個字串：");
        String str2 = sc.nextLine();

        // 呼叫方法計算
        int result = calculateDistance(str1, str2);

        // 印出結果
        if (result != -1) {
            System.out.println("\nHamming Distance = " + result);
        }

        // 印出時間複雜度
        System.out.println("\n時間複雜度 Time Complexity：O(n)");
        System.out.println("因為程式需要逐一比較每個字元一次");

        sc.close();
    }
}