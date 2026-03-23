package com.rayra.BankSystem;

import java.time.LocalDate;
import java.util.Scanner;
import com.rayra.BankSystem.model.Account;
import com.rayra.BankSystem.model.User;
import jakarta.persistence.Id;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class BankSystemApplication {
	public static void main(String[] args) {
		SpringApplication.run(BankSystemApplication.class, args);
		Scanner gab = new Scanner(System.in);

		String name;

		System.out.println("Digite seu nome: ");
		name = gab.nextLine();

		User user = new User(
				null,
				name,
				"1239238479",
				"aosk210948",
				LocalDate.of(2009, 12, 22),
				null,
				new ArrayList<>()
		);
		System.out.println(user);

	}
}


