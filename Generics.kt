class GroupInExample<in T>
class GroupOutExample<out T>

open class Employee(val name:String) {
    override fun toString(): String {
        return name
    }
}
class Programmer(name:String) : Employee(name) {}
class Tester(name:String) : Employee(name) {}

fun main() {
    val a:GroupInExample<Programmer> = GroupInExample<Employee>() // SubType -> SuperType Relationship - IN
    val b:GroupInExample<Tester> = GroupInExample<Employee>() // SubType -> SuperType Relationship - IN

    val c:GroupOutExample<Employee> = GroupOutExample<Programmer>() // SuperType - SubType Relationship - OUT
    val d:GroupOutExample<Employee> = GroupOutExample<Tester>() // SuperType - SubType Relationship - OUT
}

