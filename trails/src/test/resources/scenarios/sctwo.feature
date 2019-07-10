Feature: Valid Login Page
Scenario Outline: login succesfully
Given url of TestMe "http://10.232.237.143:443/TestMeApp/fetchcat.htm"
When userone moves to signin button
And userone writes "<username>" as username
And userone writes "<password>" as password
Then userone moves on login button

Examples:

|username|password|
|siddhuart|Siddhu123|
|lalitha|password123|