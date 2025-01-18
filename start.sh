export $(cat .env | xargs)
./mvnw clean spring-boot:run
