package com.mvvm.ui.main.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.mvvm.R
import kotlinx.android.synthetic.main.fragment_two.*

class TwoFragment : Fragment(), View.OnClickListener {

    lateinit var navController : NavController

    lateinit var intent:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        intent = arguments?.getString("intent")!!
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        btnfour.setOnClickListener(this)
        tvHiThere.text = intent
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btnfour ->{
                navController?.navigate(R.id.action_twoFragment2_to_fourFragment2)
            }
        }
    }
}