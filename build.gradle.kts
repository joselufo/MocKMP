plugins {
    id("org.kodein.root")
    id("com.google.devtools.ksp") version "1.6.10-1.0.2" apply false
}

val kspVersion by extra { "1.6.10-1.0.2" }

allprojects {
    group = "org.kodein.mock"
    version = "1.2.0"
}
