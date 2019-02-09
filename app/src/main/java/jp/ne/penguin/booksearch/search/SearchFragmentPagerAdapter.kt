package jp.ne.penguin.booksearch.search

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class SearchFragmentPagerAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm) {
    private val searchConditionsFragment = SearchConditionsFragment()
    private val searchHistoryFragment = SearchHistoryFragment()

    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> return searchConditionsFragment
            1 -> return searchHistoryFragment
            else -> return searchConditionsFragment
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when (position) {
            0 -> return "検索"
            1 -> return "検索履歴"
            else -> return "検索"
        }
    }

    fun refresh() {
        // TODO
    }
}