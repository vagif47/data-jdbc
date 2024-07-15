package ru.aliev.jdbc_example;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class JdbcExampleApplication {
	public static void main(String[] args) {
		SpringApplication.run(JdbcExampleApplication.class, args);





































//		List<String> key = new ArrayList<>(List.of("1", "2", "3", "4"));
//		for (String s : key) {
//			System.out.println(s);
//			key.remove(s);
//		}

	}





//		key.removeIf(s -> {
//			System.out.println(s);
//			return true;
//		});
//	}



//		Iterator<String> iterator = key.iterator();
//		while (iterator.hasNext()) {
//			iterator.next();
//			iterator.remove();
//		}
//
//		System.out.println(key);
//	}




//		System.out.println(key);
//	}






//	}
//		Map map = new HashMap();
//		map.put(key, "Privet!");
//		key.add(randomString());
//		System.out.println(key);
//		System.out.println(map.get(key));
//	}
//
//	public static String randomString(){
//		return "......";
//	}
//
//			String input = "Зздрррраавствввууй,    Ссссбееерррр!";
//			String expected = "Здравствуй, Сбер!";
//
//			String deduplicated = deduplicate(input);
//			System.out.println(deduplicated);
//			System.out.println(expected.equals(deduplicated));
//
//

//	public static String deduplicate(String s) {
//		if (s == null || s.isEmpty()) {
//			return s;
//		}
//		StringBuilder result = new StringBuilder();
//		char previousChar = s.charAt(0);
//		System.out.println("previousChar" + previousChar);
//		result.append(previousChar);
//
//		for (int i = 1; i < s.length(); i++) {
//			char currentChar = s.charAt(i);
//			System.out.println("currentchar" + currentChar);
//			if (Character.toLowerCase(currentChar) != Character.toLowerCase(previousChar)) {
//				result.append(currentChar);
//				previousChar = currentChar;
//			}
//		}
//
//		return result.toString();
//	}

}
