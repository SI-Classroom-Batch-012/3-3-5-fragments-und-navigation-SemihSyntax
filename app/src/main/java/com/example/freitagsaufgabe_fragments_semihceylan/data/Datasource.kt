package com.example.freitagsaufgabe_fragments_semihceylan.data

class Datasource {
    fun loadData() : MutableList<Data> {
        return mutableListOf(
            Data("Kreative Inspiration", """
                Lieber Semih,

                heute Morgen wurde ich von einer Welle kreativer Energie überrollt! Die Ideen sprudelten förmlich aus mir heraus. Ich notierte blitzschnell meine Gedanken zu einem neuen Kunstprojekt, das ich schon lange umsetzen wollte. Die Farben, die Formen – alles scheint perfekt zusammenzupassen. Ich kann es kaum erwarten, mich in dieses kreative Abenteuer zu stürzen. Lass uns bald darüber sprechen und vielleicht sogar gemeinsam brainstormen!

                Herzliche Grüße,
                Semih
            """.trimIndent()),
            Data("Entspannung und Selbstfürsorge","""
                Liebe Freundin, lieber Freund,

                inmitten des hektischen Alltags ist es wichtig, sich bewusst Zeit für sich selbst zu nehmen. Heute habe ich beschlossen, einen entspannten Abend nur für mich zu gestalten. Ein langes Bad mit beruhigenden ätherischen Ölen, gefolgt von einer Tasse heißem Tee und einem guten Buch – einfach himmlisch. Es ist erstaunlich, wie solch kleine Auszeiten die Batterien aufladen können. Ich hoffe, du findest ebenfalls Momente der Ruhe und Selbstfürsorge in deinem hektischen Alltag.

                Bis bald,
                Semih
            """.trimIndent())
        )
    }
}