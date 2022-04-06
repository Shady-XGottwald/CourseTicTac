 var winner : Boolean = true
 const val cross : String = "X"
 const val zero = "O"
 var playerX :Boolean = true
 var count : Int = 0

 var init = mutableListOf<String>("_","_","_","_","_","_","_","_","_",)

private fun main () {
    board()
   // println("Enter coordinates :")
    while(winner) {
        if (!winner) {
            break
        }
        if(playerX){
            player()
        }
        else {
            notPlayer()
        }
    }
}

private fun board(){
    dash()
    println("""
       |${init[0]} ${init[1]} ${init[2]}|
       |${init[3]} ${init[4]} ${init[5]}|
       |${init[6]} ${init[7]} ${init[8]}| 
    """.trimIndent())
    dash()
}

private fun checkWinner(){
    //Horizontal winner checks 0 1 2 -> 3 4 5 -> 6 7 8
    if(init[0] == cross && init[1] == cross && init[2] == cross ||
        init[0] == zero  && init[1] == zero && init[2] == zero){
        println(" ${init[0]} wins")
        winner = !winner
    }
    if(init[3] == cross && init[4] == cross && init[5] == cross  ||
        init[3] == zero  && init[4] == zero && init[5] == zero){
        println("${init[3]} wins")
        winner = !winner

    }
    if(init[6] == cross && init[7] == cross && init[8] == cross  ||
        init[6] == zero  && init[7] == zero && init[8] == zero){
        println("${init[6]} wins")
        winner = !winner

    } // Vertical winner checks   0 3 6 -> 1 4 7 -> 2 5 8
    if(init[0] == cross && init[3] == cross && init[6] == cross ||
        init[0] == zero && init[3] == zero && init[6] == zero) {
        println("${init[0]} wins")
        winner = !winner
    }
    if(init[1] == cross && init[4] == cross && init[7] == cross ||
        init[1] == zero && init[4] == zero && init[7] == zero) {
        println("${init[1]} wins")
        winner = !winner
    }
    if(init[2] == cross && init[5] == cross && init[8] == cross ||
        init[2] == zero && init[5] == zero && init[8] == zero) {
        println("${init[2]} wins")
        winner = !winner
    }

    // Diagonal winner checks  0 4 8 -> 2 4 6
    if (init[0] == cross && init[4] == cross && init[8] == cross ||
        init[0] == zero && init[4] == zero && init[8] == zero) {
        println("${init[0]} wins")
        winner = !winner

    }
    if (init[2] == cross && init[4] == cross && init[6] == cross ||
        init[2] == zero && init[4] == zero && init[6] == zero ) {
        println("${init[2]} wins")
        winner = !winner

    }
    //Draw || terminate when all populated

    return

}

