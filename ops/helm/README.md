

`helm create bookstore-be-chart`

`rm -rf templates/*`


```
helm install my-prometheus prometheus-community/prometheus --version 23.3.0
helm ls --all-namespaces
helm install my-prometheus-dev prometheus-community/prometheus --version 23.3.0 -n dev
helm ls --all-namespaces
helm uninstall my-prometheus --keep-history
helm ls --all-namespaces
helm ls --all-namespaces -a
helm upgrade my-prometheus-dev prometheus-community/prometheus --version 23.2.0 -n dev

# rollback
helm history my-prometheus-dev -n dev
helm rollback my-prometheus-dev 1 -n dev
```

add the below in Notes.txt
```
servicename=$(kubectl get service -l "app=myhelmapp" -o jsonpath="{.items[0]".metadata.name}")
kubectl port-forward service/myhelpapp 8088:80 --namespace dev

or

servicename=$(kubectl get service -l "app={{ .Values.appName }}" -o jsonpath="{.items[0]".metadata.name}")
kubectl port-forward service/{{ .Values.appName }} 8088:80 --namespace {{ .Values.namespace }}

```
Helm command:
```
helm install mywebapp-release-dev webapp1/ --calues webapp1/values.yaml -f webapp1/values-dev.yaml
 
```

