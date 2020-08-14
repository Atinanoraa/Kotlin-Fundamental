fun main() {
    val panjang = "20"
    val lebar = 12.6
    val tinggi = 10
    val volume : Double
    hitungVolume(panjang.toDouble()+2, lebar, tinggi.toDouble()+1)
}
fun hitungVolume(p:Double, l:Double, t:Double) {
    val v = p*l*t
    print("Volume dari balok yang mempunyai panjang ${p.toInt()}, lebar $l, dan tinggi ${t.toInt()} ini adalah ${v.toFloat()}")
}