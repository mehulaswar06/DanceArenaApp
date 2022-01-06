package com.example.the_dance_arena_sam

object setData {
    fun SetDance():List<danceData> {
        var Dancelist = mutableListOf<danceData>()
        Dancelist.add(
            danceData(
                1,
                "Bharatnatyam",
                "Tamil Nadu",
                "Anamika Nevase",
                "Bharatanatyam, a pre-eminent Indian classical dance form presumably the oldest classical dance heritage of India is regarded as mother of many other Indian classical dance forms. Conventionally a solo dance performed only by women, it initiated in the Hindu temples of Tamil Nadu and eventually flourished in South India. Theoretical base of this form traces back to ‘Natya Shastra’, the ancient Sanskrit Hindu text on the performing arts. A form of illustrative anecdote of Hindu religious themes and spiritual ideas emoted by dancer with excellent footwork and impressive gestures its performance repertoire includes nrita, nritya and natya. Accompanists include a singer, music and particularly the guru who directs and conducts the performance. It also continues to inspire several art forms including paintings and sculptures starting from the spectacular 6th to 9th century CE temple sculptures.",
            )
        )
        Dancelist.add(
            danceData(
                2,
                "Katthak",
                "Uttarakhand",
                "Anamika Nevase",
                "1.62",
            )
        )
        Dancelist.add(
            danceData(
                3,
                "Kathakali",
                "Kerala",
                "Anamika Nevase",
                "11.15",
            )
        )
        Dancelist.add(
            danceData(
                4,
                "Kuchipudi",
                "Andhra Pradesh",
                "Anamika Nevase",
                "9.807",
            )
        )
        Dancelist.add(
            danceData(
                5,
                "Manipuri",
                "Manipur",
                "Anamika Nevase",
                "8.87",
            )
        )
        Dancelist.add(
            danceData(
                6,
                "Mohiniyattam",
                "Kerala",
                "Anamika Nevase",
                "8.87",
            )
        )
        Dancelist.add(
            danceData(
                7,
                "Odissi",
                "Odisha",
                "Anamika Nevase",
                "274.0",
            )
        )
        Dancelist.add(
            danceData(
                8,
                "Sattriya",
                "Assam",
                "Anamika Nevase",
                "10.44",
            )
        )
        return Dancelist

    }
}