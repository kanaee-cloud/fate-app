package com.example.myapplication

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.ActivityFragmentLayoutBinding

class FragmentLayout : AppCompatActivity() {

    private lateinit var binding : ActivityFragmentLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFragmentLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var fragmentManager = supportFragmentManager
        var fragmentTransition = fragmentManager.beginTransaction()
        fragmentTransition.replace(R.id.frameLayout, HomeFragment())
        fragmentTransition.commit()

        binding.btnNav.setOnItemSelectedListener{
            when(it.itemId){
                R.id.ic_home -> replaceFragment(HomeFragment())
                R.id.ic_menu -> replaceFragment(MenuFragment())
                R.id.ic_person -> replaceFragment(PersonFragment())
            }
            true
        }
    }

    private fun replaceFragment(fragment_to: Fragment){
        var fragmentTransaction = supportFragmentManager.beginTransaction()
        var fragmentFrom = supportFragmentManager.findFragmentById(R.id.frameLayout)

        if(fragmentFrom is HomeFragment && fragment_to is PersonFragment){
            fragmentTransaction.setCustomAnimations(R.anim.from_right, R.anim.to_left)
        }
        else if(fragmentFrom is PersonFragment && fragment_to is HomeFragment){
            fragmentTransaction.setCustomAnimations(R.anim.from_left, R.anim.to_right)
        }
        else if (fragmentFrom is HomeFragment && fragment_to is MenuFragment){
            fragmentTransaction.setCustomAnimations(R.anim.from_right, R.anim.to_left)
        }
        else if(fragmentFrom is MenuFragment && fragment_to is HomeFragment){
            fragmentTransaction.setCustomAnimations(R.anim.from_left, R.anim.to_right)
        }

//        fragmentTransaction.setCustomAnimations(R.anim.from_right, R.anim.to_left)

        fragmentTransaction.replace(R.id.frameLayout, fragment_to)
        fragmentTransaction.commit()
    }

}