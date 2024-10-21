Feature: register test on demoPage.com
  Scenario Outline: As a "<description>" I want to get corresponding web validation "<message>"
    Given user open the url demoPage.com
    When user send the credentials username "<userName>" and password "<password>"
    And user user click on button PIM and check button create login details
    And send data on fills and click on button save
    Then user can see the username on display

    Examples:
      |userName|password|fullName|idEmployee|description|message|
      |testChoc|TestCh1+|Testing |250       |register valid|Testing|