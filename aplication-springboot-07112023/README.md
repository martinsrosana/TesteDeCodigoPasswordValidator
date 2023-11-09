
# Password Validator

Este é um simples projeto em Java com Spring Boot que implementado para validar se uma senha é considerada válida com base em critérios específicos.

## Executando o Projeto

Para executar o projeto, você pode seguir os seguintes passos:

1. Certifique-se de ter o Java Development Kit (JDK) instalado em seu sistema.
2. Clone o repositório para o seu ambiente local.
3. Abra o projeto em seu ambiente de desenvolvimento Java preferido.
4. Compile e execute a classe AplicationSpringboot07112023Application.

## Detalhes da Solução

Nesta implementação, utilizei expressões regulares para verificar se uma senha atende a determinados critérios de validação. A expressão regular verifica se a senha tem nove ou mais caracteres, possui pelo menos um dígito, uma letra minúscula, uma letra maiúscula e um dos seguintes caracteres especiais: !@#$%^&*()-+.

Para adicionar mais complexidade à validação, o método `isValidPassword` pode ser estendido com mais verificações, se necessário.

Os testes unitários implementados verificam se a função de validação retorna o resultado esperado para senhas válidas e inválidas, fornecendo uma cobertura básica de testes para a lógica implementada nas classes AplicationSpringboot07112023Application e PasswordValidador.

## Decisões de Implementação

O uso de expressões regulares simplifica a verificação dos critérios de validação da senha de forma eficiente. A escolha de expressões regulares para este projeto foi baseada na facilidade de implementação e na clareza do código.

Os testes unitários foram adicionados para garantir que a função de validação está funcionando corretamente e para fornecer uma base de verificação durante o desenvolvimento contínuo.

## Assumções

Para este projeto, assumimos que as definições de senha válida e os critérios de validação fornecidos são suficientes. No entanto, se houver necessidade de adicionar mais regras ou critérios específicos de validação, o método `isValidPassword` pode ser facilmente estendido para atender a essas exigências adicionais.

Se houver alguma premissa ou condição que não tenha sido especificada e que possa afetar a implementação, peço desculpas e por gentileza informe para que possa ajustar a solução de acordo.

## Contribuição

Contribuições são bem-vindas! Se você encontrar alguma melhoria ou problema, sinta-se à vontade para abrir uma issue ou enviar um pull request.

Espero que este projeto seja útil e demonstre de forma clara e concisa como implementar uma função de validação de senha em Java.

The following was discovered as part of building this project:

* The original package name 'br.com.rosanam.aplication-springboot-07112023' is invalid and this project uses 'br.com.rosanam.aplicationspringboot07112023' instead.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.5/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.5/gradle-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.1.5/reference/htmlsingle/index.html#using.devtools)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.1.5/reference/htmlsingle/index.html#web)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

