Feature: Verify ECOM booking flow for one way
As a Corporate user
They want to book flight with one way on ECOM
so that They can book the flight successfully

Background: 
	Given I am on world ticket website 
	And I login corporate user successfully


@B2B
@Oneway
Scenario Outline: Corporate Book with One Way 
	When I select "<TravelType>" for travel type
	And I select "<OriginAirport>" on origin airport 
	And I select "<DestinationAirport>" on destination airport 
	And I select available departure date 
	And I click expand passenger 
	And I select "<No_Adult>" Adult 
	And I select "<No_Child>" Child 
	And I select "<No_Infant>" Infant 
	And I click search button
	Then I am on flight page 
	And I select outbound flight list 
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
		| TravelType	|	OriginAirport 	|  	DestinationAirport 		| 	No_Adult 	  	|	No_Child	|	No_Infant	| 	Payment_Method 				|	
		|	OneWay		|		KRP			|			CPH				|		3			|		3		|		0		|		Debit/Credit			|

@Oneway	
@B2B
@Package
Scenario Outline: Corporate Book one way with package 
	When I select "<TravelType>" for travel type 
	And I select "<OriginAirport>" on origin airport 
	And I select "<DestinationAirport>" on destination airport 
	And I select available departure date 
	And I click expand passenger 
	And I select "<No_Adult>" Adult 
	And I select "<No_Child>" Child 
	And I select "<No_Infant>" Infant 
	And I click search button
	Then I am on flight page 
	And I select outbound flight list 
	And I check information must show as selected on flight page 
	And I click continue button on flight page
	Then I am on passenger page 
	And I fill all information of all passengers 
	And I click continue on passenger page
	Then I am on Package page
	And I select all passenger on package
	And I select one of all packages for outbound
	And I click Go directly to payment on package page
	Then I am on Check out page 
	And I check information on Check out page 
	And I pay with "<Payment_Method>" payment and check agreement 
	Then I check booking is successful 
	
	Examples: 
		| TravelType	|	OriginAirport 	|  	DestinationAirport 		| 	No_Adult 	  	|	No_Child	|	No_Infant	| 	Payment_Method 				|	
		|	OneWay		|		KRP			|			CPH				|		1			|		1		|		0		|		Debit/Credit			|

@Oneway		
@B2B
@Extras
Scenario Outline: Corporate Book one way with extras
	When I select "<TravelType>" for travel type 
	And I select "<OriginAirport>" on origin airport 
	And I select "<DestinationAirport>" on destination airport 
	And I select available departure date 
	And I click expand passenger 
	And I select "<No_Adult>" Adult 
	And I select "<No_Child>" Child 
	And I select "<No_Infant>" Infant 
	And I click search button
	Then I am on flight page 
	And I select outbound flight list 
	And I check information must show as selected on flight page 
	And I click continue button on flight page
	Then I am on passenger page
	And I fill all information of all passengers 
	And I click continue on passenger page
	Then I am on Package page
	And I click continue on package page
	And I am on extras page
	And I select all passenger on extras
	And I select one of all extras for outbound
	And I click Go directly to payment on extras page
	Then I am on Check out page 
	And I check information on Check out page 
	And I pay with "<Payment_Method>" payment and check agreement 
	Then I check booking is successful 
	
	Examples: 
		| TravelType	|	OriginAirport 	|  	DestinationAirport 		| 	No_Adult 	  	|	No_Child	|	No_Infant	| 	Payment_Method 				|
		|	OneWay		|		KRP			|			CPH				|		1			|		1		|		0		|		Debit/Credit			|

@Oneway		
@B2B
@Package
@Extras
Scenario Outline: Corporate Book one way with package and extras
	When I select "<TravelType>" for travel type 
	And I select "<OriginAirport>" on origin airport 
	And I select "<DestinationAirport>" on destination airport 
	And I select available departure date 
	And I click expand passenger 
	And I select "<No_Adult>" Adult 
	And I select "<No_Child>" Child 
	And I select "<No_Infant>" Infant 
	And I click search button
	Then I am on flight page 
	And I select outbound flight list 
	And I check information must show as selected on flight page 
	And I click continue button on flight page
	Then I am on passenger page 
	And I fill all information of all passengers 
	And I click continue on passenger page
	Then I am on Package page
	And I select all passenger on package
	And I select one of all packages for outbound
	And I click continue on package page
	And I am on extras page
	And I select all passenger on extras
	And I select one of all extras for outbound
	And I click Go directly to payment on extras page 
	Then I am on Check out page 
	And I check information on Check out page 
	And I pay with "<Payment_Method>" payment and check agreement 
	Then I check booking is successful 
	
	
	Examples: 
		| TravelType	|	OriginAirport 	|  	DestinationAirport 		| 	No_Adult 	  	|	No_Child	|	No_Infant	| 	Payment_Method 				|
		|	OneWay		|		KRP			|			CPH				|		1			|		1		|		0		|		Debit/Credit			|

