package ag.example.zadanieRekrutacyjne.service;

import org.springframework.stereotype.Service;

@Service
public class PalindromeService {
    public boolean check(String word) {
        if (word.length() <= 1) {
            return true;
        }

        if (word.charAt(0) != word.charAt(word.length() - 1)) {
            return false;
        }

        return check(word.substring(1, word.length() - 1));
    }
}
