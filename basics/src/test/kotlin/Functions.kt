import org.junit.Test


class Functions {

    fun reformat(str: String,
                 normalizeCase: Boolean = true,
                 upperCaseFirstLetter: Boolean = true,
                 divideByCamelHumps: Boolean = false,
                 wordSeparator: Char = ' ') {

    }


    @Test
    fun callReformat() {
        reformat("input string")
        reformat("input string", wordSeparator = '_')

    }

    fun double(x: Int) = 2 * x


    @Test
    fun createFunction() {

        val fn: () -> Unit =  {
            println("hello")
        }

        fn()

    }


    @Test
    fun classAsAFunction() {

        class PureFunction: () -> Unit {
            override fun invoke() {
                println("this is it!!")
            }
        }

        val fn = PureFunction()
        fn()
    }



}