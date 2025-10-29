Feature: Create an account functionality in Leaftaps application

Scenario Outline: create an account with two datas
And Enter the userName as 'Demosalesmanager'
And Enter the passWord as 'crmsfa'
When Click on Login button
Then It should navigate to next page
When  Click on Crmsfa link
And Click on Accounts button
And Click on the find accounts button
And enter the Account Name as <devarajareegan>
And Click on the Find Accounts button
And Click on the Deva Raja account name
And Click on Deactivate account button
Then The Account name should be deleted

Examples:
|devarajareegan|
|Deva Raja Reegan S|