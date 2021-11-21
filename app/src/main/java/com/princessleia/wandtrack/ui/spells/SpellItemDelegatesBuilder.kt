package com.princessleia.wandtrack.ui.spells

import com.hannesdorfmann.adapterdelegates4.AdapterDelegate
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegateViewBinding
import com.princessleia.wandtrack.R
import com.princessleia.wandtrack.databinding.SpellItemBinding
import com.princessleia.wandtrack.ui.wandtrack.model.Spell

object SpellItemDelegatesBuilder {
    fun build(): AdapterDelegate<List<Spell>> {
        return adapterDelegateViewBinding(
            viewBinding = { inflater, parent ->
                SpellItemBinding.inflate(inflater, parent, false)
            }
        ) {
            bind {
                binding.apply {
                    wandTrack.init(R.dimen.size_64, item)
                    spellItemText.text = item.name
                }
            }
        }
    }
}