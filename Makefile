run-dist:
	./build/install/java-project-61/bin/java-project-61
run:
	./gradlew run
build:
	./gradlew clean build
install:
	./gradlew clean install
run:
	./gradlew run
run-clean:
	./gradlew run --console=plain
test:
	./gradlew test

report:
	./gradlew jacocoTestReport

lint:
	./gradlew spotlessApply

update-deps:
	./gradlew refreshVersions

build-run: build run

.PHONY: build