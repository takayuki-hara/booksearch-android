package jp.ne.penguin.booksearch.search

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import jp.ne.penguin.booksearch.R
import kotlinx.android.synthetic.main.fragment_search.*

class SearchFragment : Fragment() {
    companion object {
        fun newInstance() = SearchFragment()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_search, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val fragmentManager : FragmentManager = childFragmentManager
        val adapter = SearchFragmentPagerAdapter(fragmentManager)
        viewPager.adapter = adapter
        viewPager.addOnPageChangeListener(object: ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {}
            override fun onPageScrolled(pos: Int, posOffset: Float, posOffsetPixels: Int) {}
            override fun onPageSelected(pos: Int) {
                adapter.refresh()
            }

        })
        tabLayout.setupWithViewPager(viewPager)
    }
}
