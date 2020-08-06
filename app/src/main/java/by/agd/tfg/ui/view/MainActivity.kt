package by.agd.tfg.ui.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import by.agd.tfg.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        val navController = findNavController(R.id.fragment_container)

        setSupportActionBar(toolbar)
        setupActionBarWithNavController(navController)

        toolbar.setNavigationOnClickListener { navController.popBackStack() }
    }
}