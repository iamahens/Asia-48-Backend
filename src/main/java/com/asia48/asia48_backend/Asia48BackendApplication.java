package com.asia48.asia48_backend;

import com.asia48.asia48_backend.Model.ERole;
import com.asia48.asia48_backend.Model.Role;
import com.asia48.asia48_backend.Repository.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Asia48BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(Asia48BackendApplication.class, args);
	}

	/**
	 * This bean runs once when the application starts.
	 * It checks if the roles table is empty and, if so,
	 * inserts the basic roles (ROLE_USER, ROLE_ADMIN).
	 */
	@Bean
	CommandLineRunner run(RoleRepository roleRepository) {
		return args -> {
			if (roleRepository.findByName(ERole.ROLE_ADMIN).isEmpty()) {
				roleRepository.save(new Role(ERole.ROLE_ADMIN));
			}
			if (roleRepository.findByName(ERole.ROLE_USER).isEmpty()) {
				roleRepository.save(new Role(ERole.ROLE_USER));
			}
		};
	}
}