@Oneway		
@B2B
@Package
Scenario Outline: Corporate Book One way and buy package after
	When I select "<TravelType>" for travel type
	And I select "<OriginAirport>" on origin airport 
	And I select "<DestinationAirport>" on destination airport 
	And I select available departure date 
	And I click expand passenger 
	And I select "<No_Adult>" Adult 
	And I select "<No_Child>" Child 
	And I select "<No_Infant>" Infant 
	And I click search button
	Then I am on flight page 
	And I select outbound flight list 
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
	And I select one of all packages for outbound
	And I click Go directly to payment on package page
	Then I am on Check out page
	And I check information on Check out page on additional feature
	And I pay with "<Payment_Method>" payment and check agreement 
	Then I check booking is successful 
	
	
	Examples: 
		| TravelType	|	OriginAirport 	|  	DestinationAirport 		| 	No_Adult 	  	|	No_Child	|	No_Infant	| 	Payment_Method 				|
		|	OneWay		|		KRP			|			CPH				|		1			|		1		|		0		|		Debit/Credit			|
		
@Oneway
@B2B
@Extras
Scenario Outline: Corporate Book One way and buy extras after
	When I select "<TravelType>" for travel type
	And I select "<OriginAirport>" on origin airport 
	And I select "<DestinationAirport>" on destination airport 
	And I select available departure date 
	And I click expand passenger 
	And I select "<No_Adult>" Adult 
	And I select "<No_Child>" Child 
	And I select "<No_Infant>" Infant 
	And I click search button
	Then I am on flight page 
	And I select outbound flight list 
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
	And I select one of all extras for outbound
	And I click Continue on extras page
	Then I am on Check out page
	And I check information on Check out page on additional feature 
	And I pay with "<Payment_Method>" payment and check agreement 
	Then I check booking is successful 
	
	
	Examples: 
		| TravelType	|	OriginAirport 	|  	DestinationAirport 		| 	No_Adult 	  	|	No_Child	|	No_Infant	| 	Payment_Method 				|
		|	OneWay		|		KRP			|			CPH				|		1			|		1		|		0		|		Debit/Credit			|

@Oneway
@B2B
@Package
@Extras
Scenario Outline: Corporate Book One way and buy package and extras after
	When I select "<TravelType>" for travel type
	And I select "<OriginAirport>" on origin airport 
	And I select "<DestinationAirport>" on destination airport 
	And I select available departure date 
	And I click expand passenger 
	And I select "<No_Adult>" Adult 
	And I select "<No_Child>" Child 
	And I select "<No_Infant>" Infant 
	And I click search button
	Then I am on flight page 
	And I select outbound flight list 
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
	And I select one of all packages for outbound
	And I click continue on package page
	And I am on extras page
	And I select all passenger on extras
	And I select one of all extras for outbound
	And I click Continue on extras page
	Then I am on Check out page
	And I check information on Check out page on additional feature 
	And I pay with "<Payment_Method>" payment and check agreement 
	Then I check booking is successful 
	
	
	Examples: 
		| TravelType	|	OriginAirport 	|  	DestinationAirport 		| 	No_Adult 	  	|	No_Child	|	No_Infant	| 	Payment_Method 				|
		|	OneWay		|		KRP			|			CPH				|		1			|		1		|		0		|		Debit/Credit			|

@Oneway
@B2B
@Namechange
Scenario Outline: Corporate Book One way and change name
	When I select "<TravelType>" for travel type
	And I select "<OriginAirport>" on origin airport 
	And I select "<DestinationAirport>" on destination airport 
	And I select available departure date 
	And I click expand passenger 
	And I select "<No_Adult>" Adult 
	And I select "<No_Child>" Child 
	And I select "<No_Infant>" Infant 
	And I click search button
	Then I am on flight page 
	And I select outbound flight list 
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
		| TravelType	|	OriginAirport 	|  	DestinationAirport 		| 	No_Adult 	  	|	No_Child	|	No_Infant	| 	Payment_Method 				|	
		|	OneWay		|		KRP			|			CPH				|		1			|		1		|		0		|		Debit/Credit			|
		

@Oneway
@B2B
@Rebook
Scenario Outline: Corporate user Book One way and rebook outbound segment
	When I select "<TravelType>" for travel type
	And I select "<OriginAirport>" on origin airport 
	And I select "<DestinationAirport>" on destination airport 
	And I select available departure date 
	And I click expand passenger 
	And I select "<No_Adult>" Adult 
	And I select "<No_Child>" Child 
	And I select "<No_Infant>" Infant 
	And I click search button
	Then I am on flight page 
	And I select outbound flight list 
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
	And I select available departure date
	And I click search button on change date
	And I select outbound flight list 
	And I click continue button on flight page
	Then I am on Check out page
	And I check information on Check out page
	And I pay with "<Payment_Method>" payment and check agreement 
	Then I check booking is successful 

	
	
	Examples: 
		| TravelType	|	OriginAirport 	|  	DestinationAirport 		| 	No_Adult 	  	|	No_Child	|	No_Infant	| 	Payment_Method 				|	
		|	OneWay		|		KRP			|			CPH				|		1			|		1		|		0		|		Debit/Credit			|



		

