package kadai4;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ１
		int count=0;
		int input=0;
		int sel=0;
		int result =0;
		boolean a = true;

		System.out.println("はじめに数字の個数を入力(１０まで)");
		count= new java.util.Scanner(System.in).nextInt(10);
		int[] num =new int[count];
		System.out.println("次に数字を"+count+"個入力");
		for(int i =0;i<count;i++) {
			System.out.println((i+1)+"個目の数字");
			input= new java.util.Scanner(System.in).nextInt();
			num[i]=input;
		}
		//int[] num= {100,3,10,90,54};
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+":");
		}
		while(a) {
			System.out.println();
		System.out.println("1：昇順　２；合計　３；平均　４；最小　５：最大 6:やめる");
		sel=new java.util.Scanner(System.in).nextInt();
		if(sel==1) {
			array_sort(num);
		}else if(sel==2) {
			result=total(num);
			System.out.println("合計"+result);
		}else if(sel==3) {
			average(num);
		}else if(sel==4) {
			min(num);
		}else if(sel==5) {
			max(num);
		}
		if(sel==6) {
			a=false;
		}}

	}
	public static void array_sort(int[] num) {
		//System.out.println(num[1]);
		int box=0;
		for(int i =0;i<num.length;i++) {
			for(int j =num.length-1;j>i;j--) {
				if(num[j-1]<num[j]) {
					box=num[j-1];
					num[j-1]=num[j];
					num[j]=box;
				}
			}
		}
		for(int i =0;i<num.length;i++) {
			System.out.print(num[i]+",");
		}
	}
	public static int total(int[] num) {
		int total=0;
		for(int i =0;i<num.length;i++) {
			total += num[i];
		}
		//System.out.println(total);
		return total;
	}
	public static void average(int[] num) {
		int average=0;
		average=total(num);
		System.out.println("平均"+ average/num.length);
	}
	public static  void max(int[] num) {
		int max=3;
		for(int i = 0;i<num.length;i++) {
			max=Math.max(max, num[i]);
		}
		System.out.println("最大は"+max);
	}
	public static void min(int[] num) {
		int min =1000;
		for(int i =0;i<num.length;i++) {
			min=Math.min(min,num[i]);
		}
		System.out.println("最小:"+min);
	}
}