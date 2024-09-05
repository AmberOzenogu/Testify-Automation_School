import time
import unittest
from appium import webdriver
from appium.options.common import AppiumOptions
from appium.webdriver.common.appiumby import AppiumBy
from appium.options.android import UiAutomator2Options



def main():
    desired_cap = {
        "platformName": "Android",
        "deviceName": "my_emulator",
        "platformVersion": "12",
        "appPackage": "com.google.android.apps.youtube.music",
        "appActivity" : "activities.MusicActivity",
        "noSign": True
    }
    appium_options = AppiumOptions()
    appium_options.load_capabilities(desired_cap)
    driver = webdriver.Remote("http://127.0.0.1:4723/wd/hub", options=appium_options)
    # ele_1 = driver.find_element(AppiumBy.ID, "com.google.android.calculator:id/digit_1")
    # ele_2 = driver.find_element(AppiumBy.ID, "com.google.android.calculator:id/digit_2")
    # multiply_el = driver.find_element(AppiumBy.ID, "com.google.android.calculator:id/op_mul")
    # equal_el = driver.find_element(AppiumBy.ID, "com.google.android.calculator:id/eq")
    # ele_1.click()
    # multiply_el.click()
    # ele_2.click()
    # equal_el.click()
    # time.sleep(5)
    driver.quit()

if __name__ == "__main__":
    main()
