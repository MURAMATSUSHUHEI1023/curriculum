package study;

public class User {
	 // フィールド変数
    private String userName;
    private int id;
    private String password;

    // コンストラクタ
    public User(String userName, int id, String password) {
        this.userName = "hoge";
        this.id = 123;
        this.password = "abc123";
    }

    // ① 以下のルールに従いアカウント情報（名前、ID、パスワード）を出力するメソッドを作成してください。
    // アクセス修飾子:「protected」
    // メソッド名:「printAccountInfo」
    protected void printAccountInfo() {
		System.out.println("ユーザー名は、"+userName);
		System.out.println("IDは、"+id);
		System.out.println("パスワードは、"+password);
	}
}
