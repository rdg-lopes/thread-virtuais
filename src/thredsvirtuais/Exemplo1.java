package thredsvirtuais;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exemplo1 {
	
	public static void main(String[] args) {
		Runnable r = () -> {
			for (int i = 0; i < 1000; i++) {
                System.out.println("Thread 1: " + i);
            }
        };
        ExecutorService executor = Executors.newFixedThreadPool(1);
        executor.submit(r);
	}
}
