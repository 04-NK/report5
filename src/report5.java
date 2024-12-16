public class report5 {
    
    public static void main(String[] args) {
        String str = null;
        
        try {
            // NullPointerExceptionが発生するコード
            System.out.println(str.length());  // ここでNullPointerExceptionが発生します
        } catch (NullPointerException e) {
            // NullPointerExceptionが発生したときの処理
            System.out.println("NullPointerExceptionが発生しました!!オブジェクトがnullのためメソッドが呼び出せない。");
            System.out.println(e.getMessage());  // 詳細メッセージの出力
        }
    }
}
