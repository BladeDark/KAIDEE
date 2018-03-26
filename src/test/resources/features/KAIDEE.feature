Feature: Auto KAIDEE

Background:
	Given I am on kaidee website
	
@Test
Scenario Outline: Add KAIDEE product
	When I click sell button
	And I select category
	And I write topic name "<Topic_Name>"
	And I write price "<Price>"
	And I drop all images
	And I fill product details
	And I select product address
	And I click sell check box
	And I click second hand check box
	Then I click submit
		
		Examples: 
		| Topic_Name																		|		Price 		|	Number 		|
		|	Nike roshe run wolf grey white Size.42.5 ยาว 27									|		790			|	  	1		|
		|  	Adidas Superstar 2014 Made in Indonesia Size.42.5 Oversize 0.5 cm				|		930	      	|	  	2		|
		|	Adidas CHICAGO Made in China Size 42.5 Oversize 0.5 cm							|		870			|		3		|
		|	Adidas Superstar 2015 Made in Indonesia Size 42 Oversize 0.5 cm					|		930			|		4		|
		|	Mizuno Made in Vietnam Size 44.5 ยาว 29 cm											|		890			|		5		|
		|	SKECHERS Air-Cooled 2015 Made in CAMBODIA Size 43 ยาว 28 cm						|		990			|		6		|
		|	Adidas ปี 2016 Made in Indonesia Size 41.5 Oversize 0.5 cm						|		870			|		7		|
		|	Nike Air Max Thea 2015 Size 38.5 ยาว 24.5 cm										|		870			|		8		|
		|	Onitsuka Tiger California 78 VIN Size 39.5 ยาว 25 cm Made in Vietnam				|		890			|		9		|
		|	Onitsuka Tiger Maxico 66 Size 45 ยาว 28.5 cm Made in China							|		870			|		10		|
		|	Asics DYNAMIC DUOMAX Size 44 ยาว28cm Made in China								|		950			|		11		|
		|	Asics Gel GT 2000 Size 43.5 ยาว 27.5 cm Made in Vietnam							|		770			|		12		|
		|	Newbalance VAZEE PRIZM. Size 42.5  ยาว 27 cm										|		870			|		13		|
		|	Nike Cortez Size 44 ยาว 28															|		870			|		14		|
		|	Nike Tanjun ปี 2016 Size 44 ยาว 28 Made in Vitenam									|		770			|		15		|
		|	Nike Jordan Size 46 ยาว 30															|		850			|		16		|
		|	Nike Roshe Run Size 44 ยาว 28 cm													|		870			|		17		|
		|	Nike Roshe Run Size 39 ยาว 25 cm													|		930			|		18		|
		|	Reebok CORDURA Size 39 ยาว 25 cm													|		890			|		19		|
		|	Nike Air MAX 360 Size 40 ยาว 25 cm Made in Indonesia								|		750			|		20		|
		|	Reebox JD ULTRALITE Size 40 ยาว 25.5 cm Made in china มีตำหนิที่พื้นรองเท้าครับ					|		750			|		21		|
		|	Reebok ZPRINT Size 40.5 ยาว 26 cm Made in china									|		770			|		22		|
		|	PUMA TRINOMIC หนังกลับ Size 39 ยาว25 cm Made in Vietnam								|		750			|		23		|
		|	Newbalance ENCAP 530 Size.41.5 ยาว 26 cm Made in Indonesia							|		790			|		24		| 
		|	Nike Air MAX Size 44. ยาว 28 cm Made in Vietnam มีงานเก็บสีด้านข้างและหลังส้นเท้า					|		690			|		25		|
		|	Newbalance 574 Size 44 ยาว 28 cm Made in Vietnam									|		590			|		26		|
		|	Nike Air Max Excellerate 4 Runing Size 44.5 ยาว 28.5 cm							|		1200		|		27		|
		|	Nike Trifusion run Size 42.5 ยาว27 Made in Vitenam								|		720			|		28		|
		|	Nike SB Size 42.5 ยาว 27 cm Made in Indonesia										|		750			|		29		|
		|	Nike Air ปี2016 Size 42 ยาว 26.5 Made in Indonesia									|		790			|		30		|
		|	Nike Dual Fusion Run 3 ปี 2015 Size 40 ยาว 25cm										|		670			|		31		|
		|	Asic GEL-J EVO Size 44 ยาว 28 cm													|		790			|		32		|
		|	Adidas ปี2016 Size 43.5 ยาว 27.5 คู่นี้มีตำหนิข้างในตรงส้นเล็กน้อยไม่มีผลการใช้งานครับ							|		670			|		33		|
		|	Adidas Size 41.5 ยาว 26 cm															|		650			|		34		|
		|	Nike Zoom winflo2 Size 42.5 ยาว 27 cm มีตำหนิแค่ลอยถลอกขอบส้นรองเท้าเล็กน้อยเท่านั้นครับ					|		750			|		35		|
		|	REEBOX 3D ULTRA LITE Size 41 ยาว27 cm สวยใหม่มากครับ									|		790			|		36		|
		|	Nike DARTX 1 Size 44 ยาว 28 cm														|		670			|		37		|
		
		