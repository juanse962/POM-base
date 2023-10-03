#Autor: Jessid Cordoba
#language:en

@Login
Feature: Escenarios de la funcionalidad de login
Scenario Outline: Login exitoso
    Given Ingreso A La Web
    |url|
    |<url>|
    When Me Autentico
    |user|pass|
    |<user>|<pass>|
    Then Valido El Ingreso Exitoso
    |username|
    |<username>|
  Examples:
   |url|user|pass|username|
   ##@externaldata@src/test/resources/datadriven/data.xlsx@usuarios
   |https://demoqa.com/login   |admin   |Admin@10   |admin|

