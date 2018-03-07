Feature: Verify ECOM booking flow for connected flight
As a Member
They want to book flight on ECOM
so that They can book the flight successfully

Background: 
	Given I am on world ticket website 
	And I login normal user successfully
	
@Connected_Flight
@Roundtrip
Scenario Outline: Member Book Return in connected flight
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
	And I fill all information of all passengers 
	And I click Go directly to payment on passenger page
	Then I am on Check out page 
	And I check information on Check out page 
	And I pay with "<Payment_Method>" payment and check agreement 
	Then I check booking is successful 
	
	
	Examples: 
		| TravelType	|	OriginAirport 	|  	DestinationAirport 		| 	No_Adult  |		No_Child	| 	No_Infant	|	Payment_Method 				|	
		|  	Return		|		KRP	      	|			RNN 	    	|     	1 	  |  		0		|		0		|		CASH					|
		|  	Return		|		KRP	      	|			RNN 	    	|     	1 	  |  		1		|		1		|		CASH					|
		|  	Return		|		KRP	      	|			RNN 	    	|     	1 	  |  		1		|		1		|		DIBS					|
		


@Connected_Flight
@Roundtrip
@UMNR
Scenario Outline: UMNR Book Return in connected flight
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
	And I fill all information of all passengers 
	And I click Go directly to payment on passenger page
	Then I am on Check out page 
	And I check information on Check out page 
	And I pay with "<Payment_Method>" payment and check agreement 
	Then I check booking is successful 
	
	
	Examples: 
		| TravelType	|	OriginAirport 	|  	DestinationAirport 		| 	No_Adult  |		No_Child	| 	No_Infant	|	Payment_Method 				|	
		|  	Return		|		KRP	      	|			RNN 	    	|     	0 	  |  		3		|		0		|		CASH					|
		

@Roundtrip
@Package
@Connected_Flight
Scenario Outline: Member Book Return with package for connected flight
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
	And I fill all information of all passengers 
	And I click continue on passenger page
	Then I am on Package page
	And I select all passenger on package
	And I select one of all packages for first route
	And I change to second route tab on package
	And I select one of all packages for second route
	And I change to third route tab on package
	And I select one of all packages for third route
	And I change to fourth route tab on package
	And I select one of all packages for fourth route
	And I click Go directly to payment on package page
	Then I am on Check out page 
	And I check information on Check out page 
	And I pay with "<Payment_Method>" payment and check agreement 
	Then I check booking is successful 
	
	
	Examples: 
		| TravelType	|	OriginAirport 	|  	DestinationAirport 		| 	No_Adult  |		No_Child	| 	No_Infant	|	Payment_Method 				|	
		|  	Return		|		KRP	      	|			RNN 	    	|     	1 	  |  		1		|		0		|		CASH					|
		|  	Return		|		KRP	      	|			RNN 	    	|     	1 	  |  		1		|		0		|		DIBS					|
	
@Roundtrip
@Extras
@Connected_Flight
Scenario Outline: Member Book Return with extra for connected flight
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
	And I fill all information of all passengers 
	And I click continue on passenger page
	Then I am on Package page
	And I click continue on package page
	And I am on extras page
	And I select all passenger on extras
	And I select one of all extras for first route
	And I change to second route tab on extras
	And I select one of all extras for second route
	And I change to third route tab on extras
	And I select one of all extras for third route
	And I change to fourth route tab on extras
	And I select one of all extras for fourth route 
	And I click Go directly to payment on extras page
	Then I am on Check out page 
	And I check information on Check out page 
	And I pay with "<Payment_Method>" payment and check agreement 
	Then I check booking is successful 
	
	
	Examples: 
		| TravelType	|	OriginAirport 	|  	DestinationAirport 		| 	No_Adult  |		No_Child	| 	No_Infant	|	Payment_Method 				|	
		|  	Return		|		KRP      	|			RNN 	    	|     	1 	  |  		1		|		0		|		CASH					|
		|  	Return		|		KRP	      	|			RNN 	    	|     	1 	  |  		1		|		0		|		DIBS					|
@Test	
@Roundtrip
@Package
@Extras
@Connected_Flight
Scenario Outline: Member Book Return with package and extra for connected flight
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
	And I fill all information of all passengers 
	And I click continue on passenger page
	Then I am on Package page
	And I select all passenger on package
	And I select one of all packages for first route
	And I change to second route tab on package
	And I select one of all packages for second route
	And I change to third route tab on package
	And I select one of all packages for third route
	And I change to fourth route tab on package
	And I select one of all packages for fourth route
	And I click continue on package page
	And I am on extras page
	And I select all passenger on extras
	And I select one of all extras for first route
	And I change to second route tab on extras
	And I select one of all extras for second route
	And I change to third route tab on extras
	And I select one of all extras for third route
	And I change to fourth route tab on extras
	And I select one of all extras for fourth route 
	And I click Go directly to payment on extras page
	Then I am on Check out page 
	And I check information on Check out page 
	And I pay with "<Payment_Method>" payment and check agreement 
	Then I check booking is successful 
	
	
	Examples: 
		| TravelType	|	OriginAirport 	|  	DestinationAirport 		| 	No_Adult  |		No_Child	| 	No_Infant	|	Payment_Method 				|	
		|  	Return		|		KRP	      	|			RNN 	    	|     	1 	  |  		1		|		0		|		CASH					|
		|  	Return		|		KRP	      	|			RNN 	    	|     	1 	  |  		1		|		0		|		DIBS					|