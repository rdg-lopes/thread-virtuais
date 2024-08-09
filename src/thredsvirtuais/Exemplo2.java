package thredsvirtuais;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exemplo2 {

	public static void main(String[] args) {
		Runnable r = () -> {
			for (int i = 0; i < 1000; i++) {
				System.out.println("Thread 1: " + i);
			}
		};
		try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
			executor.execute(r);
		}
	}
}
