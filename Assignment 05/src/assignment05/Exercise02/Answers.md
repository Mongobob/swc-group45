****In this task we had to implement the Strategy Pattern

The idea was to implement an airport shuttle system service, with different options of car types. This could be expanded in the future and the code should be easy extendable at runtime.

Also an Customer who can get a shuttle from the airport given an date, becomes all the information's about the shuttle when he choose one. 

* We made a super class vehicle which implements all the interfaces so we can expand the sub-classes easily 


*  We took different interfaces for the different vehicle options, like we had Vehicle cost's, Vehicle speed and so on. Every Interface got in itself different classes which represented all the possibilities of the Vehicle option's. For Example Vehicle cost's got "5 CHF/h, 12 CHF/h...".

* The customer can choose a date and a car type and then he see's all the details about the shuttle

* we wrote test cases for all the classes but not for the interfaces, because we think it's not necessary 

So if we want to expand our shuttle we can just add new stuff to the interfaces or we make new ones for other possibilities the shuttles could have and this makes it easy for us not to destroy our code we already have and make changes at runtime. We showed it in the ex.2 we did some more interfaces that don't have been used but if we want we can easily add it to the Vehicles.






