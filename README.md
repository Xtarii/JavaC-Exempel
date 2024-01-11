# JavaC-Exempel
A Simple example of how to use C in java

I used:
- Java 21
- JNI
- C (gcc.exe (Rev6, Built by MSYS2 project) 13.1.0)





# Build
```
gcc -shared -o DLL/backend.dll -I "C:/Program Files/Java/jdk-21/include" -I "C:/Program Files/Java/jdk-21/include/win32" backend/backend.c
```

- GCC Is the Compiler
- DLL/backend.dll Is output place
- "-I" Indicates to Include the following directories, it is for JNI
- backend/backend.c is the C File to build into a DLL File



# How it Works
This Simple Project uses C code in java by creating a java class
with <a href="https://en.wikipedia.org/wiki/Java_Native_Interface">native functions</a> that will call C functions
```Java
public static native void MyFunc();
```
Or a non static function
```Java
public native void MyFunc();
```

The Java file is then built to a .class file with ```javac -h . myJavaFile.java```
The header file created can then be imported to C or C++
```C
#include "myFile.h"
```
