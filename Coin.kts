fun main() {
   val myFirstToss = Coin()
   println("Your coin is ${myFirstToss.flip()}!")
   
}

  class Coin {
        
      fun flip() = listOf("Heads", "Tails").random()
    }