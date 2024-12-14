/* ІО-25 Савельєв Артем
 * Залікова книжка: 2526
 * C11 = 7 => Визначити клас меблі, який складається як мінімум з 5-и полів.
 */

import java.util.*;


public class Main {
	
    public static void main(String[] args) {
		List<Furniture> list = Arrays.asList(
			new Furniture("Диван", 1600, 1000, 400, "паралону"),
			new Furniture("Шафа", 1200, 1300, 2000, "дерева"),
			new Furniture("Стул", 700, 700, 400, "пластмаси"),
			new Furniture("Стіл", 1200, 1600, 700, "дерева"),
			new Furniture("Шафа 2", 1600, 1400, 2000, "металу"),
			new Furniture("Полиця", 200, 1200, 20, "металу"),
			new Furniture("Ліжко", 1200, 2000, 20, "металу")
		);
		
		System.out.println("Список перед сортуванням:");
		for (Furniture o : list) {
			System.out.println(o);
		}
		
		System.out.println("\nСортування за: шириною - ↑, довжиною ↓");
		list.sort((o1, o2) -> {
            int result = Integer.compare(o1.width, o2.width);
            if (result == 0) {
                result = Integer.compare(o2.length, o1.length);
            }
            return result;
        });
		
		System.out.println("\nСписок після сортування:");
		for (Furniture o : list) {
			System.out.println(o);
		}
	}
}