import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

//Mobile.startApplication('/Users/phuc.truong/Documents/ios-mobile-tests/App/Runner.app', false)

String appPath = new File(RunConfiguration.getProjectDir() + '/' + 'App/Runner.app').getCanonicalPath()
println(appPath)

Mobile.startApplication(appPath, false)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - Open URL'), 0)

Mobile.setText(findTestObject('Object Repository/XCUIElementTypeTextField - Username'), 'John Doe', 0)

Mobile.setText(findTestObject('Object Repository/XCUIElementTypeSecureTextField - Password'), 'ThisIsNotAPassword', 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - Login (1)'), 0)

Mobile.closeApplication()

