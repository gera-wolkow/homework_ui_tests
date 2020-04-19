# homework_ui_tests

Guide “How to run my UI Android Autotests” for Unix system (Using MacOSX for example) 
1. Download UI Autotests to local PC/Mac
2. Download and install latest Android Studio https://developer.android.com/studio
3. Connect Android device and enable debugging through USB
4. Run “adb devices” in Terminal (add path to “adb” in .bash_profile using “echo export "PATH=~/Library/Android/sdk/platform-tools:$PATH" >> ~/.bash_profile” command)
5. Get your device udid number from Terminal (after running “adb devices”) and add it to Main class (change Android version in Main class too if it not 9.0)
6. Download and install Appium desktop application https://github.com/appium/appium- desktop/releases/
7. Run Appium desktop application, edit Configuration (add Android Home and Java Home values - “/Users/yourusername/Library/Android/sdk/” and “/Library/Java/JavaVirtualMachines/ jdk1.8.0_112.jdk/Contents/Home/” for example) and start Server
8. Execute autotests