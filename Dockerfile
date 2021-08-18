FROM openjdk:11-slim
EXPOSE 8081

ENTRYPOINT ["./entrypoint.sh"]

RUN apt-get update && apt-get install -y curl && rm -rf /var/lib/apt/lists/*

ARG APP_NAME=kafka-consumer
ENV APP_HOME /opt/poc/$APP_NAME

ENV USERNAME poc
ENV GROUPNAME poc

WORKDIR $APP_HOME

COPY entrypoint.sh .
COPY target/springboot-kafka-consumer-0.0.1-SNAPSHOT.jar lib/springboot-kafka-consumer.jar

RUN groupadd -r $GROUPNAME && useradd --no-log-init -r -g $GROUPNAME $USERNAME \
    && chown -R $USERNAME:$GROUPNAME $APP_HOME \
    && chmod 755 *.sh

USER $USERNAME