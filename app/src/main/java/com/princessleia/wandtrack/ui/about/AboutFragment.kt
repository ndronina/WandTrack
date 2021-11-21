package com.princessleia.wandtrack.ui.about

import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.princessleia.wandtrack.R
import com.princessleia.wandtrack.data.SpellsRepository
import com.princessleia.wandtrack.databinding.FragmentAboutBinding

class AboutFragment : Fragment(R.layout.fragment_about) {

    private val viewBinding by viewBinding(FragmentAboutBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewBinding.youWishButton.setOnClickListener {
            viewBinding.wandTrack.isVisible = true
            viewBinding.wandTrack.init(
                R.dimen.size_64,
                SpellsRepository().unforgivableCurses[0]
            )
        }
    }


}