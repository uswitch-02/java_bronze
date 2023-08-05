java概要：javaは、現代のソフトウェア開発で主流となっているプログラミング言語の1つ
他のプログラミング言語と違い、「一度書いたら、どこでも動くという特徴がある」
Java開発環境：ソフトウェアを開発するには、JDK（Java　Development Kit）という開発用キットが必要

演習１
public class Hallo {
    public static void main(String[] args) {
      if (args. length != 0 ){
      System.out.println("hello");
    }
  }
}
1クラスにつき１ファイルを作る

演習２
public class Hallo {
  public static void main(String[] args){
    int num;
    // 変数の宣言
    num = 10;
    // 変数の初期化（※初期化していない変数を使用するとコンパイルエラー）
    System.out.println(num);
  }
}

演習３
String 変数名 = "文字列";
public class Hallo {
  public static void main(String[] args) {
    String str = "Hello!";
    // String型の変数strを宣言し
    System.out.println(str);
    // strに代入しているHelloを表示
  }
}
※文字列と文字の違い、それぞれのデータ型を覚える
文字・・・１文字しか扱えない。データ型はchar
文字列・・・何文字でも扱える。データ型はString

演習４
定数の宣言
定数とは（値を変更できない変数のことです）
変数を宣言するときにfinalで修飾すると、その辺数は「定数」になります
public class Hello {
  public static void main(String[] args) {
    final int num = 10;
    num = 20;
    // 値の変更は出来ない
  }
}

定数は、次のコード例のように初期化をせずに宣言だけを記述することは可能
この場合、一度初期化したらそれ以降は値を変更できません。
final int num;
num = 20;
これは初期化なのでコンパイルえらーにならない
num = 10;
これはコンパイルエラー


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
    // aの値を３で割った余りを表示
  }
}

public class Hello {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int c = 30;
    int d = a + b + c;
    // 結果は６０
    System.out.println(d);
  }
}

// javaの算術演算子の優先順位は数学と同じで、掛け算(*),
// 割り算(/),余剰算(%),の方が足し算(+)引き算(-)よりも優先度が高くなります。

public class Hello {
  public static void main (String[] args) {
    int a = 10;
    int b = 20;
    int c = 30;
    int d = a + b * c;
    System.out.println(d);
  }
}

// 優先順位を変えたいときは、数学と同じように()を使います。

int d =(a + b) * c;
// 結果は９００


文字列連結のための＋演算子
文字列連結とは２つ以上の文字列があった時、それらを＋演算子で足して文字列を１つにつなげることです。

public class Hello {
  public static void main (String[] args) {
    String a = "Hello, ";
    // カンマの後ろはスペース１つを入れる
    String b ="Java";
    String result = a + b + "!";
    // 文字列を連結し、resultに代入
    System.out.println(result);
    // 連結された１つの文字列を表示
  }
}


piblic class Hello {
  public static void main(String[] args) {
    String a = "$";
    // 文字列「＄」をaに代入
    System.out.println(a + 10 + 10);
    // +演算子を使って足している
  }
}

public class Hello {
  public static void main(String[] args) {
    String a ="yen";
    System.out.println(10 + 10 + a);
  }
}

インクリメントとデクリメント
int a = 10;
int b =10;
a =a + 1;
b = b - 1;

インクリメント演算子「++」やデクリメント演算子「--]
int a = 10;
int b = 10;
a++;
// 変数aの値は１１になる
b--;
// 変数ｂの値は９になる
インクリメント演算子とデクリメント演算子は変数の前あるいは
後ろに置きます。
前に置いた場合は「前置」、後ろに置いた場合は「後置」といいます。
前置と後置では、動作が異なる。

public class Hello {
  public static void main(String[] args) {
    int a = 10;
    int b = a++;
    // 後置のインクリメント
    int c = ++a;
    // 前置のインクリメント
    System.out.println(b);
    // 結果は10と
    System.out.println(c);
    // 結果は12
  }
}

インクリメント演算子を前置する。前置した場合変数aの値に１を加えた後、その値が変数bに
代入されます。




public class Hello {
  public static void main(String[] args){
    int a = 10;
    int b = ++a;
    System.out.println(b);
    // 11が表示される

  }
}

動作の動き
①変数の値をコピーする
②変数の値を増やす
③①でコピーしておいた値を戻す。

前置・後置の違いは、変数bに代入されるのが、変更後の値（前置）なのか、変更前の値（後置）なのか
という点が異なります。


変換型とキャスト
public class Hello {
  public static void main (String[] args) {
    int s = 10;
    // ing型で初期化
    long b = 20 ;
    // long型で初期化
    System.out.println(a + b);
    // 異なる型同士の演算はコンパイルエラー
    
  }
}
異なる演算ができない理由は、ビットが合わないから
int型は３２ビット、long型は６４ビットだから、int型のへんすうの値は３２びっとぶんでーたが
足りないことになります。

暗黙のかた変換が行われます。int型とlong型の演算は、long型の方に合わせられる。

大きい方から小さい方へのかた変換はプログラマーがキャストする。⇒明示的な型変換
