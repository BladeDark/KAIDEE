Feature: Verify ECOM for missellaneous scenarios

Background: 
	Given I am on world ticket website

@Test
@etc
Scenario Outline: Login with rloc/lastname 
	When I select "<TravelType>" for travel type 
	And I select "<OriginAirport>" on origin airport 
	And I select "<DestinationAirport>" on destination airport 
	And I select available departure date 
	And I select available return date 
	And I click expand passenger
	And I select "<No_Adult>" Adult
	And I select "<No_Child>" Child 
	And I select "<No_Infant>" Infant
	And I click search button
	Then I am on flight page 
	And I select outbound flight list 
	And I select inbound flight list
	And I check information must show as selected on flight page 
	And I click continue button on flight page
	Then I am on passenger page
	And I click proceed as a guest
	And I fill all information of all passengers 
	And I click Go directly to payment on passenger page
	Then I am on Check out page 
	And I check information on Check out page 
	And I pay with "<Payment_Method>" payment and check agreement 
	Then I check booking is successful 
	And I Login with rloc and lastname
	Then I click logout
	
	
	
	Examples: 
		| TravelType	|	OriginAirport 	|  	DestinationAirport 		| 	No_Adult  |		No_Child	| 	No_Infant	|	Payment_Method 				|
		|  	Return		|		KRP	      	|			CPH 	    	|     	3 	  |  		0		|		0		|		CASH					|