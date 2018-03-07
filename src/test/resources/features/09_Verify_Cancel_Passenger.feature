Feature: Verify ECOM Cancel passenger flow
As a Member
They want to cancel flight for specific passenger
so that They can cancel flight for specific passenger successfully

Background: 
	Given I am on world ticket website 
	And I login normal user successfully
	
@Normal_User
@Roundtrip
@Cancel_Passenger
Scenario Outline: Member Book Round trip and cancel only outbound segment
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
	And I click Manage Booking on Thank you page
	Then I am on Manage Booking page
	And I click on cancel flight on Manage Booking Page
	And I click cancel outbound flight on cancelled form
	Then I click Yes on cancelled flight form

	Examples: 
		| TravelType	|	OriginAirport 	|  	DestinationAirport 		| 	No_Adult 	  	|	No_Child	|	No_Infant	| 	Payment_Method 				|	
		|  	Return		|		KRP	      	|			CPH 	    	|     	1 	  		|  		1		|		1		|		CASH					|