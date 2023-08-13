# BookStoreFe

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 16.0.5.

## Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The application will automatically reload if you change any of the source files.

## Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

## Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via a platform of your choice. To use this command, you need to first add a package that implements end-to-end testing capabilities.

## Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI Overview and Command Reference](https://angular.io/cli) page.

## Docker

`ng build`

`docker build -t dineshbehera/book-store-fe:1.0 .`

`docker run --rm -it -p 8080:80 dineshbehera/book-store-fe:1.0`

`docker push dineshbehera/book-store-fe:1.0`

## kubernetes

`kubectl apply -f k8-bsfe-deployment.yaml`

`kubectl -n dev get deployments`

`kubectl -n dev get svc`

`kubectl -n dev get pods`

<br> Get the port number from the svc (if nodePort is mentioned in teh svc then that is thye port#)
`kubectl -n dev get svc -o wide`  <br>

Get IP address from `minikube ip`
<br> open the brower http://IP:port

## Ingress
For ingress setup follow these steps [https://kubernetes.io/docs/tasks/access-application-cluster/ingress-minikube/](https://kubernetes.io/docs/tasks/access-application-cluster/ingress-minikube/)
<br>

Verify the Service(s) are created and available on a node port : `kubectl -n dev get svc` <br>

Visit the Service via NodePort: `minikube -n dev service << svc pod name>> --url` 

`minikube -n dev service book-store-fe-svc --url` <br>
Output is similar to : `http://192.168.49.2:31000`
<br>

You can now access the sample application via the Minikube IP address and NodePort. The next step lets you access the application using the Ingress resource. <br>


Create ingress `kubectl apply -f k8-bs-ingress.yaml` <br>
Verify ip address is set : `kubectl -n dev get ingress`


Verify that the Ingress controller is directing traffic: `curl --resolve "bookstore.oned:80:$( minikube ip )" -i http://bookstore.oned`


set the host file as below <br>
`<< minikube ip>> bookstore.oned` <br>
in linux `sudo nano /etc/hosts` <br>

After you make this change, your web browser sends requests for `bookstore.oned` URLs to Minikube.





