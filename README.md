# Tranomboky

Ce projet est un exemple minimal d'application Spring Boot MVC.

## Prérequis
- Java 17
- Maven 3.8+

## Lancer l'application en mode développement
Utilisez le profil `dev` pour charger la configuration `application-dev.properties` :

```bash
SPRING_PROFILES_ACTIVE=dev mvn spring-boot:run
```

## Lancer l'application en mode standard
Construisez le projet puis exécutez le jar généré (sans profil `dev`) :

```bash
mvn clean package
java -jar target/tranomboky-0.0.1-SNAPSHOT.jar
```

Accédez ensuite à [http://localhost:8080](http://localhost:8080) pour voir la page d'accueil.

