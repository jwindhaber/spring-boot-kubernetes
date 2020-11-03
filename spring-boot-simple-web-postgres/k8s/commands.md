kubectl apply -f https://raw.githubusercontent.com/kubernetes/dashboard/v2.0.0/aio/deploy/recommended.yaml

Invoke-WebRequest -Uri https://raw.githubusercontent.com/kubernetes/dashboard/v2.0.0/aio/deploy/recommended.yaml -OutFile kubernetes-dashboard.yaml

kubectl proxy


**Creating the deployment of the postgres database:**
kubectl apply -f deployment-postgres.yaml
kubectl apply -f service-postgres-cluster-ip.yaml
kubectl port-forward service/postgres-simple 5432:5432

**Creating the deployment of the application:**
kubectl create deployment spring-boot-simple-web --image docker.io/library/simple-web:0.0.1-SNAPSHOT -o yaml --dry-run > deployment.yaml



kubectl delete -n default deployment easytax-platform

delete -n default service spring-boot-simple-web-postgres


**Creating a service:**

kubectl create service clusterip spring-boot-simple-web --tcp 80:8080 -o yaml --dry-run > service.yaml
kubectl port-forward service/pring-boot-simple-web 8080:80

kubectl create service loadbalancer spring-boot-simple-web --tcp 80:8080 -o yaml --dry-run > service-load-balancer.yaml

**Changing the deployment or service:**
kubectl apply -f deployment.yaml


**Logging**

kubectl logs easytax-platform-6c5867d8cf-rfgg7
kubectl logs -l app=easytax-platform





