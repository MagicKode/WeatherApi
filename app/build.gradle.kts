plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.kapt)
    alias(libs.plugins.kotlin.parcelize)
}

android {
    namespace = "ru.myapp.quizapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "ru.myapp.quizapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)


    implementation(libs.chip.navigation.bar)

    //retrofit
//    implementation (libs.retrofit2.retrofit)
//    implementation (libs.converter.gson)

    //OkHttpclient
//    implementation (libs.okhttp3.okhttp)
//    implementation (libs.logging.interceptor)

    //lifecycle
//    runtimeOnly (libs.androidx.lifecycle.extensions)
//    runtimeOnly (libs.lifecycle.runtime.ktx)
//    runtimeOnly (libs.lifecycle.viewmodel.ktx)
//    runtimeOnly (libs.androidx.lifecycle.livedata.ktx)

    //Gson
//    implementation (libs.gson)

    //other
//    implementation (libs.matteobattilana.weatherview)

    //ViewModel
//    implementation(libs.androidx.activity.ktx)
//    implementation(libs.blurview)


    implementation(libs.glide)

    testImplementation(libs.junit)

    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}