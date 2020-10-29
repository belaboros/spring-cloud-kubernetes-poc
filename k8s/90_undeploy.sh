#!/bin/bash


kubectl delete -f spring-cloud-kubernetes-poc.yaml
#kubectl delete service/spring-cloud-kubernetes-poc
#kubectl delete deployment spring-cloud-kubernetes-poc


kubectl delete configmap spring-cloud-kubernetes-poc



