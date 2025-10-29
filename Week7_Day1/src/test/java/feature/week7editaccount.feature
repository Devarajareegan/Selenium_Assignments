Feature: Create an account functionality in Leaftaps application

Scenario Outline: create an account with two datas
Given Enter the userName as 'Demosalesmanager'
And Enter the passWord as 'crmsfa'
When Click on Login button
Then It should navigate to next page
When  Click on Crmsfa link
And Click on Accounts button3
And Click on the find accounts button2
And enter Account Name as <devaraja>
And Click on the Find Accounts button1
And Click on Deva Raja account name
And Click on the Edit button
And Enter the Account name as 'Deva Raja Reegan S'
And Click on the Save button



Examples:
|devaraja|
|Deva Raja Reegan S|