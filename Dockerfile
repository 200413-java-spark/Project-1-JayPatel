FROM postgres
ENV POSTGRES_DB project1
ENV POSTGRES_USER project1
ENV POSTGRES_PASSWORD project1
ADD schema.sql /docker-entrypoint-initdb.d
EXPOSE 5432