private fun dash() = println("-------")

 private fun player () {
     val four  = '4'
     val six ='6'
     val five = '5'
     val seven = '7'
     val eight = '8'
     while(playerX) {
         println("Enter the coordinates :")
         val input = readLine()!!.toString()

         if(input.first() == four || input.last() == '0'  || input.first() == '0' ||  input.first() == five
             || input.first() == six || input.first() == seven || input.first() == eight){
             println("Coordinates should be from 1 to 3!")
         }

         when (input){
             "1 1"  -> {
                 if(init[0] == cross || init[0] ==zero){
                     println("This cell is occupied! Choose another one!")
                 }
                else { init[0] = cross
                 board()
                     count += 1
                 playerX = !playerX }
             }
             "1 2"  -> {
                 if(init[1] == cross || init[1] ==zero){
                     println("This cell is occupied! Choose another one!")
                 }
                  else {init[1] = cross
                 board()
                     count += 1

                     playerX = !playerX }

             }
             "1 3"  -> {
                 if(init[2] == cross || init[2] ==zero){
                     println("This cell is occupied! Choose another one!")
                 }
                 else {init[2] = cross
                 board()
                     count += 1

                     playerX = !playerX }

             }
             "2 1"  -> {
                 if(init[3] == cross || init[3] ==zero){
                     println("This cell is occupied! Choose another one!")
                 }
                else { init[3] = cross
                 board()
                     count += 1

                     playerX = !playerX }

             }
             "2 2"  -> {
                 if(init[4] == cross || init[4] ==zero){
                     println("This cell is occupied! Choose another one!")
                 }
               else {  init[4] = cross
                 board()
                     count += 1

                     playerX = !playerX }

             }
             "2 3"  -> {
                 if(init[5] == cross || init[5] ==zero){
                     println("This cell is occupied! Choose another one!")
                 }
                else { init[5] = cross
                 board()
                     count += 1

                     playerX = !playerX }

             }
             "3 1"  -> {
                 if(init[6] == cross || init[6] ==zero){
                     println("This cell is occupied! Choose another one!")
                 }
               else {  init[6] = cross
                 board()
                     count += 1

                     playerX = !playerX }

             }
             "3 2"  -> {
                 if(init[7] == cross || init[7] ==zero){
                     println("This cell is occupied! Choose another one!")
                 }
               else {  init[7] = cross
                 board()
                     count += 1

                     playerX = !playerX }

             }
             "3 3"  -> {
                 if(init[8] == cross || init[8] ==zero){
                     println("This cell is occupied! Choose another one!")
                 }
               else {  init[8] = cross
                 board()
                     count += 1

                     playerX = !playerX }

             }
             else ->{
                 println("You should enter numbers!")
             }

         }//end-WHen
         checkWinner()

     }//End-while playerX
     return
 }

 private fun notPlayer(){
     while(!playerX){
         println("Enter the coordinates :")
         val read = readLine()!!.toString()


         when(read) {
             "1 1" -> {
                 if(init[0] == cross || init[0] ==zero){
                     println("This cell is occupied! Choose another one!")
                 }
                else { init[0] = zero
                 board()
                     count += 1

                     playerX = true }
             }
             "1 2" -> {
                 if(init[1] == cross || init[1] ==zero){
                     println("This cell is occupied! Choose another one!")
                 }
                else { init[1] = zero
                 board()
                     count += 1

                     playerX = true }
             }
             "1 3" -> {
                 if(init[2] == cross || init[2] ==zero){
                     println("This cell is occupied! Choose another one!")
                 }
              else {   init[2] = zero
                 board()
                     count += 1

                     playerX = true }

             }
             "2 1" -> {
                 if(init[3] == cross || init[3] ==zero){
                     println("This cell is occupied! Choose another one!")
                 }
                 else {init[3] = zero
                 board()
                     count += 1

                     playerX = true }
             }
             "2 2" -> {
                 if(init[4] == cross || init[4] ==zero){
                     println("This cell is occupied! Choose another one!")
                 }
                else { init[4] = zero
                 board()
                     count += 1

                     playerX = true }
             }
             "2 3" -> {
                 if(init[5] == cross || init[5] ==zero){
                     println("This cell is occupied! Choose another one!")
                 }
                else { init[5] = zero
                 board()
                     count += 1

                     playerX = true }
             }
             "3 1" -> { if(init[8] == cross || init[8] ==zero){
                 println("This cell is occupied! Choose another one!")
             }
                else { init[6] = zero
                 board()
                 count += 1

                 playerX = true }

             }
             "3 2" -> {
                 if(init[7] == cross || init[7] ==zero){
                     println("This cell is occupied! Choose another one!")
                 }
                 else {init[7] = zero
                 board()
                     count += 1
                 playerX = true }
             }
             "3 3" -> {
                 if(init[8] == cross || init[8] ==zero){
                     println("This cell is occupied! Choose another one!")
                 }
                 else {init[8] = zero
                 board()
                     count += 1
                     playerX = true }
             }
             else ->{
                 println("You should enter numbers!")

             }


         }
         checkWinner()
         if(count == 9) {
             println("Draw!")
             winner = !winner
             break
         }
     }//End_while !playerX

 }//end-while}

//You should enter numbers!
 //Coordinates should be from 1 to 3!
 /*Draw break -- avoid infinite loop */

 /* Problem ? Draw -- Break when count start */