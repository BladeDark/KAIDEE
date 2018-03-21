Feature: Verify ECOM booking fllow for UMNR

Background: 
	Given I am on world ticket website 
	And I login normal user successfully
	

@Roundtrip
@UMNR
Scenario Outline: UMNR book return in normal case
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
		|  	Return		|		KRP	      	|			CPH 	    	|     	0 	  |  		3		|		0		|		DIBS					|

@Roundtrip
@UMNR
@Package
Scenario Outline: UMNR Book Return with package
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
	And I click Go directly to payment on package page
	Then I am on Check out page 
	And I check information on Check out page 
	And I pay with "<Payment_Method>" payment and check agreement 
	Then I check booking is successful 
	
	
	Examples: 
		| TravelType	|	OriginAirport 	|  	DestinationAirport 		| 	No_Adult  |		No_Child	| 	No_Infant	|	Payment_Method 				|	
		|  	Return		|		KRP	      	|			CPH 	    	|     	0 	  |  		3		|		0		|		DIBS					|
		
@Roundtrip
@UMNR
@Extras
Scenario Outline: UMNR Book Return with extra
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
	And I click Go directly to payment on extras page
	Then I am on Check out page 
	And I check information on Check out page 
	And I pay with "<Payment_Method>" payment and check agreement 
	Then I check booking is successful 
	
	
	Examples: 
		| TravelType	|	OriginAirport 	|  	DestinationAirport 		| 	No_Adult  |		No_Child	| 	No_Infant	|	Payment_Method 				|	
		|  	Return		|		KRP	      	|			CPH 	    	|     	0 	  |  		3		|		0		|		DIBS					|
		
@Roundtrip
@UMNR
@Package
@Extras
Scenario Outline: UMNR Book Return with package and extra
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
	And I click continue on package page
	And I am on extras page
	And I select all passenger on extras
	And I select one of all extras for first route
	And I change to second route tab on extras
	And I select one of all extras for second route
	And I click Go directly to payment on extras page
	Then I am on Check out page 
	And I check information on Check out page 
	And I pay with "<Payment_Method>" payment and check agreement 
	Then I check booking is successful 
	
	
	Examples: 
		| TravelType	|	OriginAirport 	|  	DestinationAirport 		| 	No_Adult  |		No_Child	| 	No_Infant	|	Payment_Method 				|	
		|  	Return		|		KRP	      	|			CPH 	    	|     	0 	  |  		3		|		0		|		DIBS					|
		
		
@Roundtrip
@UMNR
@Package
Scenario Outline: UMNR Book Return and buy package after
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
	And I click on buy extras on Manage Booking Page
	Then I am on Package page
	And I select all passenger on package
	And I select one of all packages for first route
	And I change to second route tab on package
	And I select one of all packages for second route
	And I click Go directly to payment on package page
	Then I am on Check out page
	And I check information on Check out page on additional feature 
	And I pay with "<Payment_Method>" payment and check agreement 
	Then I check booking is successful 
	
	
	Examples: 
		| TravelType	|	OriginAirport 	|  	DestinationAirport 		| 	No_Adult  |		No_Child	| 	No_Infant	|	Payment_Method 				|	
		|  	Return		|		KRP	      	|			CPH 	    	|     	0 	  |  		3		|		0		|		DIBS					|

		
@Roundtrip
@UMNR
@Extras
Scenario Outline: UMNR Book Return and buy extras after
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
	And I click on buy extras on Manage Booking Page
	Then I am on Package page
	And I click continue on package page
	And I am on extras page
	And I select all passenger on extras
	And I select one of all extras for first route
	And I change to second route tab on extras
	And I select one of all extras for second route 
	And I click Continue on extras page
	Then I am on Check out page
	And I check information on Check out page on additional feature 
	And I pay with "<Payment_Method>" payment and check agreement 
	Then I check booking is successful 
	
	
	Examples: 
		| TravelType	|	OriginAirport 	|  	DestinationAirport 		| 	No_Adult  |		No_Child	| 	No_Infant	|	Payment_Method 				|	
		|  	Return		|		KRP	      	|			CPH 	    	|     	0 	  |  		3		|		0		|		DIBS					|

@Roundtrip
@UMNR
@Package
@Extras
Scenario Outline: UMNR Book Return and buy package and extras after
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
	And I click on buy extras on Manage Booking Page
	Then I am on Package page
	And I select all passenger on package
	And I select one of all packages for first route
	And I change to second route tab on package
	And I select one of all packages for second route
	And I click continue on package page
	And I am on extras page
	And I select all passenger on extras
	And I select one of all extras for first route
	And I change to second route tab on extras
	And I select one of all extras for second route
	And I click Continue on extras page
	Then I am on Check out page
	And I check information on Check out page on additional feature 
	And I pay with "<Payment_Method>" payment and check agreement 
	Then I check booking is successful 
	
	Examples: 
		| TravelType	|	OriginAirport 	|  	DestinationAirport 		| 	No_Adult  |		No_Child	| 	No_Infant	|	Payment_Method 				|	
		|  	Return		|		KRP	      	|			CPH 	    	|     	0 	  |  		3		|		0		|		DIBS					|

		
