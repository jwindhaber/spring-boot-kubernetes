kubectl apply -f https://raw.githubusercontent.com/kubernetes/dashboard/v2.0.0/aio/deploy/recommended.yaml
kubectl proxy

**Creating the deployment of the application:**
kubectl create deployment spring-boot-simple-web --image docker.io/library/simple-web:0.0.1-SNAPSHOT -o yaml --dry-run > deployment.yaml

**Creating a service:**

kubectl create service clusterip spring-boot-simple-web --tcp 80:8080 -o yaml --dry-run > service.yaml
kubectl port-forward service/pring-boot-simple-web 8080:80

kubectl create service loadbalancer spring-boot-simple-web --tcp 80:8080 -o yaml --dry-run > service-load-balancer.yaml

**Changing the deployment or service:**
kubectl apply -f deployment.yaml
kubectl apply -f deployment.yaml





