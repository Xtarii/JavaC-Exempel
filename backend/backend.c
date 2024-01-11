#include <jni.h>
#include "../Account.h"





/**
 * Data Storage Handling Functions
*/

// Store Data Function
JNIEXPORT void JNICALL Java_Account_store__(JNIEnv *env, jobject obj){
    // Sets Path
    const char *path = "./";
    const char *filename = "Account.json"; // File Name

    // Writes Data to File
    printf("Writes Data to Path: %s%s\n", path, filename);
}

// Store Data Function
JNIEXPORT void JNICALL Java_Account_store__Ljava_lang_String_2(JNIEnv *env, jobject obj, jstring p){
    // Gets Path
    const char *path = (*env)->GetStringUTFChars(env, p, NULL);    
    const char *filename = "Account.json"; // File Name

    // Writes Data to File
    printf("Writes Data to Path: %s%s\n", path, filename);

    // Removes Path
    (*env)->ReleaseStringUTFChars(env, p, path);
}
