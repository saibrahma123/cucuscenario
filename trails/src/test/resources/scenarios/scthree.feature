Feature: login with buying a headphone
Scenario: headphone bought succesfully
Given url of test "http://10.232.237.143:443/TestMeApp/fetchcat.htm"
When ram clicks on signin button
And ram enters "lalitha" as username	
And ram enter "password123" as password
And ram clicks on login button
And ram enters "headphone" in the search bar
And ram clicks on finddetails button
And ram clicks on addtocard button
And ram clicks on cart button
And ram clicks on checkout buton
And ram clicks on procedtopay button
And ram selects type of bank
And ram clicks on continue button
And ram enter "123458" as user	
And ram enter "Pass@458" as pwd
And ram clicks on logon button
And ram enter "Trans@458" as transactionid
And ram clicks on paynow
Then ram check for order details page
 


