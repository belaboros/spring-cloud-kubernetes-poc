#!/bin/bash

URL=$(kubectl get service spring-cloud-kubernetes-poc --output=jsonpath='{.status.loadBalancer.ingress[0].ip}{":"}{.spec.ports[0].port}')
echo "Querying HTTP endpoint: ${URL}"

curl ${URL}












