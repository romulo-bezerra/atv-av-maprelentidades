sudo docker build -t maprelentidades-cenario2/banco ./postgres
sudo docker build -t maprelentidades-cenario2/app .

sudo docker run -d --name banco maprelentidades-cenario2/banco
sudo docker run -p 8081:8080 -d --name app --link banco:host-postgres maprelentidades-cenario2/app

