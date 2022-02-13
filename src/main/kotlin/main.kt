fun main() {
    val likeAm = 11 // И с 10, и с 11, и с 1111 работает, как и должно
    val result = if (likeAm % 10 == 1 && likeAm % 100 != 11) {
        "человеку"
    } else {
        "людям"
    }
    println("Понравилось $likeAm $result")
}