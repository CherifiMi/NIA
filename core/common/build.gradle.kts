plugins {
    id("com.android.library")
    alias(libs.plugins.hilt) apply false
}

android {
    namespace = "com.example.core.common"
}

dependencies {
    implementation(libs.kotlinx.coroutines.android)
}