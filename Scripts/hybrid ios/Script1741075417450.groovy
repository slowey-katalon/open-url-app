import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

def projectDir = RunConfiguration.getProjectDir()
Mobile.startApplication(projectDir + "/App/Runner.app", false)


Mobile.tap(findTestObject('Object Repository/Test with pre-prod page/XCUIElementTypeButton - Open the URL'), 0)

Mobile.delay(15)

Mobile.setText(findTestObject('Object Repository/Test with pre-prod page/XCUIElementTypeTextField -  Email Address'), 'test@gmail.com', 0)

Mobile.tap(findTestObject('Object Repository/Test with pre-prod page/XCUIElementTypeButton - Done'), 0)

Mobile.setText(findTestObject('Object Repository/Test with pre-prod page/XCUIElementTypeSecureTextField -  Password'), 'testpassword', 0)

Mobile.tap(findTestObject('Object Repository/Test with pre-prod page/XCUIElementTypeButton - LOGIN'), 0)

Mobile.closeApplication()

WebUI.Load(0)