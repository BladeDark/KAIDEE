# ECOM World Ticket 
This automation use selenium 3 and genearte report by using serenity

#Tag for executions:
- @Oneway (execute all one way scenarios)
- @Roundtrip (execute all round trip scenarios)
- @Package (execute all package scenarios)
- @Extras (execute all extras scenarios)
- @Namechange (execute all name change scenarios)
- @Rebook (execute all rebook scenarios)
- @B2B (execute all B2B scenarios)
- @Normal_User
- @MultiFlight

#Note
If you want to ignore the tag, you can use this in the build properties:
cucumber.options=--tags ~@ignore

# Pre-configuration:
1. Create normal user: normal_atm@worldticket.net/atm1234 and currency is USD
2. Create corporate user: corporate_atm@worldticet and currency is USD
3. Setting limit infant in airline to be: 999
4. Setting Penalty on name change
5. Setting penalty on rebook
6. Setting KRP-CPH route with available flight at least 3 months (count from today)
7. Setting CPH-KRP route with available flight at least 3 months (count from today)
8. Setting KRP-RNN route with available flight at least 3 months (count from today)
9. Setting RNN-KRP route with available flight at least 3 months (count from today)
10. Setting package bundle at least 1
11. Setting normal package at least 1
12. Setting extra at least 1
