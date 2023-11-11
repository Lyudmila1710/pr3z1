import org.jetbrains.annotations.NotNull
import kotlin.random.Random
fun main() {
    var continueGame = true
    while(continueGame){
    print("Игра в камень, ножницы, бумага:\n Выберите предмет(напишите цифру):\n 1. Камень\n2. Бумага\n3. Ножницы\n ")
    val gamer= GetGamer()
    val computer = GetComputer()
    println("Вы выбрали: ${gamer}\nКомпьютер выбрал: ${computer}\nРезультат игры: ${result(gamer,computer)}")
    println("Если хотите продолжить игру нажмите любую клавишу кроме Enter. Если хотите закончить нажмите Enter: ")
    val choise= readln()
        if (choise == ""){
            continueGame=false
        }
        }
}
fun GetGamer():String {
    val gamer = readln()
    return when (gamer) {
        "1" -> "Камень"
        "2" -> "Бумага"
        "3" -> "Ножницы"
        else -> " Некорректный выбор "
    }
}
fun GetComputer() : String{
    val computer = Random.nextInt(1,4)
    return when (computer){
        1 -> "Камень"
        2 -> "Бумага"
        3 -> "Ножницы"
        else -> " Ошибка "
    }
}

fun result(gamer: String, computer:String): String {
    return when {
        gamer==computer -> "Ничья"
        gamer == "Камень" && computer == "Ножницы" -> "Вы выиграли"
        gamer == "Ножницы" && computer == "Бумага" -> "Вы выиграли"
        gamer == "Бумага" && computer == "Камень" -> "Вы выиграли"
        else -> "Вы проиграли"
    }

}