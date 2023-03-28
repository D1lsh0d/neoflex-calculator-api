package ru.neoflex.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.neoflex.practice.controller.CalcController;

import javax.sound.midi.Soundbank;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);

		System.out.println(CalcController.Plus(10, 5));
		System.out.println(CalcController.Minus(10, 5));
	}

}
