# Fase di build
FROM node as build

WORKDIR /usr/src/app

COPY package*.json ./

RUN npm install
RUN npm install -g @angular/cli
COPY . .
RUN ng build

# Fase di esecuzione con NGINX
FROM nginxinc/nginx-unprivileged

# Copia i file dallo stage di build all'interno dello stage di esecuzione
COPY --from=build /usr/src/app/dist /usr/share/nginx/html

# Copia il tuo file di configurazione personalizzato in /etc/nginx/conf.d/
COPY custom-config.conf /etc/nginx/conf.d/default.conf

EXPOSE 8110

CMD ["nginx", "-g", "daemon off;"]
