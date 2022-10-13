plugins {
    id("com.android.application")

    id("kotlin-android")
    id("kotlin-kapt")
    id("kotlin-parcelize")

    id("dagger.hilt.android.plugin")
    id("androidx.navigation.safeargs.kotlin")

    id("plugins.jacoco-report")
}
val keystoreProperties = rootDir.loadGradleProperties("signing.properties")

android {
    signingConfigs {
        create(BuildType.RELEASE) {
            // Remember to edit signing.properties to have the correct info for release build.
            storeFile = file("../config/release.keystore")
            storePassword = keystoreProperties.getProperty("KEYSTORE_PASSWORD") as String
            keyPassword = keystoreProperties.getProperty("KEY_PASSWORD") as String
            keyAlias = keystoreProperties.getProperty("KEY_ALIAS") as String
        }

        getByName(BuildType.DEBUG) {
            storeFile = file("../config/debug.keystore")
            storePassword = "oQ4mL1jY2uX7wD8q"
            keyAlias = "debug-key-alias"
            keyPassword = "oQ4mL1jY2uX7wD8q"
        }
    }

    compileSdk = Versions.ANDROID_COMPILE_SDK_VERSION
    defaultConfig {
        applicationId = "co.weather.coroutine"
        minSdk = Versions.ANDROID_MIN_SDK_VERSION
        targetSdk = Versions.ANDROID_TARGET_SDK_VERSION
        versionCode = Versions.ANDROID_VERSION_CODE
        versionName = Versions.ANDROID_VERSION_NAME
    }

    buildTypes {
        getByName(BuildType.RELEASE) {
            isMinifyEnabled = true
            isDebuggable = false
            isShrinkResources = true
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
            signingConfig = signingConfigs[BuildType.RELEASE]
            buildConfigField("String", "BASE_API_URL", "\"https://api.openweathermap.org/\"")
            buildConfigField("String", "API_KEY", "\"3dd269efcc60a545e8b051fa4a35b3d6\"")
            buildConfigField("String", "IMAGE_URL", "\"http://openweathermap.org/img/wn/\"")
        }

        getByName(BuildType.DEBUG) {
            // For quickly testing build with proguard, enable this
            isMinifyEnabled = false
            signingConfig = signingConfigs[BuildType.DEBUG]
            buildConfigField("String", "BASE_API_URL", "\"https://api.openweathermap.org/\"")
            buildConfigField("String", "API_KEY", "\"3dd269efcc60a545e8b051fa4a35b3d6\"")
            buildConfigField("String", "IMAGE_URL", "\"http://openweathermap.org/img/wn/\"")
            /**
             * From AGP 4.2.0, Jacoco generates the report incorrectly, and the report is missing
             * some code coverage from module. On the new version of Gradle, they introduce a new
             * flag [testCoverageEnabled], we must enable this flag if using Jacoco to capture
             * coverage and creates a report in the build directory.
             * Reference: https://developer.android.com/reference/tools/gradle-api/7.1/com/android/build/api/dsl/BuildType#istestcoverageenabled
             */
            isTestCoverageEnabled = true
        }
    }

    flavorDimensions(Flavor.DIMENSIONS)
    productFlavors {
        create(Flavor.STAGING) {
            applicationIdSuffix = ".staging"
        }

        create(Flavor.PRODUCTION) {}
    }

    sourceSets["test"].resources {
        srcDir("src/test/resources")
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }


    buildFeatures {
        viewBinding = true
        dataBinding = true
    }

    lintOptions {
        isCheckDependencies = true
        xmlReport = true
        xmlOutput = file("build/reports/lint/lint-result.xml")
    }

    testOptions {
        unitTests {
            // Robolectric resource processing/loading
            isIncludeAndroidResources = true
            isReturnDefaultValues = true
        }
    }
}

kapt {
    correctErrorTypes = true
}

dependencies {
    implementation(project(Module.DATA))
    implementation(project(Module.DOMAIN))

    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation("androidx.activity:activity-ktx:${Versions.ANDROIDX_ACTIVITY_KTX_VERSION}")
    implementation("androidx.appcompat:appcompat:${Versions.ANDROIDX_SUPPORT_VERSION}")
    implementation("androidx.constraintlayout:constraintlayout:${Versions.CONSTRAINT_LAYOUT_VERSION}")
    implementation ("com.google.android.material:material:${Versions.ANDROID_MATERIAL_VERSION}")
    implementation ("androidx.swiperefreshlayout:swiperefreshlayout:${Versions.ANDROIDX_SWIPE_REFRESH_LAYOUT_VERSION}")

    implementation("androidx.core:core-ktx:${Versions.ANDROIDX_CORE_KTX_VERSION}")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:${Versions.ANDROIDX_LIFECYCLE_VERSION}")


    implementation("androidx.navigation:navigation-fragment-ktx:${Versions.ANDROIDX_NAVIGATION_VERSION}")
    implementation("androidx.navigation:navigation-runtime-ktx:${Versions.ANDROIDX_NAVIGATION_VERSION}")
    implementation("androidx.navigation:navigation-ui-ktx:${Versions.ANDROIDX_NAVIGATION_VERSION}")

    implementation("com.google.dagger:hilt-android:${Versions.HILT_VERSION}")

    implementation("com.jakewharton.timber:timber:${Versions.TIMBER_LOG_VERSION}")

    implementation("org.jetbrains.kotlin:kotlin-stdlib:${Versions.KOTLIN_VERSION}")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.KOTLINX_COROUTINES_VERSION}")

    implementation("com.google.dagger:hilt-android:${Versions.HILT_VERSION}")
    kapt("com.google.dagger:hilt-compiler:${Versions.HILT_VERSION}")

    debugImplementation("androidx.fragment:fragment-testing:${Versions.ANDROIDX_FRAGMENT_VERSION}")

    implementation("com.github.bumptech.glide:glide:${Versions.GLIDE_VERSION}")
    kapt("com.github.bumptech.glide:compiler:${Versions.GLIDE_VERSION}")


    implementation("com.google.android.gms:play-services-location:${Versions.GOOGLE_SERVICE_LOCATION}")
    implementation ("com.facebook.stetho:stetho-okhttp3:${Versions.STETHO_VERSION}")

    implementation ("androidx.work:work-runtime-ktx:${Versions.ANDROIDX_WORK_MANAGER}")


    // Testing
    testImplementation("io.kotest:kotest-assertions-core:${Versions.TEST_KOTEST_VERSION}")
    testImplementation("junit:junit:${Versions.TEST_JUNIT_VERSION}")
    testImplementation("androidx.test:core:${Versions.ANDROIDX_CORE_KTX_VERSION}")
    testImplementation("androidx.test:runner:${Versions.TEST_RUNNER_VERSION}")
    testImplementation("androidx.test:rules:${Versions.TEST_RUNNER_VERSION}")
    testImplementation("androidx.test.ext:junit-ktx:${Versions.TEST_JUNIT_ANDROIDX_EXT_VERSION}")
    testImplementation("com.google.dagger:hilt-android-testing:${Versions.HILT_VERSION}")
    testImplementation("io.mockk:mockk:${Versions.TEST_MOCKK_VERSION}")


    kaptTest("com.google.dagger:hilt-android-compiler:${Versions.HILT_VERSION}")
    testAnnotationProcessor("com.google.dagger:hilt-android-compiler:${Versions.HILT_VERSION}")
}
