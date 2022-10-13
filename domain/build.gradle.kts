import org.jetbrains.kotlin.kapt3.base.Kapt.kapt

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-parcelize")
    id("kotlin-kapt")
    id("com.google.gms.google-services")
    id("com.google.firebase.crashlytics")
}

android {
    compileSdk = Versions.ANDROID_COMPILE_SDK_VERSION
}

dependencies {
    implementation("javax.inject:javax.inject:${Versions.JAVAX_INJECT_VERSION}")

    // Testing
    testImplementation("junit:junit:${Versions.TEST_JUNIT_VERSION}")
    testImplementation("io.mockk:mockk:${Versions.TEST_MOCKK_VERSION}")
    testImplementation("io.kotest:kotest-assertions-core:${Versions.TEST_KOTEST_VERSION}")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.KOTLINX_COROUTINES_VERSION}")

    api("com.squareup.retrofit2:retrofit:${Versions.RETROFIT_VERSION}")
    api("com.squareup.retrofit2:converter-moshi:${Versions.RETROFIT_VERSION}")
    api("com.squareup.moshi:moshi-adapters:${Versions.MOSHI_VERSION}")
    api("com.squareup.moshi:moshi-kotlin:${Versions.MOSHI_VERSION}")

    api (platform("com.google.firebase:firebase-bom:${Versions.FIREBASE_BOOM}"))
    api ("com.google.firebase:firebase-analytics")
    api ("com.google.firebase:firebase-crashlytics")
    api ("com.google.firebase:firebase-firestore-ktx")
    api ("com.google.firebase:firebase-messaging-ktx")

    api ("androidx.room:room-runtime:${Versions.ANDROIDX_ROOM_VERSION}")
    kapt ("androidx.room:room-compiler:${Versions.ANDROIDX_ROOM_VERSION}")
    api ("androidx.room:room-ktx:${Versions.ANDROIDX_ROOM_VERSION}")

}
