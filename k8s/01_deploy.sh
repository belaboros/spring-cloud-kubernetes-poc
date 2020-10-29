# declarative deployment
kubectl apply --filename=spring-cloud-kubernetes-poc.yaml


# imperative deployment (without yaml file):
#kubectl create deployment spring-cloud-kubernetes-poc --image=belaboros/spring-cloud-kubernetes-poc --port=8080
#kubectl expose deployment spring-cloud-kubernetes-poc --type=LoadBalancer --port 28080 --target-port 8080
