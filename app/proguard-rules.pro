# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# Uncomment this to preserve the line number information for
# debugging stack traces.
-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
-renamesourcefileattribute SourceFile

#-ignorewarnings

# ZANALYTICS
-keep class com.zoho.zanalytics.**
-dontwarn com.zoho.zanalytics.**

# IAM Library
-keep class com.zoho.accounts.**
-dontwarn com.zoho.accounts.**

# OKHTTP
-dontwarn okhttp3.**
-dontwarn okio.**

# OkHttp platform used only on JVM and when Conscrypt dependency is available.
-dontwarn okhttp3.internal.platform.ConscryptPlatform

# Coroutines
-keepnames class kotlinx.coroutines.internal.MainDispatcherFactory {}
-keepnames class kotlinx.coroutines.CoroutineExceptionHandler {}
-keepclassmembernames class kotlinx.** {
    volatile <fields>;
}

# res.font for Highchart fonts
-keep class **.R$font {
    <fields>;
}

# ZANALYTICS
-keep class com.zoho.crm.**
-dontwarn com.zoho.crm.**

#-keepclassmembernames class com.zoho.crm.analyticsstudio.charts.uiBuilder.ChartsUIBuiler {
# public *;
#}

# A resource is loaded with a relative path so the package of this class must be preserved.
#-keepnames class okhttp3.internal.publicsuffix.PublicSuffixDatabase
