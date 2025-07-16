Feature:  Login Page Automation of Banarasi Saree
Scenario: Check log in is succesfull with valid data
Given User is on login page
When User enters valid mobile no 
And clicks on OTP Button
Then User should be Home Page
And Close the browser