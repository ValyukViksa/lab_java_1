/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    // вывод на консоль Hello world
		System.out.println("Hello World");
		//Внутри метода main создаем переменную типа int и выводим ее значение
		int a = 11;
		System.out.print(a);
		// Создаем переменную типа String, инициализируем ее и выводим ее значение
		String[] b = new String[2];
		b[0] = "_Валентина";
		b[1] = "Виктория";
		//Чтение вывода scanner.nextLine() присвойте строковой переменной
		System.out.println(b[0] + " и " + b[1]);
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		System.out.println(str);
	}
}

