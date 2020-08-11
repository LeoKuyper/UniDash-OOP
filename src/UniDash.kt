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

    fun spacing(){
        for (load in 1..3){
            println()
        }
    }

    fun dash(string: String){
        clear()
        println(uniDashSign)
        if (string == "main"){
            print("Main Menu ||" + uni.getUniName()+"||")
            print("\r")
            println()
            println("There is currently " + uni.getPeople() + " people in the University")
            print("Current pool of funds is R" + uni.getPool() +" |")
            print("| Current number of subjects " + uni.getSubjects())
            println()
            println()

            println("Available commands:")
            println("Each command will run to submenu")
            println("Exit - exit || People - people || Subject - subject || University - uni || Pool - pool")
            spacing()
            print("root@"+"UniDash"+" ~ % ")
        }

        if (string == "people"){
            println("People Menu")
            println()
            println("Available commands:")
            println("Each command will run to submenu")
            println("Back - back || List People - list || Add Person - add || Add subject to person - subject || Detail look of person - detail || Edit person - edit")
            spacing()
            print("root@"+"UniDash"+" ~ % ")
        }
        if (string == "subject"){
            println("Subject Menu")
            println()
            println("Available commands:")
            println("Each command will run to submenu")
            println("Back - back || List Subjects - list || Add Person - add || Add subject to person - subject || " +
                    "Detail look of person - detail || Edit person - edit")
            spacing()
            print("root@"+"UniDash"+" ~ % ")
        }
        if (string == "uni"){
            println("Uni Menu")
            println()
            println("Available commands:")
            println("Each command will run to submenu")
            println("Back - back || Change name - name || Edit person - edit")
            spacing()
            print("root@"+"UniDash"+" ~ % ")
        }
        if (string == "pool"){
            println("Pool Menu")
            println()
            println("Available commands:")
            println("Each command will run to submenu")
            println("Back - back || List People - list || Add Person - add || Add subject to person - subject || Detail look of person - detail || Edit person - edit")
            spacing()
            print("root@"+"UniDash"+" ~ % ")
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
            in listOf("subjects") -> {
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

            //Submenu
            in listOf("list") -> {
                dashMenu = "main"
            }
            in listOf("add") -> {
                dashMenu = "main"
            }
            in listOf("detail") -> {
                dashMenu = "main"
            }
            in listOf("edit") -> {
                dashMenu = "main"
            }
            in listOf("name") -> {
                dashMenu = "main"
            }

            else -> {
                println("Unknown command")
                Thread.sleep(1000L)
                dash(dashMenu)
            }
        }
    }

    println("Generating new University '${uni.getUniName()}'")
    for (load in 1..3){
        val shuffleTime = 500L
        for (show in 0..3){
            print("Generating " + ".".repeat(show))
            Thread.sleep(shuffleTime)
            print("\r")
        }
    }

    uni.addSubjects("IXT", "IXT300", 40, 180, 30000)
    uni.addSubjects("IDV", "IDV300", 40, 180, 30000)
    uni.addSubjects("IXTd", "IXTd300", 20, 40, 3000)
    uni.addSubjects("IXTs", "IXTs300", 10, 20, 1000)
    uni.listSubjects()
    uni.setPool(400000f)

    uni.addPeople("Test1", 1)
    uni.addPeople("Test2", 1)
    uni.addPeople("Test3", 1)
    uni.addPeople("Test4", 1)
    uni.addPeople("Test5", 1)

    uni.addPeople("Test01", 2)
    uni.addPeople("Test02", 2)
    uni.addPeople("TestA", 3)
    uni.addPeople("TestA2", 3)


    while (!exit){
        dash(dashMenu)
        options(readLine().toString())
    }


}


