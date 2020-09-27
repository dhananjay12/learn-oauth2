# Keycloak Docker Compose

Taken from [here](https://github.com/keycloak/keycloak-containers/tree/master/docker-compose-examples).

By default keycloak runs on port 8080. We have exposed it on 9090, but internally it still run on 8080.

Spin keycloak and import the `mycompany` realm which has a user `john` with password `john`. 
Use the postman collection to get access token using Authorization Code flow. The first `GET` request needs
to be made using browser.

Use [jwt.io](https://jwt.io/) to decode token.