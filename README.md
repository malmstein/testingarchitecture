This is a simple project which shows an architecture used to run different types of tests

The project has three different modules

* `/app` - The Android application with instrumentation tests using Espresso and Spoon
* `/core` - A plain Java module which could allocate Java code such as HttpRequests, JSON parsers, etc. and runs JUnit tests
* `/robolectric-tests` - Robolectric tests for the `/app` module

**Espresso** tests can be run using:

```
./gradlew connectedCheck
./gradlew connectedAndroidTest
```

**Spoon** tests can be run using:

```
./gradlew spoon
```
![Spoon test image](/art/spoon.png)

**JUnit** and **Robolectric** tests can be ran using one of the following:

```
./gradlew test
./gradlew check
./gradlew build
```

**JaCoCo** reports can be generated for both `/core` and `/robolectric-tests` running:

```
./gradlew test jacoco
./gradlew check jacoco
./gradlew build jacoco
```

This project is an iteration on what can be found in here: http://blog.blundell-apps.com/android-gradle-app-with-robolectric-junit-tests/
