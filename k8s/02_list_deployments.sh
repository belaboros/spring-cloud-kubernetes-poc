#!/bin/bash


echo "kubectl get services"
kubectl get services


echo "kubectl get deployments"
kubectl get deployments


echo "kubectl get pods"
kubectl get pods


echo -e "\n\n\nkubectl describe deployment spring-cloud-kubernetes-poc"
kubectl describe deployment spring-cloud-kubernetes-poc