package vcmsa.ci.practicum_em

import android.media.Rating
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    var AddToPlaylist : Button? = null
    var Exit : Button? = null
    var ListOfSongs : Button? = null
    var CalculatedAverage : Button? = null
    var SongTitle : EditText? = null
    var ArtistsName : EditText? = null
    var Rating : EditText? = null
    var Comments : EditText? = null //IIE.Harvard Guide.2024


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        AddToPlaylist = findViewById<View>(R.id.AddToPlaylist) as Button
        Exit = findViewById<View>(R.id.Exit) as Button
        ListOfSongs = findViewById<View>(R.id.ListOfSongs) as Button
        CalculatedAverage = findViewById<View>(R.id.CalculatedAverage) as Button
        SongTitle = findViewById<View>(R.id.SongTitle) as EditText
        ArtistsName = findViewById<View>(R.id.ArtistsName) as EditText
        Rating = findViewById<View>(R.id.Rating) as EditText
        Comments = findViewById<View>(R.id.Comments) as EditText //IIE.Harvard Guide.2024

        ListOfSongs!!.setOnClickListener() {
        arrayOf(
            "1. Chris Brown - Question" +
                    "2. Rihanna - Work" +
                    "3.Usher - No Limit" +
                    "4.Victoria Monet - Momma" +
                    "5. Luther Vandros - Beauty" //IIE.Harvard Guide.2024
        )

     }

        }
{
        CalculatedAverage!!.setOnClickListener() {
        val CalculatedAverage = arrayOf("$->5,")
        if (CalculatedAverage.isNotEmpty())
        val AverageRating = CalculatedAverage!!.toInt.tostring()
    var InputAverageRating = CalculatedAverage!!.toint.tostring()
    Toast.makeText("$ 1.Question-> 5/5. 2.Work->4/5. 3 No Limit->5/5. 4.Momma->1/5. 5.Beauty->2/5".Toast.LENGHT_SHORT).show()

}
        {
            AddToPlayList!!.setOnclickListener()
            val AddedSongs = AddedSongs!!.text.toint()
            if (AddedSongs.isNotEmpty())
            val AddedSongs = AddedSongs!!.toInt()
            Toast.makeText("1. Chris Brown - Question".Toast.LENGHT_SHORT).show()
            //IIE. Harvard Guide.2024

















