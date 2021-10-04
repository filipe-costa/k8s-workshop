# k8s-workshop
Workshop using Deployments, Services and Ingress [@Gamesys](https://www.gamesysgroup.com/)

## Requirements:
- [Docker Desktop for Mac](https://hub.docker.com/editions/community/docker-ce-desktop-mac)
- [Enable Kubernetes in Docker Desktop](https://docs.docker.com/desktop/kubernetes/#enable-kubernetes)
- [Nginx Controller](https://kubernetes.github.io/ingress-nginx/deploy/)

      kubectl apply -f https://raw.githubusercontent.com/kubernetes/ingress-nginx/controller-v1.0.2/deploy/static/provider/cloud/deploy.yaml

- Add to /etc/hosts

            127.0.0.1 k8s.workshop.com

  - You now curl:
      
                  curl http://k8s.workshop.com
                  curl http://k8s.workshop.com/healthz
                  curl http://k8s.workshop.com/hello?name=Filipe