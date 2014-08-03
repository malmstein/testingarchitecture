This is a simple project which shows an architecture used to run different types of tests

The project has three different modules

`/app` - The Android application with instrumentation tests using Espresso
`/core` - A plain Java module which could allocate Java code such as HttpRequests, JSON parsers, etc. and runs JUnit tests
`/robolectric-tests` - Robolectric tests for the `/app` module

Espresso tests can be run using:

```
./gradlew connectedCheck
./gradlew connectedAndroidTest
```

JUnit and Robolectric tests can be ran using one of the following:

```
./gradlew test
./gradlew check
./gradlew build
```
