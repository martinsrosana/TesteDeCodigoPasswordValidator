package service;

import java.util.Scanner;

import model.PasswordValidator;

public class PasswordValidatorService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Digite a senha a ser validada: ");
            String password = scanner.nextLine();

            PasswordValidator validator = new PasswordValidator();
            boolean isValid = validator.validatePassword(password);

            if (isValid) {
                System.out.println("Senha válida!");
            } else {
                System.out.println("Senha inválida!");
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao validar a senha: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
