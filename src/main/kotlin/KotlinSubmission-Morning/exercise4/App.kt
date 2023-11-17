package id.infinitelearning.KotlinSubmission.exercise4


/**
 * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
 *
 */
// Buat di bawah sini
fun main() {
    try {
        val result = divide(100, 5)
        println("Hasil pembagian: $result")
    } catch (e: ArithmeticException) {
        println("Terjadi kesalahan aritmatika: ${e.message}")
    } catch (e: Exception) {
        println("Terjadi kesalahan: ${e.message}")
    } finally {
        println("Finally block dieksekusi.")
    }
}

fun divide(a: Int, b: Int): Int {
    return a / b
}
