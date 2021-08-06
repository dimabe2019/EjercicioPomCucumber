@stories
  Feature: Academy Choucair
    As a user, I want to learn how to automate in screenplay at the Choucair Academy with the automation course
  @scenario1
  Scenario: Search for a automation course
    Given the diego wants to learn automation at the academy Choucair
    | strUser    | strPassword   |
    | dmartinezb | Choucair2021* |
    When he search for the course Cucumber - SerenityBDD + Screenplay (WEB) on the choucair academy platform
    | strCourse                                 |
    | Cucumber - SerenityBDD + Screenplay (WEB) |
    Then he finds the course called resources Cucumber - SerenityBDD + Screenplay (WEB)
    | strCourse                                 |
    | Cucumber - SerenityBDD + Screenplay (WEB) |