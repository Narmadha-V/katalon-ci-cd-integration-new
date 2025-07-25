package maverick

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

class EquipmentQuoter {
	@Keyword
	def enterWidth(width) {
		WebUI.click(findTestObject("Object Repository/MAVERICK/MaverickQuoter/Quoter/input_Width_custom-width"))
		WebUI.setText(findTestObject("Object Repository/MAVERICK/MaverickQuoter/Quoter/input_Width_custom-width"),width)
	}
	def enterHeigth(height) {
		WebUI.click(findTestObject("Object Repository/MAVERICK/MaverickQuoter/Quoter/input_Height_custom-height"))
		WebUI.setText(findTestObject("Object Repository/MAVERICK/MaverickQuoter/Quoter/input_Height_custom-height"),height)
	}

	def enterQuantity(qty) {
		WebUI.scrollToElement(findTestObject("Object Repository/MAVERICK/MaverickQuoter/Quoter/button_Continue"), 10)
		WebUI.click(findTestObject("Object Repository/MAVERICK/MaverickQuoter/Quoter/input__quantity"))
		WebUI.waitForElementNotVisible(findTestObject("Object Repository/MAVERICK/MaverickQuoter/Quoter/spinner"),50)
		WebUI.setText(findTestObject("Object Repository/MAVERICK/MaverickQuoter/Quoter/input__quantity"),qty)
	}
	def clickLabelDistribution() {
		WebUI.click(findTestObject("Object Repository/MAVERICK/MaverickQuoter/Quoter/label_distribution"))
	}
	def waitForLoder() {
		WebUI.waitForElementNotVisible(findTestObject("Object Repository/MAVERICK/MaverickQuoter/Quoter/spinner"),50)
	}
	def clickContinueButton() {
		//		scroll to element  button
		WebUI.scrollToElement(findTestObject("Object Repository/MAVERICK/MaverickQuoter/Quoter/button_Continue"), 10)
		WebUI.waitForElementClickable(findTestObject("Object Repository/MAVERICK/MaverickQuoter/Quoter/button_Continue"),30)
		WebUI.click(findTestObject("Object Repository/MAVERICK/MaverickQuoter/Quoter/button_Continue"))
	}
	def waitForDelay() {
		WebUI.waitForPageLoad(40)
		WebUI.delay(3)
	}
	def selectDeclineProof() {
		WebUI.click(findTestObject("Object Repository/MAVERICK/MaverickDetailsPage/decline_proof"))
		WebUI.click(findTestObject("Object Repository/MAVERICK/MaverickDetailsPage/agree_btn"))
	}
	def addToCartWithoutArtwork() {
		WebUI.click(findTestObject("Object Repository/MAVERICK/MaverickDetailsPage/add_to_cart"))
	}
}
