pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            library("retrofit", "com.squareup.retrofit2:retrofit:2.9.0")
            library("converter-gson", "com.squareup.retrofit2:converter-gson:2.9.0")
            // Add other libraries here as needed
        }
    }
}

rootProject.name = "app_final"
include(":app")
