# FOSSA Maven Demo Project

This project demonstrates Maven dependency analysis with FOSSA CLI, featuring a multi-module setup with local dependencies.

## Project Structure

```
fossa-maven-demo/
├── cowsay-wrapper/          # Library module
│   ├── pom.xml
│   └── src/main/java/com/example/cowsay/
│       └── CowSpeaker.java
└── cowsay-app/       # Application module that depends on cowsay-lib
    ├── pom.xml
    └── src/main/java/com/example/app/
        └── Main.java
```

## Build Order

Since `cowsay-wrapper` depends on `cowsay` library, you must build the library first, and then build the application.

1. **Build and install the library:**
   ```bash
   cd cowsay-wrapper
   mvn clean install
   ```

2. **Build the application:**
   ```bash
   cd ../cowsay-app
   mvn clean compile
   ```

## FOSSA Analysis

This setup demonstrates how FOSSA CLI handles Maven projects with local dependencies, but this is a good setup for how things may run at an enterprise level, where wrappers of actual OSS dependencies may be stored in a private registry.

- FOSSA requires dependencies to be resolvable via Maven's standard mechanisms
- Local dependencies must be built and installed
- Use `fossa list-targets` to identify project modules before analysis

## Dependencies

- `cowsay-wrapper` (local dependency) → `cowsay` (Rick's 🐮)
- Maven coordinates: `com.example:cowsay-lib:1.0.0`

[Maven strategy](https://github.com/fossas/fossa-cli/blob/master/docs/references/strategies/languages/maven/maven.md).
