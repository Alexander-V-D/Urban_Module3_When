fun main() {

    //Задача 1
    val month = 5
    val months = listOf(
        "Январь", "Февраль", "Март",
        "Апрель", "Май", "Июнь",
        "Июль", "Август", "Сентябрь",
        "Октябрь", "Ноябрь", "Декабрь"
    )
    println(when (month) {
        in 1..2 -> "Зима: ${months[month - 1]}."
        in 3..5 -> "Весна: ${months[month - 1]}."
        in 6..8 -> "Лето: ${months[month - 1]}."
        in 9..11 -> "Осень: ${months[month - 1]}."
        12 -> "Зима: ${months[month - 1]}."
        else -> "Неверное значение."
    })

    //Задача 2
    val numberWithFloatingDot = 3.7
    println("Ответ к задаче 2: ${when(numberWithFloatingDot - numberWithFloatingDot.toInt()) {
        in 0.0..0.5 -> numberWithFloatingDot.toInt()
        else -> numberWithFloatingDot.toInt() + 1
    }}")

    //Задача 3
    val hour = 22
    println("Ответ к задаче 3: ${when (hour) {
        in 0..5 -> "Раннее утро"
        in 6..11 -> "Утро"
        in 12..17 -> "День"
        in 18..20 -> "Вечер"
        in 21..23 -> "Ночь"
        else -> "Неверное значение"
    }}")

    //Задача 4
    var a = 8
    var b = 5
    when (a) {
        8 -> a = 5
    }
    when (b) {
        5 -> b = 8
    }
    println("Ответ к задаче 4: a = $a, b = $b")
}
