Feature: Create an account functionality in Leaftaps application
 
Scenario Outline: create an account with two datas
And Enter the userName as 'Demosalesmanager'
And Enter the passWord as 'crmsfa'
When Click on Login button
Then It should navigate to next page
When  Click on Crmsfa link
And Click on Create Account
And Enter the new accountname as<newaccountname>
When Click on the create Account button
Then It should create a new account 

Examples:
|newaccountname|
|Deva Raja|
|Raja Reegan|