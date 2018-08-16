import org.junit.Test


class Primitives {


    @Test
    fun variable_initialization1() {
        val a: Int = 1

        val b = 2
        val c: Int
        c = 3
    }

    @Test
    fun variable_initialization2() {
        val a: Int = 1

        //a = 2 //fails to compile
    }

    @Test
    fun variable_initialization3() {
        var a: Int = 1

        a = 2
    }

    @Test
    fun variable_initialization4() {
        //var a: Int = null //fails to compile
    }

    @Test
    fun variable_initialization5() {
        var a: Int? = null
    }

    @Test
    fun variable_initialization6() {
        var a: Int? = null

        println( a ?: "not defined")
    }
}