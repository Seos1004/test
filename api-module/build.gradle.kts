plugins {
    id("org.springframework.boot")
}

dependencies {
    implementation(project(":alpha-module"))
    implementation(project(":omega-module"))
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.2.0")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}
