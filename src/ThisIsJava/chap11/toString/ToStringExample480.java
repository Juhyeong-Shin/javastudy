package toString;

import java.util.Objects;

public class ToStringExample480{
	public static void main(String[] args) {
		String str1 = "소드시매스터 홍길동";
		String str2 = null;
		
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str2));
		System.out.println(Objects.toString(str2, "이름이 없습니다."));
	}
}