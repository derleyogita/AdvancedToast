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
	      
             implementation 'com.yogitad.advancedtoast:1.0'
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
## Screenshots

<img src="https://github.com/derleyogita/AdvancedToast/blob/master/app/src/main/res/drawable/homescreen.jpg" width="200"> <img src="https://github.com/derleyogita/AdvancedToast/blob/master/app/src/main/res/drawable/success.jpg" width="200"><img src="https://github.com/derleyogita/AdvancedToast/blob/master/app/src/main/res/drawable/error.jpg" width="200"><img src="https://github.com/derleyogita/AdvancedToast/blob/master/app/src/main/res/drawable/online.jpg" width="200"><img src="https://github.com/derleyogita/AdvancedToast/blob/master/app/src/main/res/drawable/offline.jpg" width="200"><img src="https://github.com/derleyogita/AdvancedToast/blob/master/app/src/main/res/drawable/infotoast.jpg" width="200">

## Author- Yogita Derle
## This is my practice project.
## Stay updated, will be updating same repository.

