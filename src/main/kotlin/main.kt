fun main() {
    val likes: Int = 221
    val str: String
    if ((likes - 11) % 100 == 0 || likes % 100 == 0) {
        println("Понравилось $likes человекам")
    } else {
        if ((likes - 1) % 10 == 0 || (likes - 11) % 100 == 0) str = "человеку" else str = "людям"
        println("Понравилось $likes $str")
    }
}
