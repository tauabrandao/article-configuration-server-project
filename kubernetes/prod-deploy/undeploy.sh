#!/bin/sh

echo 'undeploying config server'
kubectl delete -f config-server/
echo
echo 'undeploying api'
kubectl delete -f api/
