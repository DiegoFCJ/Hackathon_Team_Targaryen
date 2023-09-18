# Usa un'immagine di base di Java 17 da AdoptOpenJDK su Alpine Linux
FROM khipu/openjdk17-alpine

# Imposta la directory di lavoro
WORKDIR /app

# Copia il tuo JAR del backend dalla directory locale al container
COPY build/libs/hackatarg-0.0.1-snapshot.jar .

# Esponi la porta in cui il tuo backend Spring Boot sta ascoltando
EXPOSE 8080

# Comando per avviare il tuo backend
CMD ["java", "-jar", "hackatarg-0.0.1-snapshot.jar"]
