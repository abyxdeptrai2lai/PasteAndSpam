import com.aliucord.gradle.*
import com.aliucord.gradle.tasks.*
import com.android.build.gradle.internal.tasks.factory.dsl.*

plugins {
    id("com.android.library")
    id("com.aliucord.gradle")
}

android {
    namespace = "com.aliucord.plugins.pasteandspam"
    compileSdk = 34

    defaultConfig {
        minSdk = 26
        targetSdk = 34
    }
}

aliucord {
    author("Freddy")
    description("Adds a Paste button and Auto Spam menu to chat input.")
    version = "1.0.0"
    updateUrl = "https://github.com/Freddy/PasteAndSpam"
}

dependencies {
    // Discord dependencies required for Aliucord plugins
    compileOnly("com.discord:discord:126021")
}
