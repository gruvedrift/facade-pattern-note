package com.gruvedrift.example

// Facade class. Can also be an interface
class ExpandMiningFacade (
    private val governmentRelations: GovernmentRelations,
    private val demolitionCrew: DemolitionCrew,
    private val miningCartRental: MiningCartRental,
) {

    fun startNewMiningLocation( bribeAmount: Int, cartsNeeded: Int) {
        governmentRelations.bribeMayor(bribeAmount)
        demolitionCrew.hireExplosivesExpert()
        miningCartRental.rentCarts(cartsNeeded)
    }

}

// Subsystem classes
class GovernmentRelations { fun bribeMayor(amount: Int): Boolean = amount >= 50_000 }
class DemolitionCrew { fun hireExplosivesExpert() = println("BOMBARDIER!") }
class MiningCartRental { fun rentCarts(numberOfCarts: Int): Int = numberOfCarts }



// Client code
fun init(){

    val governmentRelations = GovernmentRelations()
    val miningCartRental = MiningCartRental()
    val demolitionCrew = DemolitionCrew()

    val newMiningLocation = ExpandMiningFacade(governmentRelations, demolitionCrew, miningCartRental)
    newMiningLocation.startNewMiningLocation(75_000, 16)
}
