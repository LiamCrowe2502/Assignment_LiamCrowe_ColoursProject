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
        //TODO return the colours starting with the letter passed as a parameter
        return listOf("${letter}")
    }

    fun coloursWithSpecificNumberOfChars(size: Int) : List<String>{
        //TODO return the colours that have exactly the same number of chars as the number passed as a parameter
        return listOf("this should return colours that have ${size} chars")
    }

    fun coloursWithLessCharsThan(size: Int) : List<String>{
        //TODO return the colours that have less chars than the number passed as s parameter
        return listOf("this should return colours less than ${size} chars")
    }

    fun isColourInTheList(colour : String) : Boolean{
        //TODO return true of the colour passed as a parameter is in the list and false otherwise
        // Note: the search should be case insensitive - if blue is passed as a parameter it should find Blue, BLUE etc.
        return false
    }

    //TODO Write THREE additional functions of your choice that will perform some sort of
    // analysis on the colours list.

}