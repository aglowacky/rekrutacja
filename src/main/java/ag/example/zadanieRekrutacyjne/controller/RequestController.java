package ag.example.zadanieRekrutacyjne.controller;

import ag.example.zadanieRekrutacyjne.service.FibonacciService;
import ag.example.zadanieRekrutacyjne.service.PalindromeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api")
public class RequestController {

    private final FibonacciService fibonacciService;
    private final PalindromeService palindromeService;


    @GetMapping("/palindrome")
    public ResponseEntity<Boolean> palindrome(@RequestParam String word) {
        return ResponseEntity.ok(palindromeService.check(word));
    }

    @GetMapping("/fibonacci")
    public ResponseEntity<Integer> fibonacciSum(@RequestParam Integer n) {
        return ResponseEntity.ok(fibonacciService.fibonacciSum(n));
    }

}

