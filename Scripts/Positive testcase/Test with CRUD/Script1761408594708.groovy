import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//WebUI.acceptAlert()
//Get all user
//def responseGet = WS.sendRequestAndVerify(findTestObject('Repository without environment/Get All User'))
//WS.verifyResponseStatusCode(responseGet, 200)

//get single user
//def responseSingle = WS.sendRequestAndVerify(findTestObject('Repository without environment/Get single user'))
//WS.verifyResponseStatusCode(responseSingle, 200)

//Update user
//def responseUpdate = WS.sendRequestAndVerify(findTestObject('Update user (1)'))
//WS.verifyResponseStatusCode(responseUpdate, 200)


//Delete user
def deleteResponse = WS.sendRequestAndVerify(findTestObject('Repository without environment/Delete user'))
WS.verifyResponseStatusCode(deleteResponse, 204)

