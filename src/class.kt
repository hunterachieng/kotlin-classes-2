fun main(){
    var student = Studentdetails("Jennipher Luiz",2018,"Form 4","Average","B")
    student.information()
    student.year()
    student.position()
    student.indexPlace()}
//classes
class Studentdetails(var name:String,var admyear:Int,var claSS:String,var performance:String,var grade:String){
    fun information(){
        println("Student's Name: $name")}
    fun year (){
        println("Admission year: $admyear")}
    fun position (){
        if(grade == "A"){
            println(performance)
        }else if(grade == "B"){
            println(performance)
        }else if(grade=="C"){
            println(performance)
        }else{
            println(performance)}}
    fun indexPlace(){
        if (performance == "Very Good"){
            println("Go to room NORTH")
        }else if (performance == "Average"){
            println("Go to room WEST")
        }else{
            println("Go to EAST")}
    }
}