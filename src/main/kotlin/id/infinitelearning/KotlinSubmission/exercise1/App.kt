package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
- Dan cetak setiap variabel ke layar saat fungsi myProfile() di panggil
 */
fun myProfile() {
    val namaDepan: String = "Anjeli"
    val namaBlkg: String = "Puteri"
    val umur: Int = 20
    val single: Boolean = true

    println("=====myProfile=====")
    println("Nama depan: $namaDepan")
    println("Nama belakang: $namaBlkg")
    println("Umur: $umur tahun")
    println("Saya single: $single hehehe")
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: Int, groupMember: List<Any>, session: String): Any {

    println()
    println("=====groupDetail=====")
    println("groupId: $groupId")
    println("groupMember: $groupMember")
    println("session: $session")

    return arrayOf(groupId, groupMember, session)
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myGroup ini
 *
 */
fun myGroup(): String {

    var anggota = listOf<String>("anjeli", "zacky", "rasyid", "lutfia", "niken", "rania")

    println()
    println("=====myGroup=====")
    return anggota[0]
}

/**
 * Latihan 4
 * Ubah nilai kembalian untuk fungsi totalMember ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Dian", "Shasa", "Hasan", "Reza")
    val countOfGroup = 5
    val total = mentor.size + countOfGroup

    return total

}

fun main() {

    myProfile()

    groupDetail(5, listOf("anjeli", "inara"), "morning")

    val myGroup = myGroup()
    println("My Group is: $myGroup")

    val totalMember = totalMember()
    println("Total Member group + Mentor: $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    println()
    groupDetail(5, listOf("Anjeli", "Zacky", "Niken", "Rania", "Rasyid", "Lutfia"), "Morning")
}