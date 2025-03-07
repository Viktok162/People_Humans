fun main() {
    val likes: Int = 121 //количество лайков
    val str: String
    if ((likes - 11) % 100 == 0) {
        println("Понравилось $likes людям")
    } else {
        if ((likes - 1) % 10 == 0) str = "человеку" else str = "людям"
        println("Понравилось $likes $str")
    }
}