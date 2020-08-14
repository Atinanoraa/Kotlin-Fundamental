import java.util.*

fun main() {
    val grade = Scanner(System.`in`)
    print("Masukkan Nilai : ")
    val nilai:Int = grade.nextInt()
    val result=if (nilai>90){
        'A'
    }else if (nilai >80){
        'B'
    }else if (nilai >70){
        'C'
    }else if (nilai >60){
        'D'
    }else 'E'
    print("Nilai kamu $nilai (akreditasi $result)")
}