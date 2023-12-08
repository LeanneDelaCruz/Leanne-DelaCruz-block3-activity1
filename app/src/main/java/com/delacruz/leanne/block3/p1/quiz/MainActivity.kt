package com.delacruz.leanne.block3.p1.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {

    lateinit var clicktext: TextView
    lateinit var title: TextView

    val songs = arrayOf(
        "Art Deco",
        "Born to Die",
        "Brooklyn Baby",
        "Summertime Sadness",
        "Doin Time",
        "Young and Beautiful",
        "West Coast",
        "Say Yes to Heaven",
        "Radio",
        "Dark Paradise",
        "Diet Mountain Dew",
        "Cinnamon Girl",
        "Sad Girl",
        "Video Games",
        "The Other Woman",
        "National Anthem",
        "Lust for Life",
        "Salvatore",
        "Love",
        "Bel Air",
        "Million Dollar Man",
        "Blue Jeans",
        "Ultraviolence",
        "Shades of Cool",
        "Old Money",
        "White Mustang",
        "NFR",
        "Venice Bitch",
        "Blue Banisters",
        "Dealer",
        "A&W",
        "Peppers",
        "Once Upon a Dream",
        "Stargirl Interlude",
        "Carmen",
        "Off to Races",
        "Cruel World",
        "Pretty When You Cry",
        "Honeymoon",
        "High By The Beach",
        "Religion",
        "Swan Song",
        "Burnt Norton",
        "Freak",
        "God Knows I Tried",
        "Terrence Loves You",
        "13 Beaches",
        "Cherry",
        "Summer Bummer",
        "In My Feelings",
        "Heroin",
        "Get Free",
        "Venice Beach",
        "Wild At Heart",
        "Dance Till We Die",
        "Yosemite",
        "Yayo",
        "Arcadia",
        "Cherry Blossom",
        "Sweet Carolina",
        "Thunder",
        "Wildflower Wildfire",
        "Black Bathing Suit",
        "Text Book",
        "Violets For Roses",
        "Living Legend",
        "Nectar Of the Gods"
    )

    lateinit var randomize: kotlin.random.Random

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        randomize = kotlin.random.Random

        clicktext = findViewById(R.id.clicktext);
        title = findViewById(R.id.title);

        clicktext.setOnClickListener {
            clicktext.text = songs[randomize.nextInt(songs.size)]
        }
    }

}