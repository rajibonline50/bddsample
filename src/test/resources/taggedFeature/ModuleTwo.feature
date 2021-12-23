@PhaseTwo
Feature: CRM Tasks Feature

Background: User Login
Given User is LoggedIn

@RegressionTest
Scenario: Create Tasks
When User create a new Tasks

Scenario: View Tasks
When User view Tasks details

@SmokeTest
Scenario: Update Tasks
When User update a Tasks details

#Hook-->background-->scenario

