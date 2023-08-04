// java概要：javaは、現代のソフトウェア開発で主流となっているプログラミング言語の1つ
// 他のプログラミング言語と違い、「一度書いたら、どこでも動くという特徴がある」
// Java開発環境：ソフトウェアを開発するには、JDK（Java　Development Kit）という開発用キットが必要

// 演習１
// public class Hallo {
//     public static void main(String[] args) {
//       if (args. length != 0 ){
//       System.out.println("hello");
//     }
//   }
// }
// 1クラスにつき１ファイルを作る

// 演習２
// public class Hallo {
//   public static void main(String[] args){
//     int num;
//     // 変数の宣言
//     num = 10;
//     // 変数の初期化（※初期化していない変数を使用するとコンパイルエラー）
//     System.out.println(num);
//   }
// }

// 演習３
// String 変数名 = "文字列";
// public class Hallo {
//   public static void main(String[] args) {
//     String str = "Hello!";
//     // String型の変数strを宣言し
//     System.out.println(str);
//     // strに代入しているHelloを表示
//   }
// }
// ※文字列と文字の違い、それぞれのデータ型を覚える
//文字・・・１文字しか扱えない。データ型はchar
//文字列・・・何文字でも扱える。データ型はString

// 演習４
// 定数の宣言
// 定数とは（値を変更できない変数のことです）
// 変数を宣言するときにfinalで修飾すると、その辺数は「定数」になります
// public class Hello {
//   public static void main(String[] args) {
//     final int num = 10;
//     num = 20;
//     // 値の変更は出来ない
//   }
// }

// 定数は、次のコード例のように初期化をせずに宣言だけを記述することは可能
// この場合、一度初期化したらそれ以降は値を変更できません。
// final int num;
// num = 20;
// これは初期化なのでコンパイルえらーにならない
// num = 10;
// これはコンパイルエラー


// 2-2
// 算術演算子
public class Hello {
  public static void main (String[] args) {
    int a = 10;
    // aを10で初期化
    int b =20;
    // bを20を初期化
    int c = a + b
    // aとbの値を足した結果をcに代入
    System.out.println(c);
    // cの値を表示
  }
}

// 四則演算にはない剰余算を行うための「％」があります。

public class Hello {
  public static void main(String[] args) {
    int a = 10;
    System.out.println(a % 3);
    // aの値を３で割った余りを
  }
}
