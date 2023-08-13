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
