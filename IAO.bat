@echo off
@echo Thanks for using IAMONE. Copyrighted to VUKFactory %1 %2 
echo %1

if "%1" == "WEB" (set suite=IAOSuiteWebConfig.xml)

if "%1" == "ANDROIDWEB" (set suite=IAOSuiteAndroidMobileWebConfig.xml)
if "%1" == "ANDROIDAPP" (set  suite=IAOSuiteAndroidAPPConfig.xml)
if "%1" == "IOSWEB" (set suite=IAOSuiteIOSMobileWebConfig.xml)
if "%1" == "IOSAPP" (set suite=IAOSuiteIOSAPPConfig.xml)

@echo off
cd runner
ant -DTestSuiteDir = "../testConfigs" -DTestSuiteName = "%suite%" -DTestSuiteResult = %2


