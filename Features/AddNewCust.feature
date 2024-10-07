Feature:Customer

@reqression
Scenario Outline: Add New Costmer
Given User Lanch Chrome Browser
When User open url "<url>"
And User enter Email as "<email>" and password as "<password>"
And User click on Login button
Then User can view Dashboard
When User click on customers menu
And User click on customers menu item
And User User click on new add button
Then User can view add new customer page
When User enter customer info as "<newEmail>" and "<newPass>" and "<fname>" and "<lname>" and "<gender>" and "<comName>" and "<adminComment>"
And User click on save button
Then User can view conformation msg "The new customer has been added successfully"
And close browser

Examples:
| url | email | Password| newEma| newPass | fname| lname| gender| comName| adminComment|
| https://admin-demo.nopcommerce.com/login | adimn@Yourstore.com| admin|raj122@gmail.com| 1234| Bali77| Raj| Male|ABC|Test11|
| https://admin-demo.nopcommerce.com/login | adimn14252@Yourstore.com| admin|radhika133@gmail.com| 4537| | Radhika|Female|xyz|Test2|