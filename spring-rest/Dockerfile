LABEL authors="diego"

# Usa un'immagine di base di Java 17 da AdoptOpenJDK su Alpine Linux
FROM khipu/openjdk17-alpine

# Copia il tuo JAR del backend dalla directory locale al container
COPY targ-v1.jar .

# Esponi la porta in cui il tuo backend Spring Boot sta ascoltando
EXPOSE 8080

# Comando per avviare il tuo backend
CMD ["java", "-jar", "targ-v1.jar"]