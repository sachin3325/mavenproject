Feature: Maret Website Testing

Scenario Outline: Testing Signin functionality
    Given the user enters sigin page by clicking SignIn Buttton
    When the user enters the "<Username>"  and "<Password>"
    Then the User clicks the Login button
    And User gets the results depends upon the credentials

    Examples: 
      | Username  | Password |
      
      | sachinanand584@gmail.com|Sachin@16| 
      |     |     | 
      |sachin001@gmail.com|Sac#679|
      |sachin3300@gmail.com|12345678|
      |sachintesting001@gmail.com|testing|
      |sachinanand584@gmail.com|1213@@rteg|
      |sachinanand584@gmail.com|12356reTgi| 
      |     |Sachin@16|
      |sachinanand584@gmail.com|    |
      |sachinanand584|Sachin@16|
      
            
      
      
