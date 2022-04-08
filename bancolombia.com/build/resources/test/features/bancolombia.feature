# Autor: Karina Bocanegra
@stories
Feature: As a user of the Bancolombia application, I want to verify the operation of the simulation screen of Canon Financiero
  I need to simulate the study of a housing leasing credit, according to the value of the house
  To request a credit

  @stories1
  Scenario:simulate a home loan
    Given than Karina enter Bancolombia's escrow account
    When select the housing leasing product
    And performs the credit simulation
    Then you can view credit rates and fees
