from appium import webdriver
from appium.webdriver.common.appiumby import AppiumBy
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from appium.options.android import UiAutomator2Options  # Import the UiAutomator2Options

def main():
    # Initialize the UiAutomator2Options object
    options = UiAutomator2Options()

    # Set your desired capabilities
    options.device_name = "my_emulator"
    options.platform_name = "Android"
    options.platform_version = "12"
    options.app_package = "com.google.android.apps.youtube.music"
    options.app_activity = "activities.MusicActivity"
    options.no_sign = True

    # Initialize the WebDriver with the options object
    driver = webdriver.Remote(command_executor="http://127.0.0.1:4723/wd/hub", options=options)

    # Locate and click the element
    deviceOnlyElement = WebDriverWait(driver, 5).until(EC.element_to_be_clickable((AppiumBy.XPATH, "//android.widget.Button[@text='DEVICE FILES ONLY']")))
    deviceOnlyElement.click()

    # Quit the driver
   # driver.quit()

if __name__ == '__main__':
    main()

