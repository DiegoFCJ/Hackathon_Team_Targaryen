# Usa un'immagine Node.js basata sulla tua versione specifica
FROM node as build

# Imposta la directory di lavoro all'interno del container Docker
WORKDIR /usr/src/app

# Copia il file package.json e package-lock.json
COPY package*.json ./

# Installa le dipendenze
RUN npm install

# Installa Angular CLI globalmente
RUN npm install -g @angular/cli

# Copia i file del progetto nell'immagine Docker
COPY . .

# Compila l'app Angular in modalità produzione
RUN ng build

# Utilizza un'immagine NGINX come base per il server web
FROM nginxinc/nginx-unprivileged 

# Copia i file compilati dall'immagine di build nell'immagine NGINX
COPY --from=build /usr/src/app/dist /usr/share/nginx/html

# Esponi la porta 80
EXPOSE 80

# Avvia NGINX
CMD ["nginx", "-g", "daemon off;"]
