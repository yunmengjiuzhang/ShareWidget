package wangfeixixi.github.com.mosbysample.f

import android.util.Log
import kotlinx.android.synthetic.main.a_fragment.*
import wangfeixixi.github.com.mosbysample.R

import wangfeixixi.github.com.mosbysample.base.BaseF

class AFragment : BaseF<AView, APresent>(), AView {
    private val TAG = "AFragment"

    override fun initContentRes(): Int = R.layout.a_fragment

    override fun initView() {
        tv_name.text = TAG
    }

    override fun initData(firstLoad: Boolean, isVisibleToUser: Boolean) {
        Log.d(TAG, "firstLoad" + firstLoad + "isVisibleToUser" + isVisibleToUser)
        //        presenter.asdfas();
    }

    override fun createPresenter(): APresent {
        return APresent()
    }
}