plugins { id("com.android.application"); id("org.jetbrains.kotlin.android") }
android {
    namespace = "ro.bogdandev.gamehub"
    compileSdk = 34
    defaultConfig {
        applicationId = "ro.bogdandev.gamehub"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0.0"
    }
    signingConfigs {
        create("release") {
            System.getenv("KEYSTORE_FILE")?.let { f ->
                storeFile = file(f)
                storePassword = System.getenv("KEYSTORE_PASSWORD")
                keyAlias = System.getenv("KEY_ALIAS")
                keyPassword = System.getenv("KEYSTORE_PASSWORD")
            }
        }
    }
    buildTypes {
        release {
            isMinifyEnabled = false
            if (System.getenv("KEYSTORE_FILE") != null) signingConfig = signingConfigs.getByName("release")
        }
    }
    compileOptions { sourceCompatibility = JavaVersion.VERSION_17; targetCompatibility = JavaVersion.VERSION_17 }
    kotlinOptions { jvmTarget = "17" }
}
dependencies { implementation("androidx.activity:activity:1.8.2") }
