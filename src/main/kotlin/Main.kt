import kotlin.random.Random

const val StandardDiscountR = 100.0
const val DiscountPercent = 0.05
const val MusicLoverDiscountPercent = 0.01

fun main() {
    print("Введите сумму покупки (руб.): ")
    val amountOfPurchases = readln().toDouble()
    val userIsMusicLover = Random.nextBoolean()
    val discountSum = if (amountOfPurchases > 10000) amountOfPurchases * DiscountPercent else if (amountOfPurchases > 1000) StandardDiscountR else 0.0
    val sum = amountOfPurchases - discountSum
    val musicLoverDiscountSum = if (userIsMusicLover) sum * MusicLoverDiscountPercent else 0.0
    val totalSum = sum - musicLoverDiscountSum

    println ("Пользователь меломан: $userIsMusicLover. \nСкидка от суммы покупки: $discountSum руб. Скидка меломану: $musicLoverDiscountSum руб. \nИтоговая сумма: $totalSum руб.")
}