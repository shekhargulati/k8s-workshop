FROM nginx:alpine-perl
RUN apk add --no-cache curl
COPY dist/ /usr/share/nginx/html
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]