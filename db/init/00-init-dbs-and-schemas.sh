#!/usr/bin/env bash
set -e

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" --dbname "postgres" -tc \
  "SELECT 1 FROM pg_database WHERE datname='hausmeister_fix'" | grep -q 1 || \
  psql --username "$POSTGRES_USER" --dbname "postgres" -c "CREATE DATABASE hausmeister_fix"

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" --dbname "postgres" -tc \
  "SELECT 1 FROM pg_database WHERE datname='keycloak'" | grep -q 1 || \
  psql --username "$POSTGRES_USER" --dbname "postgres" -c "CREATE DATABASE keycloak"

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" --dbname "hausmeister_fix" -c \
  "CREATE SCHEMA IF NOT EXISTS hmfix"

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" --dbname "keycloak" -c \
  "CREATE SCHEMA IF NOT EXISTS keycloak"
