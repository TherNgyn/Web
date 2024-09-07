package Bai1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		HinhChuNhat hcn1 = new HinhChuNhat(1, 2);
		HinhChuNhat hcn2 = new HinhChuNhat(2, 3);
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		HinhChuNhat hcn3 = new HinhChuNhat(x, y);
		List<HinhChuNhat> taphop = new ArrayList<HinhChuNhat>(); 
		for(HinhChuNhat i: taphop) {
			taphop.add(i);
		}
		HinhChuNhat h1 = taphop.get(0);
		System.out.println(h1.getY());
}
interface HuuTrung{
	int tinhS(int x, int y);
}
