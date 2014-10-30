## 演習の環境設定手順

1. 「[java.2014](https://github.com/KimiyukiYamauchi/java.2014)」を「git clone」
<br />$ git clone https://github.com/KimiyukiYamauchi/java.2014 (任意のディレクトリ名)<br /><br />
1. リモートリポジトリ「origin」を「java.2014」に変更
<br />$ git remote rename origin java.2014<br /><br />
1. 各自のGithubに演習をアップするためのリポジトリを作成<br /><br />
1. 上で作成したリモートリポジトリに「origin」と名前をつける
<br />$ git remote add origin  (各自のリモートリポジトリのURL)<br /><br />
1. ローカルリポジトリをリモートにpushする
<br />$ git push -u origin master<br /><br />
1. 「[jUnit-4.10.jar](http://sourceforge.net/projects/junit/files/junit/4.10/)」をダウンロードし、ローカルリポジトリに保存<br /><br />
1. 以降は以下の操作

	* 演習を作成し、講師提出する場合、

		1. 「master」branchに切り替え。
<br />$ git checkout master <br /><br />
		1. 演習の作業を行うbranchを作成し、それにcheckout
<br />$ git checkout -b (演習リポジトリ名) <br /><br />
		1. 演習を作成する
		1. テストコードを実行し、問題がないことを確認する
		1. 成果物をadd, commitで、リポジトリに登録 
<br />$ git add -A
<br />$ git commit -m "コメント"<br /><br />
		1. 演習の成果物を「master」branchにmerge
<br />$ git checkout master 
<br />$ git merge (演習リポジトリ名) <br /><br />
		1. ローカルの「master」をGithubに上げる
<br />$ git push <br /><br />
		1. 講師に演習を作成した旨連絡
			* yamauchi@std.it-college.ac.jp

	* ひな形などの最新を入手する場合、

		1. 「[java.2014](https://github.com/KimiyukiYamauchi/java.2014)」を「git pull」
<br />$ git pull java.2014 master<br /><br />

## 演習問題

1. Ex1

	1. Ex1_0<br />
		「Hello World!」と表示する

	1. Ex1_2<br />
		テキストP20 演習 1-2<br />
各行に１文字ずつ自分の名前を表示するプログラムを作成せよ。

	1. Ex1_3<br />
		テキストP20 演習 1-3<br />
各行に１文字ずつ自分の名前を表示するプログラムを作成せよ。<br />
姓と名の間は１行空けること

1. Ex2

	1. Ex2_0<br />
		テキストP32 List 2-6

	1. Ex2_1<br />
		テキストP33 演習 2-1<br />
List 2-6(Ex2_0)の変数へ値を代入している箇所を小数部分を持つ実数値を代入する<br />
ように変更しなさい<br />

	1. Ex2_2<br />
		テキストP33 演習 2-2<br />
三つのint型変数に値を代入し、合計と平均を求めるプログラムを作成せよ<br />

	1. Ex2_00<br />
		テキストP36 List 2-9

	1. Ex2_3<br />
		テキストP40 演習 2-3<br />
キーボードから読み込んだ整数値をそのまま反復して表示するプログラムを作成せよ<br />

	1. Ex2_4<br />
		テキストP40 演習 2-4<br />
キーボードから読み込んだ整数値に10を加えた値と10を減じた値を出力するプログラムを<br />
作成せよ<br />

	1. Ex2_5<br />
		テキストP41 演習 2-5<br />
二つの実数値を読み込み、その和と平均を求めて表示するプログラムを作成せよ<br />

	1. Ex2_6<br />
		テキストP41 演習 2-6<br />
三角形の底辺と高さを実数値で読み込んで、その面積を表示するプログラムを作成せよ<br />

	1. Ex2_000<br />
		テキストP44 List 2-14

	1. Ex2_7<br />
		テキストP44 演習 2-7<br />
以下に示すプログラムを作成せよ<br />

		- １桁の正の整数値（すなわち1以上9以下の値）をランダムに生成して表示。
		- １桁の負の整数値（すなわち-9以上-1以下の値）をランダムに生成して表示。
		- ２桁の正の整数値（すんわち10以上99以下の値）をランダムに生成して表示。

	1. Ex2_8<br />
		テキストP45 演習 2-8<br />
キーボードから読み込んだ整数値プラスマイナス5の範囲の整数値をランダムに生成<br />
して表示するプログラムを作成せよ。<br />

	1. Ex2_9<br />
		テキストP45 演習 2-9<br />
以下に示すプログラムを作成せよ（実数値の乱数の生成にはnextDouble()を使うこと）

		- 0.0以上1.0未満の実数値をランダムに生成して表示。
		- 0.0以上10.0未満の実数値をランダムに生成して表示。
		- -1.0以上1.0未満の実数値をランダムに生成して表示。

	1. Ex2_10<br />
		テキストP47 演習 2-10<br />
名前の姓と名を個別にキーボードから読み込んで、挨拶を行うプログラムを作成しなさい<br />
<br />
$ java Ex2 (Enter)<br />
姓：山内 (Enter)<br />
名：公之 (Enter)<br />
こんにちは山内公之さん。

1. Ex3

	1. ex3_0<br />
整数値を引数でもらい、その値が０より大きい場合は「その値は正です」を返し、それ以外は「その値は０か負です」を返す関数「String ex3_0(int n)」を作成<br />

	1. ex3_1<br />
整数値を引数でもらい、引数の値の絶対値を返す関数「int ex3_1(int n)」を作成<br />

	1. ex3_2<br />
二つの正の整数値を引数でもらい、第２引数(b)が第１引数(a)の約数であれば『bはaの約数です』と、そうでなければ『bはaの約数ではありません』と返す関数「String ex3_2(int a, intb)」を作成<br />
例<br />
ex3_2(12, 4) => "4は12の約数です"<br />
ex3_2(12, 5) => "5は12の約数ではありません"<br />

	1. ex3_3<br />
二つの正の整数値を引数でもらい、第１引数(a)と第２引数(b)の大小関係を以下のいずれかで返す関数「String ex3_3(int a, intb)」を作成<br />
『aの方が大きいです』『bの方が大きいです』『同じ値です』<br />
例<br />
ex3_3(8, 5) => "8の方が大きいです"<br />
ex3_3(5, 9) => "9の方が大きいです"<br />
ex3_3(3, 3) => "同じ値です"<br />

	1. ex3_4<br />
正の整数値を引数でもらい、それが5で割り切れれば『その値は5で割り切れます』と、そうでなければ『その値は5では割り切れません』と返す。また、正でない整数値の場合『正でない整数値です』と返す関数「String ex3_4(int a)」を作成<br />
例<br />
ex3_4(15) => "その値は5で割り切れます"<br />
ex3_4(11) => "その値は5で割りきれません"<br />
ex3_4(-1) => "正でない整数値です"<br />
