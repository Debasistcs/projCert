FROM devopsedu/webapp
MAINTAINER "Debasis"
ADD projCert/website /var/www/html
RUN rm /var/www/html/index.html
CMD apachectl -D FOREGROUND
