package com.abrar.freefireguides.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.abrar.freefireguides.R
import com.abrar.freefireguides.R.layout.fragment_home
import com.abrar.freefireguides.cheat.CheatFragment
import com.abrar.freefireguides.community.CommunityFragment
import com.abrar.freefireguides.howtoinstall.HowToInstallFragment
import com.abrar.freefireguides.tutorial.TutorialFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment(), HomeViewHolder.Listener {

    val listMenu = listOf(
        HomeModel(name = "How To Install", icon = R.drawable.start),
        HomeModel(name = "Game Guides", icon = R.drawable.computer),
        HomeModel(name = "Game Cheat", icon = R.drawable.gamecheat),
        HomeModel(name = "Community", icon = R.drawable.group)
    )


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(fragment_home, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val homeAdapter = HomeAdapter(listMenu, this@HomeFragment)

        rv_home.apply {
            layoutManager = GridLayoutManager(requireContext(), 2)
            adapter = homeAdapter
        }

    }

    override fun onClickMenu(title: String) {
        when (title) {
            "How To Install" -> {
                fragmentManager?.beginTransaction()
                    ?.replace(R.id.frame_install, HowToInstallFragment())?.addToBackStack("install")
                    ?.commit()
            }
            "Game Guides" -> {
                fragmentManager?.beginTransaction()
                    ?.replace(R.id.frame_install, TutorialFragment())?.addToBackStack("tutorial")
                    ?.commit()
            }

            "Game Cheat" -> {
                fragmentManager?.beginTransaction()
                    ?.replace(R.id.frame_install, CheatFragment())?.addToBackStack("cheat")
                    ?.commit()
            }

            else -> {
                fragmentManager?.beginTransaction()
                    ?.replace(R.id.frame_install, CommunityFragment())?.addToBackStack("community")
                    ?.commit()
            }

        }

    }


}