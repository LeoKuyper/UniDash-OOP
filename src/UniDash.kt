fun main(){
    var exit = false
    var dashMenu = "main"
    val uniDashSign =
            """ 
             ▄         ▄  ▄▄        ▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄   ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄         ▄ 
            ▐░▌       ▐░▌▐░░▌      ▐░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░▌ ▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░▌       ▐░▌
            ▐░▌       ▐░▌▐░▌░▌     ▐░▌ ▀▀▀▀█░█▀▀▀▀ ▐░█▀▀▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀▀▀ ▐░▌       ▐░▌
            ▐░▌       ▐░▌▐░▌▐░▌    ▐░▌     ▐░▌     ▐░▌       ▐░▌▐░▌       ▐░▌▐░▌          ▐░▌       ▐░▌
            ▐░▌       ▐░▌▐░▌ ▐░▌   ▐░▌     ▐░▌     ▐░▌       ▐░▌▐░█▄▄▄▄▄▄▄█░▌▐░█▄▄▄▄▄▄▄▄▄ ▐░█▄▄▄▄▄▄▄█░▌
            ▐░▌       ▐░▌▐░▌  ▐░▌  ▐░▌     ▐░▌     ▐░▌       ▐░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌
            ▐░▌       ▐░▌▐░▌   ▐░▌ ▐░▌     ▐░▌     ▐░▌       ▐░▌▐░█▀▀▀▀▀▀▀█░▌ ▀▀▀▀▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀█░▌
            ▐░▌       ▐░▌▐░▌    ▐░▌▐░▌     ▐░▌     ▐░▌       ▐░▌▐░▌       ▐░▌          ▐░▌▐░▌       ▐░▌
            ▐░█▄▄▄▄▄▄▄█░▌▐░▌     ▐░▐░▌ ▄▄▄▄█░█▄▄▄▄ ▐░█▄▄▄▄▄▄▄█░▌▐░▌       ▐░▌ ▄▄▄▄▄▄▄▄▄█░▌▐░▌       ▐░▌
            ▐░░░░░░░░░░░▌▐░▌      ▐░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░▌ ▐░▌       ▐░▌▐░░░░░░░░░░░▌▐░▌       ▐░▌
             ▀▀▀▀▀▀▀▀▀▀▀  ▀        ▀▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀▀▀▀▀▀▀▀▀▀   ▀         ▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀         ▀ 
                                                                                                                                                                                                    
""".trimIndent()
    println(uniDashSign)
    println("Please add a University")
    print("Name:")

    var uni =  University(readLine().toString())

    fun clear(){
        for (load in 1..10){
            println()
        }
    }

    fun dash(string: String){
        clear()
        println(uniDashSign)
        if (string == "main"){
            print("The name of the University is " + uni.getUniName() +" |")
            print("| There is currently " + uni.getPeople() + " people in the University")
            println()
            print("Current pool of funds is R" + uni.getPool() +" |")
            print("| Current number of subjects " + uni.getSubjects())
            println()
            println()

            println("Available commands:")
            println("Each command will run to submenu")
            println("Exit - exit || People - people || Subject - subject || University - uni || Pool - pool")
            println()
            print("root@"+"UniDash"+" ~ % ")
        }

        if (string == "people"){

        }
        if (string == "subject"){

        }
        if (string == "uni"){

        }
        if (string == "pool"){

        }

    }

    fun options(string: String){
        when (string) {
            in listOf("q", "quit", "exit") -> {
                for (load in 1..3){
                    val shuffleTime = 200L
                    for (show in 0..3){
                        print("Exiting UniDash " + ".".repeat(show))
                        Thread.sleep(shuffleTime)
                        print("\r")
                    }
                }
                exit = true
            }
            in listOf("people") -> {
                dashMenu = "people"
            }
            in listOf("subject") -> {
                dashMenu = "subject"
            }
            in listOf("uni") -> {
                dashMenu = "uni"
            }
            in listOf("pool") -> {
                dashMenu = "pool"
            }
            in listOf("back") -> {
                dashMenu = "main"
            }

            else -> {
                println("Unknown command")
                Thread.sleep(200L)
                dash(dashMenu)
            }
        }
    }

    println("Will now generate a new University")
    for (load in 1..3){
        val shuffleTime = 1000L
        for (show in 0..3){
            print("Generating " + ".".repeat(show))
            Thread.sleep(shuffleTime)
            print("\r")
        }
    }

    while (!exit){
        dash(dashMenu)
        options(readLine().toString())

    }


}


