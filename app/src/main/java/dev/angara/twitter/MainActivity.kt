package dev.angara.twitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import dev.angara.twitter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayDetails()
    }

    fun displayDetails() {
        var tweet1 = Details(
            "Tessa Marie",
            "angara_marie",
            "This is my code",
            "image",
            "like",
            "comment",
            "retweet",
            "share"
        )
        var tweet2 = Details(
            "Marie Tessa",
            "angara_marie",
            "Wherever you are, be there. Be consistent. Build yourself to be resilient. To be an effective leader, you have to be a good communicator and decisive.",
            "image",
            "like",
            "comment",
            "retweet",
            "share"
        )
        var tweet3 = Details(
            "Angara Marie",
            "angara_marie",
            "Wherever you are, be there. Be consistent. Build yourself to be resilient. To be an effective leader, you have to be a good communicator and decisive.",
            "image",
            "like",
            "comment",
            "retweet",
            "share"
        )
        var tweet4 = Details(
            "Marie Angara",
            "angara_marie",
            "Wherever you are, be there. Be consistent. Build yourself to be resilient. To be an effective leader, you have to be a good communicator and decisive.",
            "image",
            "like",
            "comment",
            "retweet",
            "share"
        )
        var tweet5 = Details(
            "Quinn Kelsey",
            "angara_marie",
            "Wherever you are, be there. Be consistent. Build yourself to be resilient. To be an effective leader, you have to be a good communicator and decisive.",
            "image",
            "like",
            "comment",
            "retweet",
            "share"
        )
        var tweet6 = Details(
            "Kelsey Quinn",
            "angara_marie",
            "This is my code",
            "image",
            "like",
            "comment",
            "retweet",
            "share"
        )
        var detailsList = listOf(tweet1, tweet2, tweet3, tweet4, tweet5, tweet6)
        var detailsAdapter = TwitterRvAdapter(detailsList)
        binding.rvTwitter.layoutManager = LinearLayoutManager(this)
        binding.rvTwitter.adapter = detailsAdapter

    }
}