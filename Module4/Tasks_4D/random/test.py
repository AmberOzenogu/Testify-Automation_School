from appium import webdriver
from appium.webdriver.common.mobileby import MobileBy
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
import time
def main():
    desired_caps = {
        "deviceName": "my_emulator",
        "platformName": "Android",
        "platformVersion": "12",
        "appPackage": "com.google.android.apps.youtube.music",
        "appActivity": "activities.MusicActivity",
        "noSign": True,
     "automationName": "UiAutomator2"
    }
    
    time.sleep(5)

    driver = webdriver.Remote(command_executor="http://127.0.0.1:4712/wd/hub", desired_capabilities=desired_caps)
    deviceOnlyElement = WebDriverWait(driver,5).until(EC.element_to_be_clickable((MobileBy.XPATH, "android.widget.Button[@text='DEVICE FILES ONLY']")))
    deviceOnlyElement.click()

    driver.quit()

if __name__ == '__main__':
    main()
