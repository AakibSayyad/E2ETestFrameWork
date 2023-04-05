Feature: Udemy login
Scenario: Login into udemy site 
Given Driver is initiated and udemy site is open
When  typed username "johncena@adsasd.com" and password "kkkk"
Then  validate if udemy login working