# Password Generator Kotlin (PGKT)

A simple command-line password generator implemented in Kotlin.

## Description

The Password Generator Kotlin (PGKT) is a program that generates random passwords of a specified length. It uses a set of allowed characters, including uppercase letters, lowercase letters, digits, and special characters, to create a secure and unique password.

## Features

- Accepts user input for the desired password length.
- Generates a random password using a set of allowed characters.
- Displays the generated password to the user.

## Usage

1. Make sure you have Kotlin installed on your system.

2. Clone the repository or download the source code files.

3. Open a terminal or command prompt and navigate to the project directory.

4. Compile the Kotlin source file:

   ```bash
   kotlinc -include-runtime -d password-generator.jar PasswordGenerator.kt
   ```

5. Run the program:

   ```bash
   kotlin password-generator.jar
   ```

6. Follow the prompt to enter the desired password length.

7. The program will generate a random password and display it to you.

8. Enjoy your generated password and use it as needed!

## Example

```
--- PGKT ---
Welcome to the Password Generator Kotlin (PGKT).
How long should your password be? 12
Your password is R9$1p9n7Wqf%. Enjoy!
------------
```

## Security Considerations

- It is recommended to use passwords generated by this program in combination with other security measures, such as two-factor authentication, to ensure the safety of your accounts and sensitive information.
- Always store your passwords securely and avoid sharing them with others.
- It is generally advised to use passwords that are at least 12 to 16 characters long. Longer passwords provide increased security and are more resistant to brute-force attacks.
- Consider using a combination of uppercase and lowercase letters, digits, and special characters to further enhance the complexity and strength of your passwords.
- Avoid using easily guessable or common passwords, such as personal information, dictionary words, or simple number sequences.
- Regularly update your passwords and avoid reusing them across different accounts to minimize the impact of potential security breaches.

## License

This project is licensed under the [MIT License](LICENSE).