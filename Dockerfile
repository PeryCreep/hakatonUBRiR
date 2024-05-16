FROM openjdk:17-oracle
LABEL authors="PeryCreep"

# Копируем JAR-файл приложения в контейнер
COPY build/libs/stocktaking.jar /stocktaking/stocktaking.jar

# Устанавливаем рабочую директорию
WORKDIR /stocktaking

EXPOSE 8080

# Команда для запуска Spring Boot приложения
CMD ["java", "-jar", "stocktaking.jar"]