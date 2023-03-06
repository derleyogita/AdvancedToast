# AdvancedToast

# Advanced Toast - Toast Library using Kotlin


## About

A Advanced Toast Library using Kotlin

## Dependency Project Level

Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:



```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

```

## Gradle dependency

Add dependency in your app module

	dependencies {
	      
             implementation 'com.yogitad.advancedtoast:v1.0-alpha'
	}


## Usage 

# Sample Code for - Advanced Toast 

### Success Toast

```                
AdvancedToast.makeToast(
                this,
                "Account Added",
                "Account added successfully..!",
                ToastStyles.SUCCESS,
                AdvancedToast.LENGTH_LONG
            )
```            
### Error Toast

```   
 AdvancedToast.makeToast(
                this,
                "Error",
                "Mobile number update failed!",
                ToastStyles.ERROR,
                AdvancedToast.LENGTH_LONG)
```

## Author- Yogita Derle
## This is my practice project.
## Stay updated, will be updating same repository.

