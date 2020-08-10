class Person(val id: Int, var name: String, var type: Int) {
    var subjects = mutableListOf<Subject>()
    var money = 0f

    fun changeName(string: String){
        name = string
    }

    fun getPersonName(): String{
        return name
    }

    fun getType(): String{
        val typeName = when(type){
            1 -> "Student"
            2 -> "Admin"
            3 -> "Lecturer"
            else -> ""
        }

        return type.toString()
    }

    fun getMoney(){

    }
}