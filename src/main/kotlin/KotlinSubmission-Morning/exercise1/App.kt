package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    var namaDepan: String = "Zakki"
    var namaBelakang: String = "Khaerul"
    var umur: Int = 20
    var single: Boolean = true
    var myProfile =
        "Nama: $namaDepan $namaBelakang\nUmur: $umur tahun\nStatus: ${if (single) "Single" else "Berpasangan"}"
    println(myProfile)
}

/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Group ID:$groupId")

    println("Group Members:")
    for (member in groupMember) {
        println("- $member")
    }

    println("Session: $session")
    return ""
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val groupId = "Collaboracrew"
    val anggotagroup =
        listOf("Muiz", "Andini", "diva", "Abi", "M.Aldiansyah", "yuda", "saddam", "nur.h", "middil", "aras")
    val namasaya = "Zakki Khaerul"
    val myTeamList = anggotagroup + namasaya

    return listOf(myTeamList)
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = listOf<String>("kak Raihan", "kak Fatih")
    val countOfGroup = listOf<String>(
        "Muiz",
        "zakki",
        "Andini",
        "diva",
        "Abi",
        "M.Aldiansyah",
        "yuda",
        "saddam",
        "nur.h",
        "middil",
        "aras",
    )
    val total = mentor.size + countOfGroup.size
    return total
}

fun main() {
    myProfile()
    val myTeam = myTeam()

    println("My team is: $myTeam")
    val totalMember = totalMember()
    println("Total Member group : $totalMember")
    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail(
        "CollaboraCrew",
        listOf("Muiz", "zakki", "Andini", "diva", "Abi", "M.Aldiansyah", "yuda", "saddam", "nur.h", "middil", "aras"),
        "Morning"
    )

}