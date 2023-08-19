package in.chin2.test;

import java.lang.reflect.Field;

public class MyApp {
	public static void main(String[] args) throws Exception {
		Class<?> clsName = Class.forName("in.chin2.test.Demo");
		Field age = clsName.getDeclaredField("age");
		age.setAccessible(true);
		Object obj = clsName.newInstance();
		age.set(obj, 30);
		System.out.println(age.get(obj));
	}
}
