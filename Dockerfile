FROM adoptopenjdk/openjdk11:alpine-slim
LABEL authors="PeryCreep"

# Копируем JAR-файл приложения в контейнер
COPY build/libs/stocktaking.jar /stocktaking/stocktaking.jar

# Устанавливаем рабочую директорию
WORKDIR /app

# Команда для запуска Spring Boot приложения
CMD ["java", "-jar", "stocktaking.jar"]