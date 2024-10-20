plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
}
apply(from = "${rootProject.projectDir}/common.gradle")
android {
    namespace = "com.example.di"
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.navigation.compose)
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    //bundles
    implementation(libs.bundles.koinDependences)

    //modules
    implementation(project(path = ":base_ui"))
    implementation(project(path = ":data"))
    implementation(project(path = ":data_remote"))
    implementation(project(path = ":data_local"))
    implementation(project(path = ":domain"))
    implementation(project(path = ":feature_sample"))
    implementation(project(path = ":navigation"))
}