@echo off
set path=C:\Users\ZaZa\.m2\repository\allure\allure-2.17.3\bin;C:\Program Files\Java\jdk-17.0.3\bin;%path%
allure serve allure-results
pause
exit