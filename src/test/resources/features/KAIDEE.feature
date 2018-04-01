Feature: Auto KAIDEE

Background:
	Given I am on kaidee website
	
@Insert
Scenario Outline: Add KAIDEE product
	When I click sell button
	And I select "<Category>" category
	And I write topic name "<Topic_Name>"
	And I write price "<Price>"
	And I drop all images
	And I fill product details
	And I select product address
	And I click sell check box
	And I click second hand check box
	Then I click submit
		
		Examples: 
		| Topic_Name																		|		Price 		|		Category		|	Number 		|
		|  	Adidas Superstar 2014 Made in Indonesia Size.42.5 Oversize 0.5 cm				|		930	      	|	  	Male			|		2		|
		|	Adidas CHICAGO Made in China Size 42.5 Oversize 0.5 cm							|		870			|		Male			|		3		|
		|	Adidas Superstar 2015 Made in Indonesia Size 42 Oversize 0.5 cm					|		930			|		Male			|		4		|
		|	Mizuno Made in Vietnam Size 44.5 ยาว 29 cm											|		890			|		Male			|		5		|
		|	SKECHERS Air-Cooled 2015 Made in CAMBODIA Size 43 ยาว 28 cm						|		990			|		Male			|		6		|
		|	Adidas ปี 2016 Made in Indonesia Size 41.5 Oversize 0.5 cm						|		870			|		Male			|		7		|
		|	Nike Air Max Thea 2015 Size 38.5 ยาว 24.5 cm										|		870			|		Female			|		8		|
		|	Onitsuka Tiger California 78 VIN Size 39.5 ยาว 25 cm Made in Vietnam				|		890			|		Female			|		9		|
		|	Onitsuka Tiger Maxico 66 Size 45 ยาว 28.5 cm Made in China							|		870			|		Male			|		10		|
		|	Asics DYNAMIC DUOMAX Size 44 ยาว28cm Made in China								|		950			|		Male			|		11		|
		|	Asics Gel GT 2000 Size 43.5 ยาว 27.5 cm Made in Vietnam							|		770			|		Male			|		12		|
		|	Newbalance VAZEE PRIZM. Size 42.5  ยาว 27 cm										|		870			|		Male			|		13		|
		|	Nike Cortez Size 44 ยาว 28															|		870			|		Male			|		14		|
		|	Nike Tanjun ปี 2016 Size 44 ยาว 28 Made in Vitenam									|		770			|		Male			|		15		|
		|	Nike Jordan Size 46 ยาว 30															|		850			|		Male			|		16		|
		|	Nike Roshe Run Size 44 ยาว 28 cm													|		870			|		Male			|		17		|
		|	Nike Roshe Run Size 39 ยาว 25 cm													|		930			|		Female			|		18		|
		|	Reebok CORDURA Size 39 ยาว 25 cm													|		890			|		Female			|		19		|
		|	Nike Air MAX 360 Size 40 ยาว 25 cm Made in Indonesia								|		750			|		Female			|		20		|
		|	Reebox JD ULTRALITE Size 40 ยาว 25.5 cm Made in china มีตำหนิที่พื้นรองเท้าครับ					|		750			|		Female			|		21		|
		|	Reebok ZPRINT Size 40.5 ยาว 26 cm Made in china									|		770			|		Male			|		22		|
		|	PUMA TRINOMIC หนังกลับ Size 39 ยาว25 cm Made in Vietnam								|		750			|		Female			|		23		|
		|	Newbalance ENCAP 530 Size.41.5 ยาว 26 cm Made in Indonesia							|		790			|		Male			|		24		| 
		|	Nike Air MAX Size 44. ยาว 28 cm Made in Vietnam มีงานเก็บสีด้านข้างและหลังส้นเท้า					|		690			|		Male			|		25		|
		|	Newbalance 574 Size 44 ยาว 28 cm Made in Vietnam									|		590			|		Male			|		26		|
		|	Nike Air Max Excellerate 4 Runing Size 44.5 ยาว 28.5 cm							|		1200		|		Male			|		27		|
		|	Nike Trifusion run Size 42.5 ยาว27 Made in Vitenam								|		720			|		Male			|		28		|
		|	Nike SB Size 42.5 ยาว 27 cm Made in Indonesia										|		750			|		Male			|		29		|
		|	Nike Air ปี2016 Size 42 ยาว 26.5 Made in Indonesia									|		790			|		Male			|		30		|
		|	Nike Dual Fusion Run 3 ปี 2015 Size 40 ยาว 25cm										|		670			|		Female			|		31		|
		|	Asic GEL-J EVO Size 44 ยาว 28 cm													|		790			|		Male			|		32		|
		|	Adidas Size 41.5 ยาว 26 cm															|		650			|		Male			|		34		|
		|	REEBOX 3D ULTRA LITE Size 41 ยาว27 cm สวยใหม่มากครับ									|		790			|		Male			|		36		|
		|	Nike DARTX 1 Size 44 ยาว 28 cm														|		670			|		Male			|		37		|
		|	Nike AIR 2015 Size 40.5 ยาว 26 cm													|		750			|		Male			|		38		|
		|	Nike 2017 Size 42.5 ยาว 27 cm														|		670			|		Male			|		39		|
		|	Nike SB CHECK Size 42 ยาว 26.5 cm													|		790			|		Male			|		40		|
		

@Remove
Scenario: Add KAIDEE product
	And I remove my advert
	