@Roundtrip
@UMNR
@Namechange
Scenario Outline: UMNR Book Return and change name all passenger
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
	And I click on change name on Manage Booking Page
	And I select all passenger on change name form
	And I change name for all passengers
	And I click Go directly to payment on passenger page
	Then I am on Check out page
	And I check information on Check out page on additional feature
	And I pay with "<Payment_Method>" payment and check agreement 
	Then I check booking is successful 
	
	Examples: 
		| TravelType	|	OriginAirport 	|  	DestinationAirport 		| 	No_Adult  |		No_Child	| 	No_Infant	|	Payment_Method 				|	
		|  	Return		|		KRP	      	|			CPH 	    	|     	0 	  |  		3		|		0		|		DIBS					|
		
		
@Roundtrip
@UMNR
@Namechange
Scenario Outline: UMNR Book Return and change name only one passenger
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
	And I click on change name on Manage Booking Page
	And I select one passenger on change name form
	And I change name for all passengers
	And I click Go directly to payment on passenger page
	Then I am on Check out page
	And I check information on Check out page on additional feature
	And I pay with "<Payment_Method>" payment and check agreement 
	Then I check booking is successful 
	
	Examples: 
		| TravelType	|	OriginAirport 	|  	DestinationAirport 		| 	No_Adult  |		No_Child	| 	No_Infant	|	Payment_Method 				|	
		|  	Return		|		KRP	      	|			CPH 	    	|     	0 	  |  		3		|		0		|		DIBS					|
	


@Roundtrip
@UMNR
@Rebook
Scenario Outline: UMNR Book Round trip and rebook only outbound segment
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
	And I click on change date on Manage Booking Page
	And I click outbound segment on change date form
	And I click Yes on rebook form
	And I click departure date on booking form
	And I select available departure date for change date
	And I click search button on change date
	And I select outbound flight list 
	And I click continue button on flight page
	Then I am on Check out page
	And I check information on Check out page 
	And I pay with "<Payment_Method>" payment and check agreement 
	Then I check booking is successful 

	Examples: 
		| TravelType	|	OriginAirport 	|  	DestinationAirport 		| 	No_Adult 	  	|	No_Child	|	No_Infant	| 	Payment_Method 				|	
		|  	Return		|		KRP	      	|			CPH 	    	|     	0 	  		|  		3		|		0		|		DIBS					|

		
@Roundtrip
@UMNR
@Rebook
Scenario Outline: UMNR Book Round trip and rebook only inbound segment
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
	And I click on change date on Manage Booking Page
	And I click inbound segment on change date form
	And I click Yes on rebook form
	And I click return date on booking form
	And I select available return date for change date
	And I click search button on change date
	And I select inbound flight list
	And I click continue button on flight page
	Then I am on Check out page
	And I check information on Check out page 
	And I pay with "<Payment_Method>" payment and check agreement 
	Then I check booking is successful 

	Examples: 
		| TravelType	|	OriginAirport 	|  	DestinationAirport 		| 	No_Adult 	  	|	No_Child	|	No_Infant	| 	Payment_Method 				|	
		|  	Return		|		KRP	      	|			CPH 	    	|     	0 	  		|  		3		|		0		|		DIBS					|


@Roundtrip
@UMNR
@Rebook
Scenario Outline: UMNR Book Round trip and rebook outbound and inbound segment
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
	And I click on change date on Manage Booking Page
	And I click outbound segment on change date form
	And I click inbound segment on change date form
	And I click Yes on rebook form
	And I click departure date on booking form
	And I select available departure date for change date
	And I click return date on booking form
	And I select available return date for change date
	And I click search button on change date
	And I select outbound flight list 
	And I select inbound flight list
	And I click continue button on flight page
	Then I am on Check out page
	And I check information on Check out page 
	And I pay with "<Payment_Method>" payment and check agreement 
	Then I check booking is successful 

	Examples: 
		| TravelType	|	OriginAirport 	|  	DestinationAirport 		| 	No_Adult 	  	|	No_Child	|	No_Infant	| 	Payment_Method 				|	
		|  	Return		|		KRP	      	|			CPH 	    	|     	0 	  		|  		3		|		0		|		DIBS					|
	
		
@Roundtrip
@UMNR
@Cancel_Segment
Scenario Outline: UMNR Book Round trip and cancel only outbound segment
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
		|  	Return		|		KRP	      	|			CPH 	    	|     	0	  		|  		3		|		0		|		DIBS					|
		
	
@Roundtrip
@UMNR
@Cancel_Segment
Scenario Outline: UMNR Book Round trip and cancel only inbound segment
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
	And I click cancel inbound flight on cancelled form
	Then I click Yes on cancelled flight form

	Examples: 
		| TravelType	|	OriginAirport 	|  	DestinationAirport 		| 	No_Adult 	  	|	No_Child	|	No_Infant	| 	Payment_Method 				|	
		|  	Return		|		KRP	      	|			CPH 	    	|     	0 	  		|  		3		|		0		|		DIBS					|
		
@Roundtrip
@UMNR
@Cancel_Booking
Scenario Outline: UMNR Book Round trip and cancel booking
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
	And I click on cancel booking on Manage Booking Page
	Then I click Yes on cancelled booking form

	Examples: 
		| TravelType	|	OriginAirport 	|  	DestinationAirport 		| 	No_Adult 	  	|	No_Child	|	No_Infant	| 	Payment_Method 				|	
		|  	Return		|		KRP	      	|			CPH 	    	|     	0 	  		|  		3		|		0		|		DIBS					|
		
