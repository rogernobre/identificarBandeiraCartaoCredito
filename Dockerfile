# Usar uma imagem base com Java 17
FROM eclipse-temurin:17-jdk-alpine

# Definir o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copiar o arquivo JAR gerado pelo Maven para o contêiner
COPY target/identificador-bandeira-cartao-1.0.0.jar app.jar

# Expor a porta padrão da API (ajuste conforme necessário)
EXPOSE 8080

# Comando para executar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]