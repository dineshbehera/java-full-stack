## Execute the files in the below sequence or `kubectl apply -f .` :

`kubectl apply -f k8-bs-configmap.yaml`

`kubectl apply -f k8-bs-secrets.yaml`

`kubectl apply -f k8-db-deployment.yaml`

`kubectl apply -f k8-bsfe-deployment.yaml`

`kubectl apply -f k8-bsbe-deployment.yaml`

Check if all are running fine or not : `

`kubectl -n dev get configmaps` <br>
`kubectl -n dev get secrets` <br>
`kubectl -n dev get deployments` <br>
`kubectl -n dev get svc` <br>
`kubectl -n dev get pods` <br>

Get IP : `minikube ip` <br>


Open `http:// << IP Address >>:31000`

Open `http:// << IP Address >>:32000/users/`

Open `http:// << IP Address >>:32000/books/`

`http://bookstore.oned/`
`http://api.bookstore.oned/users/`
`http://api.bookstore.oned/books/`

`kubectl -n dev get svc`


`minikube -n dev service book-store-be-svc --url`

`minikube -n dev service book-store-fe-svc --url`


## Delete all pods

`kubectl delete -f k8-bs-configmap.yaml`

`kubectl delete -f k8-bs-secrets.yaml`

`kubectl delete -f k8-db-deployment.yaml`

`kubectl delete -f k8-bsfe-deployment.yaml`

`kubectl delete -f k8-bsbe-deployment.yaml`
