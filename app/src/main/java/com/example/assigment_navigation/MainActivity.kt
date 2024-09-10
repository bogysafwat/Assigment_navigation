package com.example.assigment_navigation

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.assigment_navigation.databinding.ActivityMainBinding
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.example.assigment_navigation.ui.theme.Assigment_navigationTheme

class MainActivity : AppCompatActivity()  {
    lateinit var binding : ActivityMainBinding
    lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        val fragHost = supportFragmentManager.findFragmentById(R.id.nav_host) as NavHostFragment
        navController= fragHost.navController

        setupWithNavController(binding.bottomNavigation, navController)

        binding.floatingActionButton.setOnClickListener{
            val intent =Intent(Intent.ACTION_DIAL)
            intent.data= Uri.parse("tel:12345")
                startActivity(intent)

        }

    }
}