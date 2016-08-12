# Start docker met omgeving variable MYSQL_ROOT_PASSWORD en port binding naar de host op 3306
# Plus het creert gelijk een database voor je in een commando
docker run --name mysql -e MYSQL_ROOT_PASSWORD=password  -e MYSQL_DATABASE=test -p 3306:3306 mysql:latest

# Als je toch handmatig in wil loggen
mysql-h 127.0.0.1 -u root -p
