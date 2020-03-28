@Suppress("unused", "MayBeConstant")
object Dependencies {
  val gradle = "com.android.tools.build:gradle:${Versions.gradle}"
  val junit = "junit:junit:${Versions.junit}"
  val support_appcompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
  val support_design = "com.google.android.material:material:${Versions.material}"
  val constraint_layout = "androidx.constraintlayout:constraintlayout:${Versions.constraint}"
  val swipe_refresh_layout = "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.swipeRefreshLayout}"

  val lifecycle_extensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycleVersion}"
  val lifecycle_view_model = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleVersion}"
  val lifecycle_live_data = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycleVersion}"
  val lifecycle_compiler = "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycleVersion}"

  val activity = "androidx.activity:activity-ktx:${Versions.activityVersion}"
  val fragment = "androidx.fragment:fragment-ktx:${Versions.fragmentVersion}"

  val room = "androidx.room:room-runtime:${Versions.roomVersion}"
  val room_compiler = "androidx.room:room-compiler:${Versions.roomVersion}"
  val room_ktx = "androidx.room:room-ktx:${Versions.roomVersion}"

  val dagger = "com.google.dagger:dagger:${Versions.dagger}"
  val dagger_compiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
  val dagger_android = "com.google.dagger:dagger-android:${Versions.dagger}"
  val dagger_android_support = "com.google.dagger:dagger-android-support:${Versions.dagger}"
  val dagger_android_compiler = "com.google.dagger:dagger-android-processor:${Versions.dagger}"

  val arch_core_testing = "androidx.arch.core:core-testing:${Versions.archCoreTesting}"

  val kotlin_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
  val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"

  val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
  val retrofit_gson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
  val ok_http =  "com.squareup.okhttp3:okhttp:${Versions.okHttpVersion}"
  val ok_http_logger =  "com.squareup.okhttp3:logging-interceptor:${Versions.okHttpVersion}"
  val gson = "com.google.code.gson:gson:${Versions.gson}"
  val timber = "com.jakewharton.timber:timber:${Versions.timber}"
  val memory_leak_debug = "com.squareup.leakcanary:leakcanary-android:${Versions.memoryLeak}"
  val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
  val glide_compiler = "com.github.bumptech.glide:compiler:${Versions.glide}"
  val progress_button = "com.github.razir.progressbutton:progressbutton:${Versions.progressButton}"
  val espresso = "com.android.support.test.espresso:espresso-core:${Versions.espresso}"
  val jaxb_core = "com.sun.xml.bind:jaxb-core:${Versions.jaxbCore}"
  val jaxb_api = "javax.xml.bind:jaxb-api:${Versions.jaxbApi}"
  val jaxb_impl = "com.sun.xml.bind:jaxb-impl:${Versions.jaxbImpl}"
  val android_junit_runner = "androidx.test.runner.AndroidJUnitRunner"
}