class Subject (val name: String, val code: Int, val credits: Int, val hours: Int, var price: Int){
    var lecturers = mutableListOf<Person>()
    var students = mutableListOf<Person>()

}