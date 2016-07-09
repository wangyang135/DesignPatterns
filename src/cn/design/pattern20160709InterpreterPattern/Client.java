package cn.design.pattern20160709InterpreterPattern;

import java.util.HashMap;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		
		String expStr = getExpStr();
		HashMap<String, Integer> var = getValue(expStr);
		Calculator cal = new Calculator(expStr);
		System.out.println(expStr + "=" + cal.run(var));
	}

	private static HashMap<String, Integer> getValue(String expStr) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for (char ch : expStr.toCharArray()) {
			if(ch != '+' && ch != '-') {
				if(!map.containsKey(String.valueOf(ch))) {
					System.out.println("输入表达式中符号" + ch + "代表的值：");
					Scanner scanner = new Scanner(System.in);
					int num = scanner.nextInt();
					map.put(String.valueOf(ch), num);
				}
			}
		}
		return map;
	}

	private static String getExpStr() {
		
		System.out.println("输入表达式：");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
}
