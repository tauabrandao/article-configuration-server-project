#!/bin/sh

echo 'deploying config server'
kubectl create -f config-server/

echo
echo 'waiting 10 seconds to deploy the API'

sleep 10
kubectl create -f api/

echo
echo 'API URL below - it may take a few seconds for you to be able to access it.'
minikube service api-service --url
