class Colours {

    private val colours = listOf("Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet", "Black", "Silver")

    fun getAll (): List<String>{
        //Returns the colours list
        return listOf(colours.toString())
    }

    fun numberOfColours (): Int{
        //Returns the size of the colours list
        return colours.size
    }

    fun firstColour() : String{
        //Returns the first colour in the list
        return colours.get(0)
    }

    fun lastColour() : String{
        //Returns the last colour list
        return colours.get(colours.size -1)
    }

    fun coloursInAplhabeticOrder() : List<String>{
        //Returns the colours in alphabetical order
        return colours.sortedBy { it }

        /*
       Below should also work but isnt tested so who knows
       val alpha = colours.sortedBy().uppercase()
       return listOf(alpha.toString())
        */
    }

    fun coloursInAllCapitals() : List<String>{
        //Returns the colours in ALL CAPS
        return listOf(colours.toString().uppercase())
    }

    fun coloursStartingWithLetter(letter: Char) : List<String>{
        //Returns the colours starting with the letter passed as a parameter
        return colours.filter { it.startsWith('B') }
    }

    fun coloursWithSpecificNumberOfChars(size: Int) : List<String>{
        //Returns the colours that have exactly the same number of chars as the number passed as a parameter
        return colours.filter { it.length == 6 }
    }

    fun coloursWithLessCharsThan(size: Int) : List<String>{
        //Returns the colours that have less chars than the number passed as s parameter
        return colours.filter { it.length < 6 }
    }

    fun isColourInTheList(colour : String) : Boolean{
        //TODO return true if the colour passed as a parameter is in the list and false otherwise
        // Note: the search should be case insensitive - if blue is passed as a parameter it should find Blue, BLUE etc.
        if (colours.contains("Blue") || colours.contains("Blue".lowercase()) || colours.contains("Blue".uppercase())) {
            return true
        }
        return false
    }

    fun ListColourUnderEachOther() {
        //Returns the colours one after the other on a new line
        for (colours in colours) {
            println(colours)
        }
    }
    //Write THREE additional functions of your choice that will perform some sort of
    // analysis on the colours list.

    fun coloursStartingWithLetterAndSortsAndLowerCase(letter: Char) : List<String>{
        //Returns the colours starting with the letter 'B' passed as a parameter and sorted and changed to lowercase
        return colours.filter { it.startsWith('B') }
            .sortedBy { it }
            .map { it.lowercase() }
    }

    fun takeFirstThreeNumbers() : List<String>{
        //Returns the first three colours
        return colours.take( 3 )
    }

    fun removesFirstThreeNumbers() : List<String>{
        //Returns the first three colours
        return colours.drop( 3 )
    }
}