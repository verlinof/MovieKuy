package com.example.moviekuy

import android.content.Intent
import android.os.Bundle
import android.text.Layout
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DashboardFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DashboardFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentInflater = inflater.inflate(R.layout.fragment_dashboard, container, false)

        val card = fragmentInflater.findViewById<LinearLayout>(R.id.cardGreyhound)
        val card2 = fragmentInflater.findViewById<LinearLayout>(R.id.cardOnepiece)
        val card3 = fragmentInflater.findViewById<LinearLayout>(R.id.cardGranTurismo)
        val card4 = fragmentInflater.findViewById<LinearLayout>(R.id.cardMazeRunner)

        card.setOnClickListener() {
            startActivity(Intent(requireContext(), DetailsActivity::class.java))
        }

        card2.setOnClickListener() {
            startActivity(Intent(requireContext(), DetailsActivity::class.java))
        }

        card3.setOnClickListener() {
            startActivity(Intent(requireContext(), DetailsActivity::class.java))
        }

        card4.setOnClickListener() {
            startActivity(Intent(requireContext(), DetailsActivity::class.java))
        }

        return fragmentInflater
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment DashboardFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            DashboardFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}