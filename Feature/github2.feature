Feature: NEW TEST
 This is description
   # This is comment

@TEST_NEW
Scenario Outline: open site
  Given Open new https://github.com/krmlsy site2
  Given take new secreenshot2    
  When Click Logout
  Then Close it
  
  Examples:
  |site|
  ||