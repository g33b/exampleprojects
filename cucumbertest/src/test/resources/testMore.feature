Feature: test main with params
  Scenario Outline: Make sure doTest gives us the correct output
    Given We pass "<input>" to doTest
    When we run the doTest method
    Then we get "<output>"
    Examples:
    |input|output|
    |1    |test1 |
    |2    |test2 |


