package com.example.david.galaxplore

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [ResourcesFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [ResourcesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ResourcesFragment : Fragment() {

    // DW done Renamed and change types of parameters
    private var Resource1Scraps: String? = null
    private var Resource2Gravity: String? = null
    private var Resource3Bytes: String? = null

    private var mListener: OnFragmentInteractionListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
            Resource1Scraps = arguments.getString(ARG_Scraps)
            Resource2Gravity = arguments.getString(ARG_Gravity)
            Resource3Bytes = arguments.getString(ARG_Bytes)
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_resources, container, false)
    }

    // TODO: Rename method, update argument and hook method into UI event
    // DW not sure if any UI events needed in ResourcesFragment
    fun onButtonPressed(uri: Uri) {
        if (mListener != null) {
            mListener!!.onFragmentInteraction(uri)
        }
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context is OnFragmentInteractionListener) {
            mListener = context
        } else {
            throw RuntimeException(context!!.toString() + " must implement OnFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        mListener = null
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     *
     *
     * See the Android Training lesson [Communicating with Other Fragments](http://developer.android.com/training/basics/fragments/communicating.html) for more information.
     */
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
}// Required empty public constructor
