When Using Arrow Core 2.0.0 I'm getting:

    /Users/danielecampogiani/Developing/android/arrow-2-empty-list-issue/app/build/generated/ksp/debug/java/com/danielecampogiani/MainViewModel_Factory.java:28: error: cannot access StateBuilder
      private final Provider<StateBuilder> builderProvider;
                             ^
      bad class file: /Users/danielecampogiani/Developing/android/arrow-2-empty-list-issue/app/build/tmp/kotlin-classes/debug/com/danielecampogiani/StateBuilder.class
        undeclared type variable: A
        Please remove or make sure it appears in the correct subdirectory of the classpath.

Everything works fine if I use `1.2.4`, or replace `NonEmptyList` with `List`
