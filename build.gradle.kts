plugins {
    id("java")
    id("org.springframework.boot") version "3.2.4"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

group = "com.perycreep"
version = "1.0-SNAPSHOT"


repositories {
    mavenCentral()
}


dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web:3.2.4")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.2.4")

    implementation("org.postgresql:postgresql:42.7.3")
    implementation("org.hibernate:hibernate-core:6.5.1.Final")
    compileOnly("org.projectlombok:lombok:1.18.32")
    annotationProcessor("org.projectlombok:lombok:1.18.32")

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    runtimeOnly("org.flywaydb:flyway-database-postgresql:10.0.0")
    implementation("org.flywaydb:flyway-core:10.0.0")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<org.springframework.boot.gradle.tasks.bundling.BootJar> {
    archiveFileName.set("stocktaking.jar")
    archiveVersion.set("1.0.0")
    mainClass = "app.Main"
}