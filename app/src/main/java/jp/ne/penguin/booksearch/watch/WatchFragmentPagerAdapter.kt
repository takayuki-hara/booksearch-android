package jp.ne.penguin.booksearch.watch

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class WatchFragmentPagerAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm) {
    private val keywordWatchFragment = KeywordWatchFragment()
    private val releaseWatchFragment = ReleaseWatchFragment()

    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> return keywordWatchFragment
            1 -> return releaseWatchFragment
            else -> return keywordWatchFragment
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when (position) {
            0 -> return "キーワード"
            1 -> return "リリース"
            else -> return "キーワード"
        }
    }

    fun refresh() {
        // TODO
    }
}