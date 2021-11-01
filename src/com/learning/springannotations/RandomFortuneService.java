package com.learning.springannotations;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Component
public class RandomFortuneService implements FortuneService {
    private List<String> fortunes = new ArrayList<>();

    @Override
    public String getFortune() {
        Random random = new Random();
        return fortunes.get(random.nextInt(fortunes.size()));
    }

    @PostConstruct
    public void onInit() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/fortunes.txt"))) {
            fortunes = bufferedReader.lines().collect(Collectors.toList());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @PreDestroy
    public void onDestroy() {
        System.out.println("Destroying Random Fortune Service");
    }
}
