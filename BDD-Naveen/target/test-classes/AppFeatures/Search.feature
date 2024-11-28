Feature: Uber Booking app verification

  Scenario: Booking Cab
    Given User wants to select a car type as "SUV" from uber app
    When User select a car type as "SUV" and pickuppoint is "bangalore" and drop at "pune"
    Then Driver starts the journey
    And Driver ends the journey
    And User pays 1000 USD to driver
    
