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
    buildTypes { release { isMinifyEnabled = false } }
    compileOptions { sourceCompatibility = JavaVersion.VERSION_17; targetCompatibility = JavaVersion.VERSION_17 }
    kotlinOptions { jvmTarget = "17" }
}
dependencies { implementation("androidx.activity:activity:1.8.2") }
