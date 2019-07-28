package com.example.espressoworkshop

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import androidx.fragment.app.Fragment


class DoggoFragment : Fragment() {

    private var listener: OnFragmentInteractionListener? = null
    private lateinit var doggoImage: ImageButton
    private var currentDoggo = 1
    private val doggos = intArrayOf(
        R.drawable.doggo1,
        R.drawable.doggo2,
        R.drawable.doggo3,
        R.drawable.doggo4,
        R.drawable.doggo5,
        R.drawable.doggo6,
        R.drawable.doggo7,
        R.drawable.doggo8,
        R.drawable.doggo9,
        R.drawable.doggo10
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        doggoImage = getView()?.findViewById(R.id.doggo_image_view) as ImageButton

        doggoImage.setOnClickListener {
            changeDoggos()
            newInstance()
        }
    }

    private fun changeDoggos() {
        if (currentDoggo == doggos.count()) currentDoggo = 0

        doggoImage.setImageResource(doggos[currentDoggo])
        currentDoggo++
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_doggo, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnFragmentInteractionListener) {
            listener = context
        } else {
            throw RuntimeException("$context must implement OnFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     *
     *
     * See the Android Training lesson [Communicating with Other Fragments]
     * (http://developer.android.com/training/basics/fragments/communicating.html)
     * for more information.
     */
    interface OnFragmentInteractionListener {

        fun onFragmentInteraction(doggoImageView: ImageView) {

        }

    }

    companion object {
        @JvmStatic
        fun newInstance() {
            DoggoFragment().apply { arguments = Bundle() }
        }
    }
}
