## Execute the files in the below sequence :

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


Open http://<<IP>>:<<PORT>>

## Delete all pods

`kubectl delete -f k8-bs-configmap.yaml`

`kubectl delete -f k8-bs-secrets.yaml`

`kubectl delete -f k8-db-deployment.yaml`

`kubectl delete -f k8-bsfe-deployment.yaml`

`kubectl delete -f k8-bsbe-deployment.yaml`
