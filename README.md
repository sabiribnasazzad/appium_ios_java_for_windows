Overview: This Git repository is dedicated to running Appium tests for iOS applications using a Windows environment. It's specifically tailored for Research and Development purposes, utilizing Sauce Labs for virtual iOS devices.

Usage Instructions

BaseIOSTest.java: This file serves as the entry point for running the tests. Execute this file to connect with Sauce Labs and launch the demo application.
Demo Application: Prior to running tests, ensure that the demo application is uploaded to Sauce Labs. This application will be used during testing.
Test History: All test history will be recorded under Sauce Labs, providing a comprehensive record of test executions.

Configuration
Before running tests, ensure that the DesiredCapabilities() function is properly configured according to the specifications of Sauce Labs or any similar virtual iOS provider. Update the following capabilities as necessary:

1. app directory
2. device name
3. platform version
4. username
5. accesskey
6. platformName

Please note that to utilize Sauce Labs or similar services, users must have a subscription and pay the required subscription fee.
