package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */

    try {
        print("Masukkan NIM anda: ")
        val input = readLine()
        val nim = input?.toInt()

        if (nim != null){
            println("NIM anda: $nim")
        } else {
            throw NumberFormatException("Input tidak valid")
        }
    } catch (e: NumberFormatException) {
        println("Terjadi kesalahan: ${e.message}")
    }

}