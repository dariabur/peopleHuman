fun main(){
    val likeAm = 61
    var text = ""

    if(likeAm % 10 == 1 && likeAm % 100 != 11){
        text = "человеку"
    }else {
        text ="людям"
    }
    println("Понравилось $likeAm $text")
}