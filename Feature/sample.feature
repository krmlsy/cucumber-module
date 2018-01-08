Feature: Belly
 This is description
   # This is comment

@Regression
Scenario Outline: a few cukes
  Given I have <cukes> cukes in my belly
  When I wait <hour> hour
  Then My belly should be:<sound>

  Examples:
    | cukes    | hour   |  sound   |
    |    32    |  2     |  silent  |
    |    45    |  4     |  growl   |

@KKB_TST
  Scenario Outline: a few cukes2
    Given I have <cukes> cukes in my kelly
    
      Examples:
    | cukes    |
    |    32    |
    |    45    | 
    |    55    |
    |    21    | 
    |    21    |

@KKB
  Scenario Outline: a few cukes
    Given I have <cukes> cukes in my kelly
    
      Examples:
    | cukes    |
    |    32    |
    |    45    | 
    |    21    |