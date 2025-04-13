package com.edu.less12.homework01;

/*
 * Напишите программу на языке Java, которая определяет,
 * является ли заданное число простым. Если число простое,
 * программа должна найти и вывести сумму всех простых чисел,
 * меньших заданного числа.
 */
import java.util.Scanner;

public class SimpleCalculator {
	private int number;
	boolean isSimple;

	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
		isSimple = checkSimple(number);
	}

	private void input() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String intro = "Введите целое положительное число:";
		int tmp = -1;
		while (tmp < 0) {
			System.out.println(intro);
			while (!scanner.hasNextInt()) {
				scanner.nextLine();
				System.out.print("Введено не число. ");
				System.out.println(intro);
			}
			tmp = scanner.nextInt();
			scanner.nextLine();
			if (tmp < 0) {
				System.out.print("Введено отрицательное число. ");
			}
		}
		number = tmp;
	}

	public static boolean checkSimple(int num) {
		if (num < 2) {
			return false;
		} else {
			for (int i = 2; i * i <= num; i++) {
				if (num % i == 0) {
					return false;
				}
			}
			return true;
		}
	}

	private int sumSimple() {
		int sum = 0;
		for (int i = 2; i < number; i++) {
			if (checkSimple(i)) {
				sum += i;
			}
		}
		return sum;
	}

	public void printSipmleNumbers() {
		if (number == 2) {
			System.out.println("2 - наименьшее простое число");
		} else {
			System.out.print("Список простых чисел: ");
			System.out.print("(2");
			for (int i = 3; i <= number; i++) {
				if (checkSimple(i)) {
					System.out.print(", " + i);
				}
			}
			System.out.print(")\n");
		}
	}

	public void start() {
		input();
		isSimple = checkSimple(number);
		if (isSimple) {
			System.out.printf("Число %d - простое\n", number);
			int sumSimple = sumSimple();
			System.out.printf("Сумма простых чисел < %d равна %d\n", number, sumSimple);
			printSipmleNumbers();
		} else {
			System.out.printf("Число %d - НЕ простое\n", number);
		}
	}

}
