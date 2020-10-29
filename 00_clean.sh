mvn clean


echo "Removing image: spring-cloud-kubernetes-poc"
docker image rm spring-cloud-kubernetes-poc --force
docker image rm belaboros/spring-cloud-kubernetes-poc --force


