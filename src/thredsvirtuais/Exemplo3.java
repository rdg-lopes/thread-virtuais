package thredsvirtuais;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exemplo3 {

	public static void main(String[] args) {
		List<Runnable> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			int finalI = i;
			list.add(() -> {
				for (int j = 0; j < 1000; j++) {
					System.out.println("Thread " + finalI + ": " + j);
				}
			});
		}
		try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
            list.forEach(executor::execute);
        }
	}
	
}
