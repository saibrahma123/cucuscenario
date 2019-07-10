Feature: not going into cart
Scenario: headphone cannot be bought
Given url is "http://10.232.237.143:443/TestMeApp/fetchcat.htm"
When akhi goes on signin button
And akhi types "lalitha" as usernam
And akhi types "password123" as pasword
And akhi click on login button
And akhi types "headphone" in searchbarr
And akhi click on finddetails button
Then akhi finds for cart symbol