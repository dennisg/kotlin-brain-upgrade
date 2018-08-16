import org.junit.Test

class Basics {

    @Test
    fun arrays() {
        val x: Array<Int> = arrayOf(1, 2, 3)
        x[0] = x[1] + x[2]
    }

    @Test
    fun int_array() {
        val x: IntArray = intArrayOf(1, 2, 3)
        x[0] = x[1] + x[2]

    }


    @Test
    fun if_statement() {
        val a = 1
        val b = 3

        val max = if (a > b) {
            print("Choose a")
            a
        } else {
            print("Choose b")
            b
        }

        println("max: $max")
    }

    @Test
    fun when_statement() {
        val x = 3

        when (x) {
            1 -> print("x == 1")
            2 -> print("x == 2")
            else -> { // Note the block
                print("x is neither 1 nor 2")
            }
        }
    }

    @Test
    fun another_when_statement() {
        val x = 13

        val validNumbers = arrayOf(9, 10, 11, 12)

        when (x) {
            in 1..10 -> print("x is in the range")
            in validNumbers -> print("x is valid")
            !in 10..20 -> print("x is outside the range")
            else -> print("none of the above")
        }
    }

    @Test
    fun for_loops1() {
        for (i in 1..3) {
            println(i)
        }

        for (i in 6 downTo 0 step 2) {
            println(i)
        }
    }


    @Test
    fun for_loops2() {

        val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8)

        for ((index, value) in array.withIndex()) {
            println("the element at $index is $value")
        }
        
    }
}