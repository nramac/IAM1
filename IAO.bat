@echo off
@echo Thanks for using IAMONE. Copyrighted to VUKFactory %3
echo %1

if "%1" == "WEB" (set suite=IAOSuiteWebConfig.xml)

if %1=="ANDROID" if %2=="WEB" (set suite=IAOSuiteAndroidMobileWebConfig.xml)
if %1=="ANDROID" IF %2=="APP" (set  suite="IAOSuiteAndroidAPPConfig.xml")
if %1=="IOS" if %2=="WEB"	(set suite="IAOSuiteIOSMobileWebConfig.xml")
if %1=="IOS" if %2=="APP" (set suite="IAOSuiteIOSAPPConfig.xml")
cd runner
ant -DTestSuiteDir = "../testConfigs" -DTestSuiteName = "%suite%" -DTestSuiteResult = %2


