package com.princessleia.wandtrack.ui.spells

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.hannesdorfmann.adapterdelegates4.AsyncListDifferDelegationAdapter
import com.princessleia.wandtrack.R
import com.princessleia.wandtrack.data.SpellsRepository
import com.princessleia.wandtrack.databinding.FragmentSpellsBinding
import com.princessleia.wandtrack.utils.MarginItemDecoration
import com.princessleia.wandtrack.utils.SimpleDiffCallback

class SpellsFragment : Fragment(R.layout.fragment_spells) {
    private val viewBinding by viewBinding(FragmentSpellsBinding::bind)

    private val delegateAdapter by lazy {
        AsyncListDifferDelegationAdapter(
            SimpleDiffCallback(),
            SpellItemDelegatesBuilder.build()
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewBinding.spellsRecyclerView.adapter = delegateAdapter
        viewBinding.spellsRecyclerView.addItemDecoration(
            MarginItemDecoration(
                resources.getDimensionPixelSize(R.dimen.size_16),
                resources.getDimensionPixelSize(R.dimen.size_16),
                resources.getDimensionPixelSize(R.dimen.size_16),
                resources.getDimensionPixelSize(R.dimen.size_16),
            )
        )
        delegateAdapter.items = SpellsRepository().spells
    }
}