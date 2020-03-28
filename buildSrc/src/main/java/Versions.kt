@file:Suppress("MemberVisibilityCanBePrivate")

object Versions {
  const val versionMajor = 1
  const val versionMinor = 0
  const val versionPatch = 0
  const val versionBuild = 0

  const val compileSdk = 29
  const val minSdk = 21
  const val targetSdk = 29
  const val versionCode =
    versionMajor * 10000 + versionMinor * 1000 + versionPatch * 100 + versionBuild
  const val versionName = "$versionMajor.$versionMinor.$versionPatch.$versionBuild"

  const val proguard_android = "proguard-android.txt"
  const val proguard_common = "proguard-common.txt"
  const val proguard_specific = "proguard-specific.txt"
  const val applicationId = "com.pushpal.covidtracker"

  const val gradle = "3.5.3"
  const val junit = "4.12"
  const val appCompat = "1.1.0"
  const val constraint = "1.1.3"
  const val swipeRefreshLayout = "1.0.0"
  const val material = "1.1.0"
  const val kotlin = "1.3.50"
  const val activityVersion = "1.1.0"
  const val fragmentVersion = "1.2.3"
  const val lifecycleVersion = "2.2.0"
  const val roomVersion = "2.2.5"
  const val archCoreTesting = "2.1.0"
  const val dagger = "2.25.2"
  const val retrofit = "2.6.1"
  const val okHttpVersion = "4.2.1"
  const val gson = "2.8.5"
  const val timber = "4.7.1"
  const val memoryLeak = "2.0-beta-2"
  const val progressButton = "2.0.1"
  const val glide = "4.9.0"
  const val espresso = "3.0.2"
  const val jaxbCore = "2.3.0.1"
  const val jaxbApi = "2.3.1"
  const val jaxbImpl = "2.3.2"
}