FROM openjdk:17-jdk-slim

WORKDIR /app

# Copiar proyecto completo
COPY . .

# Dar permisos de ejecución al gradlew
RUN chmod +x gradlew

# Ejecutar tests por defecto con logs detallados
CMD ["./gradlew", "clean", "test", "--info", "--no-build-cache"]
