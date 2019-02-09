package jp.ne.penguin.booksearch.watch


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import jp.ne.penguin.booksearch.R
import kotlinx.android.synthetic.main.fragment_watch.*

class WatchFragment : Fragment() {
    companion object {
        fun newInstance() = WatchFragment()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_watch, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val fragmentManager : FragmentManager = childFragmentManager
        val adapter = WatchFragmentPagerAdapter(fragmentManager)
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
