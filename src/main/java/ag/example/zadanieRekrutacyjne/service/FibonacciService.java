package ag.example.zadanieRekrutacyjne.service;

import ag.example.zadanieRekrutacyjne.exceptions.InvalidParameterException;
import org.springframework.stereotype.Service;

@Service
public class FibonacciService {
    private static int fibonacci(int n) {
        if(n < 0) {
            throw new InvalidParameterException("n cannot be negative.");
        }
        if (n <= 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public int fibonacciSum(int n) {
        if (n <= 0) {
            throw new InvalidParameterException("n cannot be negative.");
        } else {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += fibonacci(i);
            }
            return sum;
        }
    }

}
