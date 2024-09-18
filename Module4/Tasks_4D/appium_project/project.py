import time
from appium import webdriver
from appium.webdriver.common.appiumby import AppiumBy
from selenium.webdriver import ActionChains
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from appium.options.android import UiAutomator2Options


def main():
    # Initialize the UiAutomator2Options object
    options = UiAutomator2Options()

    # Set your desired capabilities
    options.device_name = "my_emulator"
    options.platform_name = "Android"
    options.platform_version = "12"
    options.app = "C:/Users/edeno/Downloads/Android-MyDemoAppRN.1.3.0.build-244.apk"
    options.app_package = "com.saucelabs.mydemoapp.rn"
    options.no_sign = True

    # Initialize the WebDriver with the options object
    driver = webdriver.Remote(command_executor="http://127.0.0.1:4723/wd/hub", options=options)
    time.sleep(5)

    # Navigate to Login page
    menu = driver.find_element(AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="open menu"]/android.widget.ImageView')
    menu.click()
    time.sleep(2)
    login_option = driver.find_element(AppiumBy.XPATH, '//android.widget.TextView[@text="Log In"]')
    login_option.click()
    time.sleep(2)

    # Negative test1 - Invalid username
    username = driver.find_element(AppiumBy.XPATH, '//android.widget.EditText[@content-desc="Username input field"]')
    password = driver.find_element(AppiumBy.XPATH, '//android.widget.EditText[@content-desc="Password input field"]')

    username.click()
    username.send_keys("jane@example.com")
    password.click()
    password.send_keys("10203040")
    login_button = driver.find_element(AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="Login button"]')
    login_button.click()
    time.sleep(2)
    error_message = driver.find_element(AppiumBy.XPATH, '//android.widget.TextView[@text="Provided credentials do not match any user in this service."]')
    assert error_message.is_displayed(), "Error message not displayed for invalid login"

    # Negative test2 - Invalid password
    username.clear()
    password.clear()
    username.send_keys("bob@example.com")
    password.send_keys("wrongpassword")
    login_button.click()
    time.sleep(2)
    assert error_message.is_displayed(), "Error message not displayed for wrong password"

    # Valid Login
    username.clear()
    password.clear()
    username.send_keys("bob@example.com")
    password.send_keys("10203040")
    login_button.click()
    time.sleep(2)

    # Assert that you are on the PRODUCTS page
    products_page = driver.find_element(AppiumBy.XPATH, '//android.widget.TextView[@text="Products"]')
    assert products_page.is_displayed(), "Failed to navigate to the PRODUCTS page"

    # Sort page by Price-Ascending
    sort = driver.find_element(AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="sort button"]/android.widget.ImageView')
    sort.click()
    time.sleep(2)
    sortby = driver.find_element(AppiumBy.XPATH, '//android.widget.TextView[@text="Price - Ascending"]')
    sortby.click()
    time.sleep(1)

    # Add to cart
    for i in range(1, 6):  # Loop through products
        product = driver.find_element(AppiumBy.XPATH,f'(//android.view.ViewGroup[@content-desc="store item"])[{i}]/android.view.ViewGroup[1]/android.widget.ImageView')
        product.click()
        time.sleep(2)
        cart = driver.find_element(AppiumBy.XPATH, '//android.widget.TextView[@text="Add To Cart"]')
        cart.click()
        time.sleep(2)
        driver.back()
        time.sleep(1)

    # 5 star review
    product6 = driver.find_element(AppiumBy.XPATH, '(//android.view.ViewGroup[@content-desc="store item"])[6]/android.view.ViewGroup/android.widget.ImageView')
    product6.click()
    time.sleep(2)
    star = driver.find_element(AppiumBy.XPATH, '(//android.widget.TextView[@text="󰓏"])[5]')
    star.click()
    time.sleep(2)
    close_modal = driver.find_element(AppiumBy.XPATH, '//android.widget.TextView[@text="Close Modal"]')
    close_modal.click()
    time.sleep(2)
    cart = driver.find_element(AppiumBy.XPATH, '//android.widget.TextView[@text="Add To Cart"]')
    cart.click()
    driver.back()

    # View cart
    cart_icon = driver.find_element(AppiumBy.XPATH,'//android.view.ViewGroup[@content-desc="cart badge"]/android.widget.ImageView')
    cart_icon.click()
    time.sleep(2)

    # Assert the number of items added to cart
    cart_items = driver.find_element(AppiumBy.XPATH, '//android.widget.TextView[@content-desc="total number"]')
    assert cart_items.text == "6 items", "Not all items are displayed in the cart"

    # Remove items from the cart
    item1 = driver.find_element(AppiumBy.XPATH, '(//android.widget.TextView[@text="Remove Item"])[1]')
    item1.click()
    time.sleep(2)
    item2 = driver.find_element(AppiumBy.XPATH, '(//android.widget.TextView[@text="Remove Item"])[1]')
    item2.click()
    time.sleep(2)

    # Assert the number of items remaining in cart
    rem_cart_items = driver.find_element(AppiumBy.XPATH, '//android.widget.TextView[@content-desc="total number"]')
    assert rem_cart_items.text == "4 items", "Incorrect number of items remaining in the cart"

    # Checkout Page
    checkout = driver.find_element(AppiumBy.XPATH, '//android.widget.TextView[@text="Proceed To Checkout"]')
    checkout.click()
    time.sleep(2)

    fullname = driver.find_element(AppiumBy.XPATH, '//android.widget.EditText[@content-desc="Full Name* input field"]')
    fullname.click()
    fullname.send_keys("Jane Doe")

    address1 = driver.find_element(AppiumBy.XPATH, '//android.widget.EditText[@content-desc="Address Line 1* input field"]')
    address1.click()
    address1.send_keys("Mbadiwe 112")

    address2 = driver.find_element(AppiumBy.XPATH, '//android.widget.EditText[@content-desc="Address Line 2 input field"]')
    address2.click()
    address2.send_keys("Entrance 1")

    city = driver.find_element(AppiumBy.XPATH, '//android.widget.EditText[@content-desc="City* input field"]')
    city.click()
    city.send_keys("Ikeja")

    state = driver.find_element(AppiumBy.XPATH, '//android.widget.EditText[@content-desc="State/Region input field"]')
    state.click()
    state.send_keys("Lagos")

    zipcode = driver.find_element(AppiumBy.XPATH, '//android.widget.EditText[@content-desc="Zip Code* input field"]')
    zipcode.click()
    zipcode.send_keys("100123")

    country = driver.find_element(AppiumBy.XPATH, '//android.widget.EditText[@content-desc="Country* input field"]')
    country.click()
    country.send_keys("Nigeria")
    time.sleep(2)

    # Payment page
    payment = driver.find_element(AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="To Payment button"]')
    payment.click()
    time.sleep(2)

    # Assert that you are on the Payment page
    payment_page = driver.find_element(AppiumBy.XPATH, '//android.widget.TextView[@text="Enter a payment method"]')
    assert payment_page.is_displayed(), "Failed to navigate to the Payment page"

    name = driver.find_element(AppiumBy.XPATH, '//android.widget.EditText[@content-desc="Full Name* input field"]')
    name.click()
    name.send_keys("Jane Doe")

    card_no = driver.find_element(AppiumBy.XPATH, '//android.widget.EditText[@content-desc="Card Number* input field"]')
    card_no.click()
    card_no.send_keys("325812657568789")

    expir_date = driver.find_element(AppiumBy.XPATH, '//android.widget.EditText[@content-desc="Expiration Date* input field"]')
    expir_date.click()
    expir_date.send_keys("06/25")

    sec_code = driver.find_element(AppiumBy.XPATH, '//android.widget.EditText[@content-desc="Security Code* input field"]')
    sec_code.click()
    sec_code.send_keys("123")
    time.sleep(2)

    # Review order - scroll to check details
    review = driver.find_element(AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="Review Order button"]')
    review.click()
    time.sleep(2)
    review = driver.find_element(AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="Review Order button"]')
    review.click()
    time.sleep(2)

    action = ActionChains(driver)
    action.w3c_actions.pointer_action.move_to_location(500, 500)
    action.w3c_actions.pointer_action.pointer_down()
    action.w3c_actions.pointer_action.move_to_location(500, 2000)
    action.w3c_actions.pointer_action.release()
    action.perform()
    time.sleep(2)

    # Place the order
    place_order = driver.find_element(AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="Place Order button"]')
    place_order.click()
    time.sleep(3)

    #Assert that the user sees a success message
    success_message = driver.find_element(AppiumBy.XPATH, '//android.widget.TextView[@text="Thank you for your order"]')
    assert success_message.is_displayed(), "Success message not displayed"
    time.sleep(3)

    # Quit driver
    driver.quit()


if __name__ == '__main__':
    main()

