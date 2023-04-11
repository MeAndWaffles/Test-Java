# Test-Java


## Опис проекту
Проект Test-Java - це тестовий проект, який використовується для тестування UI на основі Java. Даний проект використовує наступний стек технологій для тестування:

- Java
- Selenium WebDriver
- TestNG

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

- 1. Перейдіть на веб-сайт Oracle JDK: https://www.oracle.com/java/technologies/javase-downloads.html
- 2. Виберіть відповідну версію JDK залежно від вашої операційної системи та архітектури.
- 3. Перейдіть до розділу "Java SE Development Kit", знайдіть вашу версію та натисніть посилання "Download".
- 4. Прийміть умови ліцензії та завантажте відповідний інсталятор.
- 5. Встановіть JDK, виконуючи інструкції встановлювача.

Щоб завантажити та встановити Maven, необхідно виконати наступні кроки:

- 1. Перейдіть на веб-сайт Apache Maven: https://maven.apache.org/download.cgi
- 2. Завантажте останню версію Maven залежно від вашої операційної системи та архітектури.
- 3. Розпакуйте завантажений архів у папку, куди ви хочете встановити Maven.
- 4. Встановіть змінні середовища, які необхідні для запуску Maven. Наприклад, для Windows необхідно додати шлях до папки, де ви встановили Maven, до змінної середовища PATH.
- 5. Перевірте встановлення Maven, виконавши команду 

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

Test-Java розроблений MeAndWaffles.
