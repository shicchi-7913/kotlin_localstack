FROM azul/zulu-openjdk:17

WORKDIR /app

COPY build.gradle.kts settings.gradle.kts /app/

RUN ./gradlew build || return 0

COPY . /app

CMD ["./gradlew", "bootRun"]
