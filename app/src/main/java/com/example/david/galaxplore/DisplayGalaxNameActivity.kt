package com.example.david.galaxplore

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class DisplayGalaxNameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_galax_name)

        val galaxname = intent.getStringExtra(EXTRA_GALAXNAME)
        val galaxnamemessageopen = "Hi there, "
        val galaxnamemessageclose = "... and welcome to GalaxPlore!!"
        val galaxnamemessage = galaxnamemessageopen + galaxname + galaxnamemessageclose
        val textView = findViewById<TextView>(R.id.textView).apply {
            text = galaxnamemessage
        }


    }



//* RESOURCES FRAGMENT [ENABLEMENT] :
interface OnFragmentInteractionListener {
    // TODO: Update argument type and name
    fun onFragmentInteraction(uri: Uri)
}

    companion object {
        // TODO: Rename parameter arguments, choose names that match
        // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
        private val ARG_Scraps = "Resource1Scraps"
        private val ARG_Gravity = "Resource2Gravity"
        private val ARG_Bytes = "Resource3Bytes"

        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param Resource1Scraps Parameter 1.
         * @param Resource2Gravity Parameter 2.
         * @param Resource3Bytes Parameter 3.
         * @return A new instance of fragment ResourcesFragment.
         */
        // DW done Renamed and change types and number of parameters
        fun newInstance(Resource1Scraps: String, Resource2Gravity: String, Resource3Bytes   : String): ResourcesFragment {
            val fragment = ResourcesFragment()
            val args = Bundle()
            args.putString(ARG_Scraps, Resource1Scraps)
            args.putString(ARG_Gravity, Resource2Gravity)
            args.putString(ARG_Bytes, Resource3Bytes)
            fragment.arguments = args
            return fragment
        }
    }
//* RESOURCES FRAGMENT [ENABLEMENT] ^^^

    inner class DisplayGalaxNameActivity: FragmentActivity() {
        public override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.fragment_resources)
        }
    }

}