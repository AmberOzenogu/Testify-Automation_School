# adb uninstall io.appium.uiautomator2.server
# adb uninstall io.appium.uiautomator2.server.test


""" desired_caps {
        "deviceName": "my_emulator",
        "platformName": "Android",
        "platformVersion": "12",
        "app" : "C:/Users/edeno/Downloads/Calculator_8.6 (612662282)_APKPure.apk",
        "appPackage": "com.google.android.calculator",
        "noSign": true
} """

'''
"appium:deviceName": "my_emulator",
  "platformName": "Android",
  "appium:platformVersion": "12",
  "appium:app": "C:/Users/edeno/Downloads/Calculator_8.6 (612662282)_APKPure.apk",
  "appium:appPackage": "com.google.android.calculator",
  "appium:noSign": true,
  "appium:adbExecTimeout": 60000,
  "newCommandTimeout": 120000,
  "commandTimeouts": {
    "command": 60000
  }
  '''


'''
  "platformName": "Android",
  "appium:options": {
    "automationName": "UiAutomator2",
    "platformVersion": "13",
    "app": "/Users/edeno/Downloads/Calculator_8.6 (612662282)_APKPure.apk",
    "deviceName": "my_emulator",
    "noReset": true
  }
  '''