import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking
import org.junit.Test
import java.lang.Thread.sleep


class Code {


    @Test
    fun initial() {
        launch {
            delay(1000)
            println("world!")
        }

        print("Hello ")
        Thread.sleep(2000)
    }


    @Test
    fun non_blocking() {
        launch {
            delay(1000)
            println("world!")
        }
        runBlocking {
            print("Hello ")
            delay(2000)
        }
    }

    @Test
    fun inline_non_blocking() = runBlocking {
        launch {
            delay(1000)
            println("world!")
        }
        print("Hello ")
        delay(2000)
    }

    @Test
    fun inline_non_blocking_join() = runBlocking {
        val job = launch {
            delay(1000)
            println("world!")
        }
        print("Hello ")
        job.join()
    }


    @Test
    fun coroutines_are_lightweight() = runBlocking {
        val jobs = List(100_000) {
            // launch a lot of coroutines and list their jobs
            launch {
                delay(1000L)
                print(".")
            }
        }
        jobs.forEach { it.join() } // wait for all jobs to complete
    }

    @Test
    fun threads_are_memory_hogs() {
        List(100_000) {
            // launch a lot of coroutines and list their jobs
            Thread {
                sleep(1000L)
                print(".")
            }.start()
        }
    }

}