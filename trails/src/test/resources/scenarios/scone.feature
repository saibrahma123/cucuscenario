Feature: Register user for TestMeApp website
Scenario: succesfull registration
Given url of TestMeApp "http://10.232.237.143:443/TestMeApp/fetchcat.htm"
When user clicks on signup button
And user types "onetwothree" as username
And user types "greatkhali" as firstname
And user types "sixsix" as lastname
And user types "balajione23" as password
And user types "balajione23" as confirmpassword
And user selects male as gender
And user types "sai123crram@gmail.com" as emailid
And user types "1234569870" as mobilenumber
And user types "27/04/1998" dateofbirth
And user types "vt colony" as address
And user selects the security question
And user enter "rama" as security answer
Then user clicks on register button
