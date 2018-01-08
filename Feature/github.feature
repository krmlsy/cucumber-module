Feature: GITHUB
 This is description
   # This is comment

@TEST
Scenario Outline: open site
  Given Open <site> site
  Given take secreenshot    
  
  Examples:
  |site|
  |https://github.com/krmlsy|