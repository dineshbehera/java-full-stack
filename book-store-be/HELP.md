# Getting Started

## Run locally
for running locally use the profile `local` as below : <br>
`mvn spring-boot:run -Dspring-boot.run.profiles=local`

## Docker Commands :

For Linux
`export DB_HOST=localhost` <br>
`export DB_PORT=3306` <br>
`export DB_NAME=testdb` <br>
`export MYSQL_USER=root` <br>
`export MYSQL_PASSWORD=root` <br>
`mvn clean install -Dmaven.test.skip=true` <br>
`java -jar target/book-store-be.jar` <br>
`docker build -t dineshbehera/book-store-be:1.0 .` <br>
`docker push dineshbehera/book-store-be:1.0`

`docker login` --> login to docker hub

docker pull <<image path>>
<br>
  `docker pull dineshbehera/book-store-be`
    <br>
  `docker run -d -p 8090:8080 --name book-store-be dineshbehera/book-store-be:1.0`
<br>
Open 
[http:localhost:8090](http:localhost:8090)


### K8 Secrets

`kubectl apply -f k8-bs-secrets.yaml`  <br>

`kubectl get secrets -n dev`  <br>
`kubectl describe secrets -n dev`  <br>
`kubectl delete secret <secret_name> -n dev`  <br>

`kubectl delete -f k8-bs-secrets.yaml`  <br>


### K8 ConfigMap

`kubectl apply -f k8-bs-configmap.yaml`  <br>

`kubectl get configmap -n dev`  <br>
`kubectl describe configmap -n dev`  <br>
`kubectl delete configmap <config_name> -n dev`  <br>

`kubectl delete -f k8-bs-configmap.yaml`  <br>

## k8 Database deployment

`kubectl apply -f k8-db-deployment.yaml`  <br>
`kubectl get deployments -n dev`  <br>
`kubectl get pods -n dev`  <br>
`kubectl logs <<pod name>> -n dev`  <br>


login to mysql pod
<br>
`kubectl get pods -n dev` <br>
`kubectl -n dev exec -it <<pod name>> /bin/bash` <br>
`mysql -h mysql -u root -p` <br>
`show databases`  <br>
`use testdb`

## k8 app deployment

`kubectl apply -f k8-bsbe-deployment.yaml`  <br>
`kubectl get deployments -n dev`  <br>
`kubectl get pods -n dev`  <br>
`kubectl logs <<pod name>> -n dev`  <br>
`kubectl describe pod <<pod name>> -n dev` 

## test the application

`kubectl -n dev get pods`

`kubectl -n dev get svc`

`minikube  ip`


## Kubernetes (extra)

start minikube<br>
`minikube start` <br>
`eval $(minikube docker-env)`

`kubectl create namespace dev`

`kubectl apply -f k8-bs-secrets.yaml`

`kubectl apply -f k8-bs-configmap.yaml`

`kubectl apply -f k8-db-deployment.yaml`

`kubectl -n dev get deployment`

`kubectl -n dev get pods`

<br>connect to database : <br>

`kubectl -n dev exec -it <db pod name> /bin/bash`<br>
`kubectl -n dev exec -it mysql-dep-98f595b5f-ppjlk /bin/bash`

`mysql -p` <br> or <br> `mysql -h mysql-svc -u root -p`

#enter the password defined in the secret configuration<br>
mysql> show databases;


