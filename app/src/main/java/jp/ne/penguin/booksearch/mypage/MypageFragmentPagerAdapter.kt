package jp.ne.penguin.booksearch.mypage

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class MypageFragmentPagerAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm) {
    private val favoriteFragment = FavoriteFragment()
    private val historyFragment = HistoryFragment()

    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> return favoriteFragment
            1 -> return historyFragment
            else -> return favoriteFragment
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when (position) {
            0 -> return "お気に入り"
            1 -> return "閲覧履歴"
            else -> return "お気に入り"
        }
    }

    fun refresh() {
        // TODO
    }
}