# Etapa 1 - Build da aplicação
FROM eclipse-temurin:17-jdk AS build
WORKDIR /app

# Copia arquivos do Maven e baixa dependências (cache)
COPY .mvn .mvn
COPY mvnw pom.xml ./
RUN chmod +x mvnw && ./mvnw dependency:go-offline

# Copia o código fonte e empacota o projeto
COPY src ./src
RUN ./mvnw clean package -DskipTests

# Etapa 2 - Imagem final (runtime)
FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8081
ENTRYPOINT ["java", "-jar", "app.jar"]
