FROM azul/zulu-openjdk:17

WORKDIR /app

COPY build.gradle.kts settings.gradle.kts /app/

RUN ./gradlew build || return 0

COPY . /app

RUN ./gradlew build

CMD ["java", "-jar", "build/libs/demo-0.0.1-SNAPSHOT.jar"]
