@PhaseOne
Feature: CRM Contact & Deal Feature

@RegressionTest
Scenario: Create Contact
Given User is LoggedIn
When User create a new contact

@SmokeTest
Scenario: View Contact
Given User is LoggedIn
When User view contact details

Scenario: Update Contact
Given User is LoggedIn
When User update a contact details

@RegressionTest
Scenario: Create Deal
Given User is LoggedIn
When User create a new Deal

@SmokeTest
Scenario: View Deal
Given User is LoggedIn
When User view Deal details

@RegressionTest @SmokeTest
Scenario: Update Deal
Given User is LoggedIn
When User update a Deal details

Scenario: Logout
When User Logout from App
