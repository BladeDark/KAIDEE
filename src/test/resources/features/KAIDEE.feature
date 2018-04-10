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
		|	MIZUNO Made in VIETNAM SizE 44.5 ยาว 29 cm											|		890			|		Male			|		5		|
		|	ADIDAS ปี 2016 Made in Indonesia SizE 41.5 OverSizE 0.5 cm						|		870			|		Male			|		7		|
		|	NIKE Air Max Thea 2015 SizE 38.5 ยาว 24.5 cm										|		870			|		Female			|		8		|
		|	ONITSUKA Tiger California 78 VIN SizE 39.5 ยาว 25 cm Made in Vietnam				|		890			|		Female			|		9		|
		|	ONITSUKA Tiger Maxico 66 SizE 45 ยาว 28.5 cm Made in China							|		870			|		Male			|		10		|
		|	ASICS DYNAMIC DUOMAX SizE 44 ยาว28cm Made in China								|		950			|		Male			|		11		|
		|	ASICS Gel GT 2000 SizE 43.5 ยาว 27.5 cm Made in Vietnam							|		830			|		Male			|		12		|
		|	NEWBALANCE VAZEE PRIZM. SizE 42.5  ยาว 27 cm										|		870			|		Male			|		13		|
		|	NIKE Jordan SizE 46 ยาว 30															|		850			|		Male			|		16		|
		|	NIKE Roshe Run SizE 39 ยาว 25 cm													|		930			|		Female			|		18		|
		|	REEBOK CORDURA SizE 39 ยาว 25 cm													|		890			|		Female			|		19		|
		|	NIKE Air MAX 360 SizE 40 ยาว 25 cm Made in Indonesia								|		870			|		Female			|		20		|
		|	REEBOK JD ULTRALITE SizE 40 ยาว 25.5 cm Made in china มีตำหนิที่พื้นรองเท้าครับ					|		840			|		Female			|		21		|
		|	REEBOK ZPRINT SizE 40.5 ยาว 26 cm Made in china									|		840			|		Male			|		22		|
		|	PUMA TRINOMIC หนังกลับ SizE 39 ยาว25 cm Made in Vietnam								|		840			|		Female			|		23		|
		|	NEWBALANCE ENCAP 530 SizE.41.5 ยาว 26 cm Made in Indonesia							|		840			|		Male			|		24		| 
		|	NIKE Air MAX SizE 44. ยาว 28 cm Made in Vietnam มีงานเก็บสีด้านข้างและหลังส้นเท้า					|		830			|		Male			|		25		|
		|	NIKE Trifusion run SizE 42.5 ยาว27 Made in Vitenam								|		820			|		Male			|		28		|
		|	NIKE SB SizE 42.5 ยาว 27 cm Made in Indonesia										|		820			|		Male			|		29		|
		|	NIKE Air ปี2016 SizE 42 ยาว 26.5 Made in Indonesia									|		790			|		Male			|		30		|
		|	NIKE Dual Fusion Run 3 ปี 2015 SizE 40 ยาว 25cm										|		770			|		Female			|		31		|
		|	ASICS GEL-J EVO SizE 44 ยาว 28 cm													|		840			|		Male			|		32		|
		|	ADIDAS SizE 41.5 ยาว 26 cm															|		790			|		Male			|		34		|
		|	NIKE DARTX 1 SizE 44 ยาว 28 cm														|		820			|		Male			|		37		|
		|	NIKE AIR 2015 SizE 40.5 ยาว 26 cm													|		830			|		Male			|		38		|
		|	NIKE 2017 SizE 42.5 ยาว 27 cm														|		840			|		Male			|		39		|
		|	NIKE SB CHECK SizE 42 ยาว 26.5 cm													|		830			|		Male			|		40		|
		|	ADIDAS Cloudfoam ปี 2016 SizE 44 ยาว 28cm											|		870			|		Male			|		41		|
		|	ASICS RIVRE CS SizE 44 ยาว 28 cm คู่นี้สภาพเต็มครับ											|		830			|		Male			|		42		|
		|	ASICS GEL-KAYANO 19 SizE 44 ยาว 28 cm สภาพเต็มครับ										|		840			|		Male			|		43		|
		|	NIKE Dual Fusion Run 3 ปี 2014 SizE 43 ยาว 27.5 cm									|		880			|		Male			|		44		|
		|	ADIDAS Duramo 7 ปี 2016 SizE 42.5 ยาว 27cm											|		920			|		Male			|		45		|
		|	NIKE Zoom Pegasus 32 ปี 2016 SizE 40.5 ยาว 26cm คู่นี้มี ดูที่รูปเลยคับ								|		820			|		Male			|		46		|
		|	NIKE DART XII ปี 2016 SizE. 40.5 ยาว 25.5cm											|		930			|		Male			|		47		|
		|	ADIDAS Superstar ปี 2016 SizE 39.5 ยาว 24.5cm										|		830			|		Female			|		48		|
		|	NIKE Free Run 3 ปี 2012 SizE 43 ยาว 27.5cm											|		870			|		Male			|		49		|
		|	ADIDAS Torsion ปี 2015 SizE 42 ยาว 26.5 cm											|		930			|		Male			|		50		|
		

@Remove
Scenario: Add KAIDEE product
	And I remove my advert
	