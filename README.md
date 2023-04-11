# Test-Java

Проект Test-Java - це тестовий проект, який використовується для тестування UI на основі Java.

## Опис проекту
Даний проект використовує наступний стек технологій для тестування:

- Java
- Selenium WebDriver
- TestNG

Що можна побачити в файлі pom.xml

Використання даного проекту дозволяє впевнено проводити автоматизоване тестування веб-додатків. Він може бути використаний для тестування різних сторінок веб-сайту та взаємодії з елементами на них.

## Встановлення

Для роботи з проектом потрібно мати встановлені наступні програми:

- Java Development Kit (JDK)
- Maven

Щоб склонувати проект, виконайте команду:

```
git clone 
```

Та вставити в кінці HTTPS чи SSH посилання на проект.

Після цього перейдіть в папку проекту і виконайте команду для встановлення залежностей:

```
mvn install
```

## Детальніше JDK , Maven !

Щоб завантажити та встановити JDK, необхідно виконати наступні кроки:

- 1 Перейдіть на веб-сайт Oracle JDK: https://www.oracle.com/java/technologies/javase-downloads.html
- 2 Виберіть відповідну версію JDK залежно від вашої операційної системи та архітектури.
- 3 Перейдіть до розділу "Java SE Development Kit", знайдіть вашу версію та натисніть посилання "Download".
- 4 Прийміть умови ліцензії та завантажте відповідний інсталятор.
- 5 Встановіть JDK, виконуючи інструкції встановлювача.

Щоб завантажити та встановити Maven, необхідно виконати наступні кроки:

- 1 Перейдіть на веб-сайт Apache Maven: https://maven.apache.org/download.cgi
- 2 Завантажте останню версію Maven залежно від вашої операційної системи та архітектури.
- 3 Розпакуйте завантажений архів у папку, куди ви хочете встановити Maven.
- 4 Встановіть змінні середовища, які необхідні для запуску Maven. Наприклад, для Windows необхідно додати шлях до папки, де ви встановили Maven, до змінної середовища PATH.
- 5 Перевірте встановлення Maven, виконавши команду 

```
mvn -version
```

у командному рядку.
 
Наступні посилання можуть бути корисними для встановлення JDK та Maven:

- DK Installation Guide for Windows: https://docs.oracle.com/en/java/javase/16/install/installation-jdk-microsoft-windows-platforms.html
- JDK Installation Guide for macOS: https://docs.oracle.com/en/java/javase/16/install/installation-jdk-macos.html
- Maven Installation Guide: https://maven.apache.org/install.html

## Використання

Для запуску тестів виконайте команду:

```
mvn test
```

Це запустить всі тести з використанням TestNG.

## Автор

Цей невеликий проект Test-Java був розроблений MeAndWaffles.

_________________________________________________________________________________________________________________________

# Test-Java

Test-Java is a test project that is used for UI testing based on Java.

## Project Description
This project uses the following technology stack for testing:

- Java
- Selenium WebDriver
- TestNG

What can be seen in the pom.xml file.

Using this project allows for confident automated testing of web applications. It can be used to test different web pages of a website and interact with elements on them.

## Installation

To work with the project, the following programs need to be installed:

- Java Development Kit (JDK)
- Maven

To clone the project, run the command:

```
git clone 
```

and paste the HTTPS or SSH link to the project at the end.

After that, navigate to the project folder and run the command to install dependencies:

```
mvn install
```

## More on JDK and Maven !

To download and install JDK, follow these steps:

- 1 Go to the Oracle JDK website: https://www.oracle.com/java/technologies/javase-downloads.html
- 2 Choose the appropriate JDK version based on your operating system and architecture.
- 3 Go to the "Java SE Development Kit" section, find your version, and click the "Download" link.
- 4 Accept the license agreement and download the corresponding installer.
- 5 Install JDK by following the installer instructions.

To download and install Maven, follow these steps:

- 1 Go to the Apache Maven website: https://maven.apache.org/download.cgi
- 2 Download the latest version of Maven based on your operating system and architecture.
- 3 Unzip the downloaded archive to the directory where you want to install Maven.
- 4 Set the environment variables necessary to run Maven. For example, for Windows, you need to add the path to the folder where you installed Maven to the PATH environment variable.
- 5 Verify Maven installation by running the command

```
mvn -version
```

in the command prompt.
 
The following links may be useful for installing JDK and Maven:

- DK Installation Guide for Windows: https://docs.oracle.com/en/java/javase/16/install/installation-jdk-microsoft-windows-platforms.html
- JDK Installation Guide for macOS: https://docs.oracle.com/en/java/javase/16/install/installation-jdk-macos.html
- Maven Installation Guide: https://maven.apache.org/install.html

## Usage

To run the tests, execute the command:

```
mvn test
```

This will run all tests using TestNG.

## Author

This small Test-Java project was developed by MeAndWaffles.
