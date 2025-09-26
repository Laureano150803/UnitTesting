FROM openjdk:17-jdk-slim

WORKDIR /app

# Copiar gradlew y config primero (para aprovechar caché)
COPY . .

# Dar permisos de ejecución al wrapper
RUN chmod +x gradlew

# Descargar dependencias para aprovechar cache en builds posteriores
RUN chmod +x gradlew

# Copiar el resto del código
COPY . .

# Ejecutar tests con logs detallados siempre
CMD ["./gradlew", "test", "--info", "--stacktrace", "--no-daemon"]

